

layui.use(['form','layer','table','excel','jquery'],function(){
    var form = layui.form,
        layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery,
        excel = layui.excel,
        laytpl = layui.laytpl,
        table = layui.table;


    //问卷列表
    var tableIns = table.render({
        elem: '#questionnaireList',
        url : 'toquestionnaireList',
        toolbar: 'true', //开启工具栏
        cellMinWidth : 90,
        page : true,
        height : "full-200",
        limits : [10,15,20,25],
        limit : 10,
        id : "newsListTable",
        cols : [[
            {type: "checkbox", fixed:"left", width:50},
            {field: 'questionnaireid', title: 'ID', minWidth:50, align:"center"},
            {field: 'user', title: '姓名', minWidth:100, edit: 'text', align:"center"},
            {field: 'sex', title: '性别', minWidth:100, edit: 'text', align:"center"},
            {field: 'age', title: '年龄', minWidth:80, edit: 'text', align:'center'},
            {field: 'province', title: '省份', minWidth:150, edit: 'text', align:'center'},
            {field: 'citie', title: '城市', minWidth:150, edit: 'text', align:'center'},
            {field: 'area', title: '地区', minWidth:150, edit: 'text', align:'center'},
            {field: 'famerType', title: '农民类型', minWidth:200, edit: 'text', align:'center'},
            {field: 'harvestGrain', title: '收获粮食', minWidth:200, edit: 'text', align:'center'},
            {field: 'surplusGrain', title: '每年存粮', minWidth:200, edit: 'text', align:'center'},
            {field: 'averageGrainDay', title: '每年存粮天数', minWidth:200, edit: 'text', align:'center'},
            {field: 'purposeGrain', title: '粮食用途', minWidth:200, edit: 'text', align:'center'},
            {field: 'reason', title: '不存粮原因', minWidth:250, edit: 'text', align:"center"},
            {field: 'tools', title: '是否了解储粮装具', minWidth:200, edit: 'text', align:"center"},
            {field: 'toolsEvaluate', title: '之前储粮装具评价', minWidth:250, edit: 'text', align:"center"},
            {field: 'toolsUse', title: '储粮装具的使用', minWidth:250, edit: 'text', align:"center"},
            {field: 'supportTool', title: '国家支持购买储粮装具', minWidth:150, edit: 'text', align:"center"},
            {field: 'toolType', title: '储粮装具大小', minWidth:250, edit: 'text', align:"center"},
            {field: 'toolNum', title: '购买装具数量', minWidth:100, edit: 'text', align:"center"},
            {field: 'notBuyReason', title: '不买装具原因', minWidth:250, edit: 'text', align:"center"},
            {title: '操作', minWidth:100, templet:'#userListBar',fixed:"right" , align:"center"}
        ]]

    });

    //搜索
    $('#serachBtn').on("click",function(){
        var demoReload = $('#demoReload');
        if(demoReload.val() != ''){
            table.reload('newsListTable',{
                page: {
                    curr: 1 //重新从第 1 页开始
                },
                where: {
                    user: demoReload.val()  //搜索的关键字
                }
            })
        }else{
            layer.msg("请输入搜索的内容");
        }
    });



    //添加
    function addQuestionnaire(edit){
        var index = layui.layer.open({
            title : "添加问卷信息",
            type : 2,
            content : "toAddQuestionnaire",
            success : function(layero, index){
                setTimeout(function(){
                    layui.layer.tips('点击此处返回用问卷信息列表', '.layui-layer-setwin .layui-layer-close', {
                        tips: 3
                    });
                },500)
            }
        })
        layui.layer.full(index);
        window.sessionStorage.setItem("index",index);
        //改变窗口大小时，重置弹窗的宽高，防止超出可视区域（如F12调出debug的操作）
        $(window).on("resize",function(){
            layui.layer.full(window.sessionStorage.getItem("index"));
        })
    }

    $(".addNews_btn").click(function(){
        addQuestionnaire();
    })

    //批量删除
    $(".delAll_btn").click(function(){
        var checkStatus = table.checkStatus('newsListTable'),
            data = checkStatus.data,
            newsId = [];
        if(data.length > 0) {
            for (var i in data) {
                newsId.push(data[i].questionnaireid);
            }
            //console.log(typeof newsId);
            layer.confirm('确定删除选中的用户？', {icon: 3, title: '提示信息'}, function (index) {
                $.post("deletequestionnaire",{
                    newsId : newsId.join(",")  //将需要删除的newsId作为参数传入
                },function(data){
                    parent.window.location.reload();
                })
            })
        }else{
            layer.msg("请选择需要删除的用户");
        }
    })

    /*一次性将问卷信息表格全部导出*/
    table.on('toolbar(userList)',function (obj) {

          var layEvent = obj.event;
         if(layEvent === 'LAYTABLE_EXPORT')
         {
            layer.alert('正在导出，请稍等！');
            $.ajax({
                url : 'toQuestionnaireExcel',
                dataType: 'json',
                success: function(res) {
                    console.log(res.data);
                    // 1. 数组头部新增表头
                    res.data.unshift({
                        questionnaireid: 'ID',
                        user: '姓名',
                        age: '年龄',
                        sex: '性别',
                        province: '省份',
                        citie: '城市',
                        area: '地区',
                        famerType: '农民类型',
                        harvestGrain: '收获粮食',
                        surplusGrain: '每年存粮',
                        averageGrainDay: '每年存粮天数',
                        purposeGrain: '粮食用途',
                        reason: '不存粮原因',
                        tools: '是否了解储粮装具',
                        toolsEvaluate: '之前储粮装具评价',
                        toolsUse: '每年存粮',
                        supportTool: '国家支持购买储量装具',
                        toolType: '储粮装具大小',
                        toolNum: '购买装具数量',
                        notBuyReason: '不买装具原因'
                    });

                    // 2.调整顺序，执行梳理函数
                    var data = excel.filterExportData(res.data, [
                        'questionnaireid',
                        'user' ,
                        'age' ,
                        'sex' ,
                        'province' ,
                        'citie' ,
                        'area' ,
                        'famerType' ,
                        'harvestGrain',
                        'surplusGrain',
                        'averageGrainDay' ,
                        'purposeGrain' ,
                        'reason' ,
                        'tools' ,
                        'toolsEvaluate' ,
                        'toolsUse' ,
                        'supportTool' ,
                        'toolType' ,
                        'toolNum' ,
                        'notBuyReason'
                    ]);

                    // 3. 执行导出函数，系统会弹出弹框
                    excel.exportExcel({
                        sheet1: data
                    }, '农户储粮问卷信息.xlsx', 'xlsx');
                }
            })
         }

    })



    var information={};
    //监听单元格编辑数据
    table.on('edit(userList)', function(obj){
        var value = obj.value //得到修改后的值
            ,data1 = obj.data //得到所在行所有键值
            ,field = obj.field //得到字段

        var information={
            'questionnaireid':data1.questionnaireid

        };
        //var news = data.questionnaireid+'_'+field+'_'+value;
        //info.push(news);
        information[field] = data1[field];
        layer.msg('[ID: '+ data1.questionnaireid +']的信息更改为：'+ value);
        $.ajax({
            url:"updateQuestionnaire",
            type:'post',//method请求方式，get或者post
            dataType:'json',//预期服务器返回的数据类型
            data:JSON.stringify(information),//表格数据序列化
            contentType: "application/json; charset=utf-8",
            success:function(res){//res为相应体,function为回调函数
                if(res.res){
                    layer.msg(res.msg, {
                        time: 2000 //2秒关闭（如果不配置，默认是3秒）
                    }, function(){
                        parent.window.location.reload();
                    });
                }else {
                    layer.msg(res.msg, {
                        time: 2000 //2秒关闭（如果不配置，默认是3秒）
                    }, function(){
                        parent.window.location.reload();
                    });
                }
            },
            error:function (res) {
                layer.msg("出现未知错误，请重新输入！", {
                    time: 2000 //2秒关闭（如果不配置，默认是3秒）
                }, function(){
                    parent.window.location.reload();
                });
            }
        })
    });

    //列表操作
    table.on('tool(userList)', function(obj){
        var layEvent = obj.event,
            data = obj.data;

           if(layEvent === 'del'){ //删除
              layer.confirm('确定删除此用户？',{icon:3, title:'提示信息'},function(index){
                $.post("deletequestionnaire",{
                    newsId : data.questionnaireid  //将需要删除的newsId作为参数传入
                },function(data){
                    parent.window.location.reload();
                })
              });
        }/*else if(layEvent === 'LAYTABLE_EXPORT'){
               layer.alert('Hi，头部工具栏扩展的右侧图标。');
           }*/
    });

})
