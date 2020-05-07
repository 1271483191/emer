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


    //提交数据
    form.on("submit(changeUser)",function(data){
        var index = layer.msg('提交中，请稍候',{icon: 16,time:false,shade:0.8});
        //将填写的用户信息存到session以便下次调取
        var key,userInfoHtml = '';
        userInfoHtml = {
            'user': $(".user").val(),
            'sex' : data.field.sex,
            'age' : $(".age").val(),

            'province' : data.field.province,
            'citie' : data.field.city,
            'area' : data.field.area,

            'famerType' : $(".famerType").val(),
            'harvestGrain' : $(".harvestGrain").val(),
            'surplusGrain' : $(".surplusGrain").val(),
            'averageGrainDay' : $(".averageGrainDay").val(),
            'purposeGrain' : $(".purposeGrain").val(),

            'reason' : $(".reason").val(),
            'tools' : $(".tools").val(),
            'toolsEvaluate' : $(".toolsEvaluate").val(),

            'toolsUse' : $(".toolsUse").val(),
            'supportTool' : $(".supportTool").val(),

            'toolType' : $(".toolType").val(),
            'toolNum' : $(".toolNum").val(),
            'notBuyReason' : $(".notBuyReason").val()
        };
        $.ajax({
            url:"toaddquestionnaire",
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
                }else if(res.res){
                    layer.msg(res.msg, {
                        time: 2000 //2秒关闭（如果不配置，默认是3秒）
                    }, function(){
                        parent.window.location.reload();
                    });
                }
            },
            error:function (data) {
                layer.msg(data.msg,{icon:5});
                layer.alert("error")
                //console.log(data);
            }
        })
        //  console.log(userInfoHtml);
        return false;

        //return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
    });



})

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