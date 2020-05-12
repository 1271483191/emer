var areaData = address;
var $form;
var form;
var $;

layui.config({
    base : "../../js/"
}).use(['form','layer','upload','laydate'],function(){
    form = layui.form;
    var layer = parent.layer === undefined ? layui.layer : parent.layer;
    $ = layui.jquery;
    $form = $('form');
    upload = layui.upload;
    laydate = layui.laydate;
    loadProvince(); //加载省信息

    //日期时间选择器
    laydate.render({
        elem: '#userBirthday'
        ,type: 'datetime'
    });

    /*农民类型动态事件*/
    form.on('select(famerType)',function(data){
        //console.log(data.value);
        if(data.value == "famerType_other"){
            $("#famerType2").show();
        }else{
            $("#famerType2").hide();
        }
        form.render();
    })

    /*联动效应*/
    form.on('select(famerType2)',function(data){
        //console.log(data.value);
        if(data.value == "famerType2_other"){
            $("#famerType3").show();
        }else{
            $("#famerType3").hide();
        }
        form.render();
    })

    /*存粮用途动态事件*/
    form.on('select(purposeGrain)',function(data){
        //console.log(data.value);
        if(data.value == "purposeGrain_other"){
            $("#purposeGrain2").show();
        }else{
            $("#purposeGrain2").hide();
        }
        form.render();
    })

    /*国家支持购买储量装具动态事件*/
    form.on('radio(supportTool)', function(data){
    // console.log(data.value); //被点击的radio的value值
        if(data.value == "supportTool_other"){
            $("#supportTool2").show();
        }else{
            $("#supportTool2").hide();
        }
        form.render();
    });


    /*不存粮原因动态事件*/
    form.on('select(reason)',function(data){
       // console.log(data.value);
        if(data.value == "reason_other"){
            $("#reason2").show();
        }else{
            $("#reason2").hide();
        }
        form.render();
    })

    /*是否了解储粮装具动态事件*/
    form.on('select(tools)',function(data){
       // console.log(data.value);
        if(data.value == "tools_other"){
            $("#tools2").show();
        }else{
            $("#tools2").hide();
        }
        form.render();
    })


    /*购买储粮工具大小动态事件*/
    form.on('radio(toolType)', function(data){
        if(data.value == "toolType_other"){
            $("#toolType2").show();
        }else{
            $("#toolType2").hide();
        }
        form.render();
    });

    /*购买装具数量动态事件*/
    form.on('radio(toolNum)', function(data){
        if(data.value == "toolNum_other"){
            $("#toolNum2").show();
        }else{
            $("#toolNum2").hide();
        }
        form.render();
    });

    /*不买装具原因动态事件*/
    form.on('select(notBuyReason)',function(data){
        //console.log(data.value);
        if(data.value == "notBuyReason_other"){
            $("#notBuyReason2").show();
        }else{
            $("#notBuyReason2").hide();
        }
        form.render();
    })

    //提交数据
    form.on("submit(changeUser)",function(data1){
        var index = layer.msg('提交中，请稍候',{icon: 16,time:false,shade:0.8});


        var famerType1 = data1.field.famerType == "famerType_other" ? data1.field.famerType2 : data1.field.famerType;
        var famerType = famerType1 == "famerType2_other" ? data1.field.famerType3 : famerType1;

        var purposeGrain = data1.field.purposeGrain == "purposeGrain_other" ? data1.field.purposeGrain2 : data1.field.purposeGrain;
        var reason = data1.field.reason == "reason_other" ? data1.field.reason2 : data1.field.reason;
        var tools = data1.field.tools == "tools_other" ? data1.field.tools2 : data1.field.tools;
        var supportTool =  data1.field.supportTool == "supportTool_other" ? data1.field.supportTool2 : data1.field.supportTool;
        var toolType =  data1.field.toolType == "toolType_other" ? data1.field.toolType2 : data1.field.toolType;
        var toolNum =  data1.field.toolNum == "toolNum_other" ? data1.field.toolNum2 : data1.field.toolNum;
        var notBuyReason = data1.field.notBuyReason == "notBuyReason_other" ? data1.field.notBuyReason2 : data1.field.notBuyReason;

        var userInfoHtml = {
            'user': $(".user").val(),
            'sex' : data1.field.sex,
            'age' : $(".age").val(),

            'province' : data1.field.province,
            'citie' : data1.field.city,
            'area' : data1.field.area,

            'famerType' : famerType,
            'harvestGrain' : $(".harvestGrain").val(),
            'surplusGrain' : $(".surplusGrain").val(),
            'averageGrainDay' : $(".averageGrainDay").val(),
            'purposeGrain' : purposeGrain,

            'reason' : reason,
            'tools' : tools,
            'toolsEvaluate' : $(".toolsEvaluate").val(),

            'toolsUse' : $(".toolsUse").val(),
            'supportTool' : supportTool,

            'toolType' : toolType,
            'toolNum' : toolNum,
            'notBuyReason' : notBuyReason
        };

          $.ajax({
            url:"addQuestionnaireList",
            type:'post',//method请求方式，get或者post
            dataType:'json',//预期服务器返回的数据类型
            data:JSON.stringify(userInfoHtml),//表格数据序列化
            contentType: "application/json; charset=utf-8",
            success:function(res){//res为相应体,function为回调函数
                debugger
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
                debugger
                layer.msg("出现未知错误，请重新输入！", {
                    time: 2000 //2秒关闭（如果不配置，默认是3秒）
                }, function(){
                    parent.window.location.reload();
                });
            }
        })
        //  console.log(userInfoHtml);
        return false;
    });
 });

//加载省数据
function loadProvince() {
    var proHtml = '';
    for (var i = 0; i < areaData.length; i++) {
        proHtml += '<option value="' + areaData[i].provinceCode + '_' + areaData[i].mallCityList.length + '_' + i +'_'+ areaData[i].provinceName +'">' + areaData[i].provinceName + '</option>';
        //proHtml += '<option value="' + areaData[i].provinceName +'">' + areaData[i].provinceName + '</option>';
    }
    //初始化省数据
    $form.find('select[name=province]').append(proHtml);
    form.render();
    form.on('select(province)', function(data) {
        $form.find('select[name=area]').html('<option value="">请选择县/区</option>');
        var value = data.value;
        var d = value.split('_');
        var code = d[0];
        var count = d[1];
        var index = d[2];
        if (count > 0) {
            loadCity(areaData[index].mallCityList);
        } else {
            $form.find('select[name=city]').attr("disabled","disabled");
        }
    });
}
//加载市数据
function loadCity(citys) {
    var cityHtml = '<option value="">请选择市</option>';
    for (var i = 0; i < citys.length; i++) {
        cityHtml += '<option value="' + citys[i].cityCode + '_' + citys[i].mallAreaList.length + '_' + i + '_'+ citys[i].cityName + '">' + citys[i].cityName + '</option>';
    }
    $form.find('select[name=city]').html(cityHtml).removeAttr("disabled");
    form.render();
    form.on('select(city)', function(data) {
        var value = data.value;
        var d = value.split('_');
        var code = d[0];
        var count = d[1];
        var index = d[2];
        if (count > 0) {
            loadArea(citys[index].mallAreaList);
        } else {
            $form.find('select[name=area]').attr("disabled","disabled");
        }
    });
}
//加载县/区数据
function loadArea(areas) {
    var areaHtml = '<option value="">请选择县/区</option>';
    for (var i = 0; i < areas.length; i++) {
        areaHtml += '<option value="' + areas[i].areaCode +'_'+ areas[i].areaName + '">' + areas[i].areaName + '</option>';
    }
    $form.find('select[name=area]').html(areaHtml).removeAttr("disabled");
    form.render();
    form.on('select(area)', function(data) {});
}