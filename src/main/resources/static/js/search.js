/**
 * Created by yinwenyao on 20/4/17.
 */
$("#search").click(function(){

     var time1=$("#time1").val();
     var time2=$("#time1").val();
     var select=document.getElementById("form-field-select-4");
     var pro = [];
     for(var i=0;i<select.length;i++){
         if(select.options[i].selected){
             pro.push(select[i].value);
         }
     }
     var totalpro=JSON.stringify(pro);
    alert(totalpro)
    $.ajax({
        type: "POST",
        url: "companysearch",
        data: {time1:time1,time2:time2,totalpro:totalpro},
        async:false,
        success: function(data){

                $("#dynamic-table").html($(data).find("#dynamic-table").html());
                // var myTable = $('#dynamic-table')
                //     .DataTable( {
                //         destroy : true,
                //         language: {
                //             "sProcessing": "处理中...",
                //             "sLengthMenu": "显示 _MENU_ 项结果",
                //             "sZeroRecords": "没有匹配结果",
                //             "sInfo": "显示第 _START_ 至 _END_ 项结果，共 _TOTAL_ 项",
                //             "sInfoEmpty": "显示第 0 至 0 项结果，共 0 项",
                //             "sInfoFiltered": "(由 _MAX_ 项结果过滤)",
                //             "sInfoPostFix": "",
                //             "sSearch": "搜索:",
                //             "sUrl": "",
                //             "sEmptyTable": "表中数据为空",
                //             "sLoadingRecords": "载入中...",
                //             "sInfoThousands": ",",
                //             "oPaginate": {
                //                 "sFirst": "首页",
                //                 "sPrevious": "上页",
                //                 "sNext": "下页",
                //                 "sLast": "末页"
                //             },
                //             "oAria": {
                //                 "sSortAscending": ": 以升序排列此列",
                //                 "sSortDescending": ": 以降序排列此列"
                //             }
                //         },
                //         bAutoWidth: false,
                //         "aoColumns": [
                //             { "bSortable": false },
                //             null, null,null, null, null,null,null,null,null,null,null
                //         ],
                //         "aaSorting": [],
                //         select: {
                //             style: 'multi'
                //         }
                //     } );
                // $.fn.dataTable.Buttons.defaults.dom.container.className = 'dt-buttons btn-overlap btn-group btn-overlap';
                //
                // new $.fn.dataTable.Buttons( myTable, {
                //     buttons: [
                //         {
                //             "extend": "colvis",
                //             "text": "<i class='fa fa-search bigger-110 blue'></i> <span class='hidden'>Show/hide columns</span>",
                //             "className": "btn btn-white btn-primary btn-bold",
                //             columns: ':not(:first)'
                //         },
                //         {
                //             "extend": "copy",
                //             "text": "<i class='fa fa-copy bigger-110 pink'></i> <span class='hidden'>Copy to clipboard</span>",
                //             "className": "btn btn-white btn-primary btn-bold"
                //         },
                //         {
                //             "extend": "csv",
                //             "text": "<i class='fa fa-database bigger-110 orange'></i> <span class='hidden'>Export to CSV</span>",
                //             "className": "btn btn-white btn-primary btn-bold",
                //             "sCharSet": "utf16le",
                //             "bBomInc": true,
                //             "sFieldSeperator": "\t"
                //         },
                //         {
                //             "extend": "print",
                //             "text": "<i class='fa fa-print bigger-110 grey'></i> <span class='hidden'>Print</span>",
                //             "className": "btn btn-white btn-primary btn-bold",
                //             autoPrint: false,
                //             message: 'This print was produced using the Print button for DataTables'
                //         }
                //     ]
                // } );
                // myTable.buttons().container().appendTo( $('.tableTools-container') );
                //
                // //style the message box
                // var defaultCopyAction = myTable.button(1).action();
                // myTable.button(1).action(function (e, dt, button, config) {
                //     defaultCopyAction(e, dt, button, config);
                //     $('.dt-button-info').addClass('gritter-item-wrapper gritter-info gritter-center white');
                // });
                //
                //
                // var defaultColvisAction = myTable.button(0).action();
                // myTable.button(0).action(function (e, dt, button, config) {
                //
                //     defaultColvisAction(e, dt, button, config);
                //
                //
                //     if($('.dt-button-collection > .dropdown-menu').length == 0) {
                //         $('.dt-button-collection')
                //             .wrapInner('<ul class="dropdown-menu dropdown-light dropdown-caret dropdown-caret" />')
                //             .find('a').attr('href', '#').wrap("<li />")
                //     }
                //     $('.dt-button-collection').appendTo('.tableTools-container .dt-buttons')
                // });
                //
                // setTimeout(function() {
                //     $($('.tableTools-container')).find('a.dt-button').each(function() {
                //         var div = $(this).find(' > div').first();
                //         if(div.length == 1) div.tooltip({container: 'body', title: div.parent().text()});
                //         else $(this).tooltip({container: 'body', title: $(this).text()});
                //     });
                // }, 500);
                //
                // myTable.on( 'select', function ( e, dt, type, index ) {
                //     if ( type === 'row' ) {
                //         $( myTable.row( index ).node() ).find('input:checkbox').prop('checked', true);
                //     }
                // } );
                // myTable.on( 'deselect', function ( e, dt, type, index ) {
                //     if ( type === 'row' ) {
                //         $( myTable.row( index ).node() ).find('input:checkbox').prop('checked', false);
                //     }
                // } );
                //
                // //table checkboxes
                // $('th input[type=checkbox], td input[type=checkbox]').prop('checked', false);
                //
                // //select/deselect all rows according to table header checkbox
                // $('#dynamic-table > thead > tr > th input[type=checkbox], #dynamic-table_wrapper input[type=checkbox]').eq(-1).on('click', function(){
                //     var th_checked = this.checked;//checkbox inside "TH" table header
                //     $('#dynamic-table').find('tbody > tr').each(function(){
                //         var row = this;
                //         if(th_checked) myTable.row(row).select();
                //         else  myTable.row(row).deselect();
                //     });
                // });

            }

    });
});