//****************针对第一种方式的具体js实现部分******************//
//****************所使用的数据是city.js******************//

/*根据id获取对象*/
function $get(str) {
    return document.getElementById(str);
}

var addrShow = $get('addr-show');
var provinces = $get('provinces');
var cityes = $get('cities');
var counties = $get('counties');
//var btn = document.getElementsByClassName('met1')[0];
var prov = $get('prov');
var city = $get('city');
var country = $get('country');


/*用于保存当前所选的省市区*/
var current = {
    prov: '',
    city: '',
    country: ''
};

/*自动加载省份列表*/
(function showProv() {
    //btn.disabled = true;
    var len = provice.length;
    for (var i = 0; i < len; i++) {
        var provOpt = document.createElement('option');
        provOpt.innerText = provice[i]['name'];
        provOpt.value = i;
        prov.appendChild(provOpt);
    }
    //showAddr();

})();

/*根据所选的省份来显示城市列表*/
function showCity(obj) {
    var val = obj.options[obj.selectedIndex].value;
    if (val != current.prov) {
        current.prov = val;
        provinces.value = provice[current.prov].name;

        //btn.disabled = true;
    }
    //console.log(val);
    if (val != null) {
        city.length = 1;
        var cityLen = provice[val]["city"].length;
        for (var j = 0; j < cityLen; j++) {
            var cityOpt = document.createElement('option');
            cityOpt.innerText = provice[val]["city"][j].name;
            cityOpt.value = j;
            city.appendChild(cityOpt);
        }
    }
    //showAddr();
}

/*根据所选的城市来显示县区列表*/
function showCountry(obj) {
    var val = obj.options[obj.selectedIndex].value;
    current.city = val;
    cityes.value = provice[current.prov]["city"][current.city].name;
    if (val != null) {
        country.length = 1; //清空之前的内容只留第一个默认选项
        var countryLen = provice[current.prov]["city"][val].districtAndCounty.length;
        if(countryLen == 0){
            addrShow.value = provice[current.prov].name + '-' + provice[current.prov]["city"][current.city].name;
            return;
        }
        for (var n = 0; n < countryLen; n++) {
            var countryOpt = document.createElement('option');
            countryOpt.innerText = provice[current.prov]["city"][val].districtAndCounty[n];
            countryOpt.value = n;
            country.appendChild(countryOpt);
        }
    }
    //showAddr();
}

/*选择县区之后的处理函数*/
function selecCountry(obj) {
    current.country = obj.options[obj.selectedIndex].value;
    counties.value = provice[current.prov]["city"][current.city].districtAndCounty[current.country];
    if ((current.city != null) && (current.country != null)) {
        //btn.disabled = false;
    }
    //showAddr();
}

/*点击确定按钮显示用户所选的地址*/
function showAddr() {
    addrShow.value = provice[current.prov].name + '-' + provice[current.prov]["city"][current.city].name + '-' + provice[current.prov]["city"][current.city].districtAndCounty[current.country];
    console.log(addrShow.value)
    provinces.value = provice[current.prov].name;
    cityes.value = provice[current.prov]["city"][current.city].name;
    counties.value = provice[current.prov]["city"][current.city].districtAndCounty[current.country];
}