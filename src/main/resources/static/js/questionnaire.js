layui.use(['form','layer','table','laytpl' ],function(){
    var form = layui.form,
        layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery,
        laytpl = layui.laytpl,
        table = layui.table;

    //问卷列表
    var tableIns = table.render({
        elem: '#questionnaireList',
        url : 'toquestionnaireList',
        toolbar: 'default', //开启工具栏
        cellMinWidth : 90,
        page : true,
        height : "full-200",
        limits : [10,15,20,25],
        limit : 10,
        id : "newsListTable",
        cols : [[
            {type: "checkbox", fixed:"left", width:50},
            {field: 'questionnaireid', title: 'ID', minWidth:50, align:"center"},
            {field: 'user', title: '姓名', minWidth:100, align:"center"},
            {field: 'sex', title: '性别', minWidth:100, align:"center"},
            {field: 'age', title: '年龄', minWidth:80, align:'center'},
            {field: 'province', title: '省份', minWidth:150, align:'center'},
            {field: 'citie', title: '城市', minWidth:150, align:'center'},
            {field: 'area', title: '地区', minWidth:150, align:'center'},
            {field: 'famerType', title: '农民类型', minWidth:200, align:'center'},
            {field: 'harvestGrain', title: '收获粮食', minWidth:200, align:'center'},
            {field: 'surplusGrain', title: '每年存粮', minWidth:200, align:'center'},
            {field: 'averageGrainDay', title: '每年存粮天数', minWidth:200, align:'center'},
            {field: 'purposeGrain', title: '粮食用途', minWidth:200, align:'center'},
            {field: 'reason', title: '不存粮原因', minWidth:250, align:"center"},
            {field: 'tools', title: '是否了解储粮装具', minWidth:200, align:"center"},
            {field: 'toolsEvaluate', title: '之前储粮装具评价', minWidth:250, align:"center"},
            {field: 'toolsUse', title: '储粮装具的使用', minWidth:250, align:"center"},
            {field: 'supportTool', title: '国家支持购买储量装具', minWidth:150, align:"center"},
            {field: 'toolType', title: '储粮工具大小', minWidth:250, align:"center"},
            {field: 'toolNum', title: '购买装具数量', minWidth:100, align:"center"},
            {field: 'notBuyReason', title: '不买装具原因', minWidth:250, align:"center"},
            {title: '操作', minWidth:150, templet:'#userListBar',fixed:"right",align:"center"}
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
                var body = layui.layer.getChildFrame('body', index);
                if(edit){
                    body.find(".user").val(edit.user);
                    body.find(".sex").val(edit.sex);
                    body.find(".age").val(edit.age);
                    body.find(".province").val(edit.age);
                    body.find(".city").val(edit.age);
                    body.find(".area").val(edit.age);

                    body.find(".famerType").val(edit.famerType);
                    body.find(".harvestGrain").val(edit.harvestGrain);
                    body.find(".surplusGrain").val(edit.surplusGrain);
                    body.find(".averageGrainDay").val(edit.averageGrainDay);

                    body.find(".clientSex input[value="+edit.clientSex+"]").prop("checked","checked");  //性别
                    body.find(".clientGrade").val(edit.clientGrade);  //会员等级
                    body.find(".enterTime").val(edit.enterTime);    //录入时间
                    body.find(".introduce").text(edit.introduce);    //用户简介
                    form.render();
                }
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
                newsId.push(data[i].clientID);
            }
            console.log(typeof newsId);
            layer.confirm('确定删除选中的用户？', {icon: 3, title: '提示信息'}, function (index) {
                $.post("../client/deleteCilentList.do",{
                    newsId : newsId.join(",")  //将需要删除的newsId作为参数传入
                },function(data){
                    tableIns.reload();
                    layer.close(index);
                })
            })
        }else{
            layer.msg("请选择需要删除的用户");
        }
    })

    //列表操作
    table.on('tool(userList)', function(obj){
        var layEvent = obj.event,
            data = obj.data;

        if(layEvent === 'edit'){ //编辑

            $.post('updataQuestionnaire',{clientID:data.clientID},function(str){
                addQuestionnaire(data);
            })

        }else if(layEvent === 'del'){ //删除
            layer.confirm('确定删除此用户？',{icon:3, title:'提示信息'},function(index){
                $.post("../client/deleteCilentList.do",{
                    newsId : data.clientID  //将需要删除的newsId作为参数传入
                },function(data){
                    tableIns.reload();
                    layer.close(index);
                })
            });
        }
    });

})
