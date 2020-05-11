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
    })

    /*联动效应*/
    form.on('select(famerType2)',function(data){
        //console.log(data.value);
        if(data.value == "famerType2_other"){
            $("#famerType3").show();
        }else{
            $("#famerType3").hide();
        }
    })

    /*存粮用途动态事件*/
    form.on('select(purposeGrain)',function(data){
        //console.log(data.value);
        if(data.value == "purposeGrain_other"){
            $("#purposeGrain2").show();
        }else{
            $("#purposeGrain2").hide();
        }
    })

    /*国家支持购买储量装具动态事件*/
    form.on('radio(supportTool)', function(data){
//			    console.log(data.value); //被点击的radio的value值
        if(data.value == "supportTool_other"){
            $("#supportTool2").show();
        }else{
            $("#supportTool2").hide();
        }
    });


    /*不存粮原因动态事件*/
    form.on('select(reason)',function(data){
       // console.log(data.value);
        if(data.value == "reason_other"){
            $("#reason2").show();
        }else{
            $("#reason2").hide();
        }
    })

    /*是否了解储粮装具动态事件*/
    form.on('select(tools)',function(data){
       // console.log(data.value);
        if(data.value == "tools_other"){
            $("#tools2").show();
        }else{
            $("#tools2").hide();
        }
    })


    /*购买储粮工具大小动态事件*/
    form.on('radio(toolType)', function(data){
        if(data.value == "toolType_other"){
            $("#toolType2").show();
        }else{
            $("#toolType2").hide();
        }
    });

    /*购买装具数量动态事件*/
    form.on('radio(toolNum)', function(data){
        if(data.value == "toolNum_other"){
            $("#toolNum2").show();
        }else{
            $("#toolNum2").hide();
        }
    });

    /*不买装具原因动态事件*/
    form.on('select(notBuyReason)',function(data){
        //console.log(data.value);
        if(data.value == "notBuyReason_other"){
            $("#notBuyReason2").show();
        }else{
            $("#notBuyReason2").hide();
        }
    })

    //提交数据
    form.on("submit(changeUser)",function(data){
        var index = layer.msg('提交中，请稍候',{icon: 16,time:false,shade:0.8});
        //将填写的用户信息存到session以便下次调取
        var famerType='';
        var famerType1 = data.field.famerType == "famerType_other" ? data.field.famerType2 : data.field.famerType;

        //var famerType0 = famerType1 == "famerType_other2" ? data.field.famerType3 : famerType1;
        if(famerType1 == "famerType2_other"){
            famerType = data.field.famerType3;
        }else{
            famerType = famerType1;
        }

        var purposeGrain = data.field.purposeGrain == "purposeGrain_other" ? data.field.purposeGrain2 : data.field.purposeGrain;
        var reason = data.field.reason == "reason_other" ? data.field.reason2 : data.field.reason;
        var tools = data.field.tools == "tools_other" ? data.field.tools2 : data.field.tools;
        var supportTool =  data.field.supportTool == "supportTool_other" ? data.field.supportTool2 : data.field.supportTool;
        var toolType =  data.field.toolType == "toolType_other" ? data.field.toolType2 : data.field.toolType;
        var toolNum =  data.field.toolNum == "toolNum_other" ? data.field.toolNum2 : data.field.toolNum;
        var notBuyReason = data.field.notBuyReason == "notBuyReason_other" ? data.field.notBuyReason2 : data.field.notBuyReason;

        var userInfoHtml = {
            'user': $(".user").val(),
            'sex' : data.field.sex,
            'age' : $(".age").val(),

            'province' : data.field.province,
            'citie' : data.field.city,
            'area' : data.field.area,

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
            url:"addquestionnaire",
            type:'post',//method请求方式，get或者post
            dataType:'json',//预期服务器返回的数据类型
            data:JSON.stringify(userInfoHtml),//表格数据序列化
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
            error:function (data) {
                layer.msg(data.msg,{icon:5});
                layer.alert("发生未知错误请重新输入")
                //console.log(data);
                parent.window.location.reload();
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