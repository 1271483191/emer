/**
 * Created by yinwenyao on 20/4/17.
 */
jQuery(function($) {

    //select
    if(!ace.vars['touch']) {
        $('.chosen-select').chosen({allow_single_deselect:true});
        //resize the chosen on window resize

        $(window)
            .off('resize.chosen')
            .on('resize.chosen', function() {
                $('.chosen-select').each(function() {
                    var $this = $(this);
                    $this.next().css({'width': $this.parent().width()});
                })
            }).trigger('resize.chosen');
        //resize chosen on sidebar collapse/expand
        $(document).on('settings.ace.chosen', function(e, event_name, event_val) {
            if(event_name != 'sidebar_collapsed') return;
            $('.chosen-select').each(function() {
                var $this = $(this);
                $this.next().css({'width': $this.parent().width()});
            })
        });


        $('#chosen-multiple-style .btn').on('click', function(e){
            var target = $(this).find('input[type=radio]');
            var which = parseInt(target.val());
            if(which == 2) $('#form-field-select-4').addClass('tag-input-style');
            else $('#form-field-select-4').removeClass('tag-input-style');
        });
    }

    $("#search").click(function(){

        var time1=$("#time1").val();
        var time2=$("#time2").val();
        var select=document.getElementById("form-field-select-4");
        var pro = [];
        for(var i=0;i<select.length;i++){
            if(select.options[i].selected){
                pro.push(select[i].value);
            }
        }
        var totalpro=JSON.stringify(pro);
        $.ajax({
            type: "POST",
            url: "companysearchBytime",
            data: {time1:time1,time2:time2,totalpro:totalpro},
            async:false,
            success: function(data){
                $("#dynamic-table").html($(data).find("#dynamic-table").html());
                initnewAttributeTable();

            }

        });
    });

    initnewAttributeTable();


    function initnewAttributeTable() {
        var myTable =
            $('#dynamic-table')
            //.wrap("<div class='dataTables_borderWrap' />")   //if you are applying horizontal scrolling (sScrollX)
                .DataTable({
                    scrollX: true,
                    scrollCollapse: true,
                    bPaginate: true,
                    language: {
                        "sProcessing": "处理中...",
                        "sLengthMenu": "显示 _MENU_ 项结果",
                        "sZeroRecords": "没有匹配结果",
                        "sInfo": "显示第 _START_ 至 _END_ 项结果，共 _TOTAL_ 项",
                        "sInfoEmpty": "显示第 0 至 0 项结果，共 0 项",
                        "sInfoFiltered": "(由 _MAX_ 项结果过滤)",
                        "sInfoPostFix": "",
                        "sSearch": "搜索:",
                        "sUrl": "",
                        "sEmptyTable": "表中数据为空",
                        "sLoadingRecords": "载入中...",
                        "sInfoThousands": ",",
                        "oPaginate": {
                            "sFirst": "首页",
                            "sPrevious": "上页",
                            "sNext": "下页",
                            "sLast": "末页"
                        },
                        "oAria": {
                            "sSortAscending": ": 以升序排列此列",
                            "sSortDescending": ": 以降序排列此列"
                        }
                    },
                    bAutoWidth: false,
                    "destroy":true,
                    "aoColumns": [
                        {"bSortable": false},
                        null, null, null, null, null, null, null,null
                    ],
                    "aaSorting": [],

                    select: {
                        style: 'multi'
                    }
                });


        $.fn.dataTable.Buttons.defaults.dom.container.className = 'dt-buttons btn-overlap btn-group btn-overlap';

        new $.fn.dataTable.Buttons(myTable, {
            buttons: [
                {
                    "extend": "colvis",
                    "text": "<i class='fa fa-search bigger-110 blue'></i> <span class='hidden'>展示/隐藏 列名</span>",
                    "className": "btn btn-white btn-primary btn-bold",
                    columns: ':not(:first):not(:last)'
                },
                {
                    "extend": "copy",
                    "text": "<i class='fa fa-copy bigger-110 pink'></i> <span class='hidden'>复制到剪贴板</span>",
                    "className": "btn btn-white btn-primary btn-bold"
                },
                {
                    "extend": "csv",
                    "text": "<i class='fa fa-database bigger-110 orange'></i> <span class='hidden'>导出CSV文件</span>",
                    "className": "btn btn-white btn-primary btn-bold"
                },
                // {
                //      "extend": "excel",
                //      "text": "<i class='fa fa-file-excel-o bigger-110 green'></i> <span class='hidden'>导出Excel文件</span>",
                //      "className": "btn btn-white btn-primary btn-bold",
                //     exportOptions: { //从DataTable中选择要收集的数据。这包括列、行、排序和搜索的选项。
                //         "columns": [0, 1, 3, 4, 5, 6, 7, 8],//设置需要导出的列索引
                //         'format': { //用于导出将使用的单元格格式化函数的容器对象 format有三个子标签，header，body和foot
                //             'header': function (data, columnIdx) {
                //                 return data;
                //             },
                //             "body": function (data, columnIndex, rowIndex, node) { //body区域的function，可以操作需要导出excel的数据格式
                //                 if (columnIndex > 2 && (data == "" || data == null)) {
                //                     return "3";
                //                 } else {
                //                     return data;
                //                 }
                //             }
                //         }
                //     }
                //
                // },
                {
                    "extend": "print",
                    "text": "<i class='fa fa-print bigger-110 grey'></i> <span class='hidden'>打印</span>",
                    "className": "btn btn-white btn-primary btn-bold",
                    autoPrint: false,
                    message: 'This print was produced using the Print button for DataTables'
                }
            ]
        });
        myTable.buttons().container().appendTo($('.tableTools-container'));

//style the message box
        var defaultCopyAction = myTable.button(1).action();
        myTable.button(1).action(function (e, dt, button, config) {
            defaultCopyAction(e, dt, button, config);
            $('.dt-button-info').addClass('gritter-item-wrapper gritter-info gritter-center white');
        });


        var defaultColvisAction = myTable.button(0).action();
        myTable.button(0).action(function (e, dt, button, config) {

            defaultColvisAction(e, dt, button, config);


            if ($('.dt-button-collection > .dropdown-menu').length == 0) {
                $('.dt-button-collection')
                    .wrapInner('<ul class="dropdown-menu dropdown-light dropdown-caret dropdown-caret" />')
                    .find('a').attr('href', '#').wrap("<li />")
            }
            $('.dt-button-collection').appendTo('.tableTools-container .dt-buttons')
        });

        //点击编辑图标出现编辑框
        $("#dynamic-table tbody").unbind('click').on("click", ".edit-btn", function () {
            var tds = $(this).parents("tr").children();
            var i;
            $.each(tds, function (i, val) {
                var jqob = $(val);
                var txt = jqob.text();
                if (i > 1 && i< tds.length-1) {
                    var put = $("<input type='text' class='form-control' style='width:100%'>");
                    put.val(txt);
                    jqob.html(put);
                }
            });
            $(this).toggleClass("edit-btn fa-pencil");
            $(this).toggleClass("save-btn fa-save");
        });
        //保存按钮
        $("#dynamic-table tbody").on("click", ".save-btn", function () {
            var tds = $(this).parents("tr").children();
            var id = tds.eq(1).text();
            var sTds = tds.length;
            var lisval = [];
            for (var i = 2; i < sTds; i++) {
                if (i < sTds - 1)
                    lisval.push(tds.eq(i).children("input").val());
            }
            if (i == sTds - 1) lisval.push();
            $.each(tds, function (i, val) {
                var jqob = $(val);
                //把input变为字符串
                if (!jqob.has('i').length) {
                    var txt = jqob.children("input").val();
                    jqob.html(txt);
                }
            });
            $(this).toggleClass("edit-btn fa-pencil");
            $(this).toggleClass("save-btn fa-save");
            //保存数据
            SaveData(lisval, id);
        });

        //设置保存信息
        function SaveData(msg, id) {
            var companyId = id;
            var name = msg[0];
            var area = msg[1].split(",")
            var province = "";
            var city = "";
            var county = "";
            if (area.length > 0) {
                province = area[0];
            }
            if (area.length > 1) {
                city = area[1];
            }
            if (area.length > 2) {
                county = area[2];
            }
            var socialId = msg[2];
            var location = msg[3];
            var principal = msg[4];
            var phone = msg[5];
            $.ajax({
                type: "POST",
                url: "CompanySearchUpdate",
                data: {companyId:companyId,name:name,province:province,city:city,county:county,socialId:socialId,location:location,principal:principal,phone:phone},
                async:false,
                success: function(data){
                    // initnewAttributeTable();
                },
            });
        }
        //设置删除
        $("#dynamic-table tbody").on("click", ".del-btn", function () {
            var tds = $(this).parents("tr").children();
            var id = tds.eq(1).text();
            var r=confirm("确认删除数据？")
            var $tr=$(this).parents("tr");
            if (r==true)
            {
                $.ajax({
                    type: "POST",
                    url: "CompanySearchDelete",
                    data: {companyId:id},
                    async:false,
                    success: function(data){;
                        $tr.empty()
                        $tr.remove();
                    },
                });
            }
        });

////

        setTimeout(function () {
            $($('.tableTools-container')).find('a.dt-button').each(function () {
                var div = $(this).find(' > div').first();
                if (div.length == 1) div.tooltip({container: 'body', title: div.parent().text()});
                else $(this).tooltip({container: 'body', title: $(this).text()});
            });
        }, 500);

        myTable.on('select', function (e, dt, type, index) {
            if (type === 'row') {
                $(myTable.row(index).node()).find('input:checkbox').prop('checked', true);
            }
        });
        myTable.on('deselect', function (e, dt, type, index) {
            if (type === 'row') {
                $(myTable.row(index).node()).find('input:checkbox').prop('checked', false);
            }
        });


/////////////////////////////////
//table checkboxes
        $('th input[type=checkbox], td input[type=checkbox]').prop('checked', false);

//select/deselect all rows according to table header checkbox
        $('#dynamic-table > thead > tr > th input[type=checkbox], #dynamic-table_wrapper input[type=checkbox]').eq(0).on('click', function () {
            var th_checked = this.checked;//checkbox inside "TH" table header

            $('#dynamic-table').find('tbody > tr').each(function () {
                var row = this;
                if (th_checked) myTable.row(row).select();
                else  myTable.row(row).deselect();
            });
        });

//select/deselect a row when the checkbox is checked/unchecked
        $('#dynamic-table').on('click', 'td input[type=checkbox]', function () {
            var row = $(this).closest('tr').get(1);
            if (this.checked) myTable.row(row).deselect();
            else myTable.row(row).select();
        });


        $(document).on('click', '#dynamic-table .dropdown-toggle', function (e) {
            e.stopImmediatePropagation();
            e.stopPropagation();
            e.preventDefault();
        });


//And for the first simple table, which doesn't have TableTools or dataTables
//select/deselect all rows according to table header checkbox
        var active_class = 'active';
        $('#simple-table > thead > tr > th input[type=checkbox]').eq(0).on('click', function () {
            var th_checked = this.checked;//checkbox inside "TH" table header

            $(this).closest('table').find('tbody > tr').each(function () {
                var row = this;
                if (th_checked) $(row).addClass(active_class).find('input[type=checkbox]').eq(0).prop('checked', true);
                else $(row).removeClass(active_class).find('input[type=checkbox]').eq(0).prop('checked', false);
            });
        });

//select/deselect a row when the checkbox is checked/unchecked
        $('#simple-table').on('click', 'td input[type=checkbox]', function () {
            var $row = $(this).closest('tr');
            if ($row.is('.detail-row ')) return;
            if (this.checked) $row.addClass(active_class);
            else $row.removeClass(active_class);
        });
    }
})

