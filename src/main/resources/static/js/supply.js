/**
 * Created by yinwenyao on 20/4/22.
 */

$(document).ready(function(){
    $.post("supplyBar1",function(data){supplyBar1(data);});
    $.post("supplyBar2",function(data){supplyBar2(data);});
    $.post("supplyBar3",function(data){supplyBar3(data);});
});

function supplyBar1(data){
    var copdata = data.split("~");
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('supplyBar1'));



    var dataMap = {};
    function dataFormatter(obj) {
        var pList = ['北京','天津','河北','山西','内蒙古','辽宁','吉林','黑龙江','上海','江苏','浙江','安徽','福建','江西','山东','河南','湖北','湖南','广东','广西','海南','重庆','四川','贵州','云南','西藏','陕西','甘肃','青海','宁夏','新疆'];
        var temp;
        for (var year = 2020; year <= 2020; year++) {
            var max = 0;
            var sum = 0;
            temp = obj[year];
            for (var i = 0, l = temp.length; i < l; i++) {
                max = Math.max(max, temp[i]);
                sum += temp[i];
                obj[year][i] = {
                    name: pList[i],
                    value: temp[i]
                };
            }
            obj[year + 'max'] = Math.floor(max / 100) * 100;
            obj[year + 'sum'] = sum;
        }
        return obj;
    }


    dataMap.dataPI = dataFormatter({
        //max : 4000,
        2020:new Function("return" + copdata[0])()
    });

    dataMap.dataSI = dataFormatter({
        //max : 26600,
        2020:new Function("return" + copdata[1])()

    });

    dataMap.dataTI = dataFormatter({
        //max : 25000,
        2020:new Function("return" + copdata[2])()
    });

    var option = {
        baseOption: {
            timeline: {
                axisType: 'category',
                autoPlay: true,
                playInterval: 1000,
                data: [
                    '2020-01-01'
                ],
                label: {
                    formatter : function(s) {
                        return (new Date(s)).getFullYear();
                    }
                }
            },
            title: {
                subtext: '数据来自国家粮食和物资储备局'
            },
            tooltip: {
            },
            legend: {
                left: 'right',
                data: ['日入库量', '日销量', '日库存'],

            },
            calculable : true,
            grid: {
                top: 80,
                bottom: 100,
                tooltip: {
                    trigger: 'axis',
                    axisPointer: {
                        type: 'shadow',
                        label: {
                            show: true,
                            formatter: function (params) {
                                return params.value.replace('\n', '');
                            }
                        }
                    }
                }
            },
            xAxis: [
                {
                    'type':'category',
                    'axisLabel':{'interval':0},
                    'data':[
                        '北京','\n天津','河北','\n山西','内蒙古','\n辽宁','吉林','\n黑龙江',
                        '上海','\n江苏','浙江','\n安徽','福建','\n江西','山东','\n河南',
                        '湖北','\n湖南','广东','\n广西','海南','\n重庆','四川','\n贵州',
                        '云南','\n西藏','陕西','\n甘肃','青海','\n宁夏','新疆'
                    ],
                    splitLine: {show: false}
                }
            ],
            yAxis: [
                {
                    type: 'value',
                    name: '企业指标（吨）'
                }
            ],
            series: [
                {name: '日入库量', type: 'bar'},
                {name: '日销量', type: 'bar'},
                {name: '日库存', type: 'bar'},
                {
                    name: '企业指标占比',
                    type: 'pie',
                    center: ['75%', '35%'],
                    radius: '28%',
                    z: 100
                }
            ]
        },
        options: [
            {
                title: {text: '2020全国应急供应网点指标'},
                series: [
                    {data: dataMap.dataPI['2020']},
                    {data: dataMap.dataSI['2020']},
                    {data: dataMap.dataTI['2020']},
                    {data: [
                        {name: '日入库量', value: dataMap.dataPI['2020sum']},
                        {name: '日销量', value: dataMap.dataSI['2020sum']},
                        {name: '日库存', value: dataMap.dataTI['2020sum']}
                    ]}
                ]
            }

        ]
    };
    //使用制定的配置项和数据显示图表
    myChart.setOption(option);
}

function supplyBar2(data){
    var copdata = data.split("~");
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('supplyBar2'));



    var dataMap = {};
    function dataFormatter(obj) {
        var pList = ['北京','天津','河北','山西','内蒙古','辽宁','吉林','黑龙江','上海','江苏','浙江','安徽','福建','江西','山东','河南','湖北','湖南','广东','广西','海南','重庆','四川','贵州','云南','西藏','陕西','甘肃','青海','宁夏','新疆'];
        var temp;
        for (var year = 2020; year <= 2020; year++) {
            var max = 0;
            var sum = 0;
            temp = obj[year];
            for (var i = 0, l = temp.length; i < l; i++) {
                max = Math.max(max, temp[i]);
                sum += temp[i];
                obj[year][i] = {
                    name: pList[i],
                    value: temp[i]
                };
            }
            obj[year + 'max'] = Math.floor(max / 100) * 100;
            obj[year + 'sum'] = sum;
        }
        return obj;
    }


    dataMap.dataPI = dataFormatter({
        2020:new Function("return" + copdata[0])()
    });

    dataMap.dataSI = dataFormatter({
        2020:new Function("return" + copdata[1])()

    });

    dataMap.dataTI = dataFormatter({
        2020:new Function("return" + copdata[2])()
    });

    dataMap.dataEI = dataFormatter({
        2020:new Function("return" + copdata[3])()
    });

    dataMap.dataPII = dataFormatter({
        2020:new Function("return" + copdata[4])()
    });

    dataMap.dataSII = dataFormatter({
        2020:new Function("return" + copdata[5])()

    });

    dataMap.dataTII = dataFormatter({
        2020:new Function("return" + copdata[6])()
    });

    dataMap.dataEII = dataFormatter({
        2020:new Function("return" + copdata[7])()
    });

    var option = {
        baseOption: {
            timeline: {
                axisType: 'category',
                autoPlay: true,
                playInterval: 1000,
                data: [
                    '2020-01-01'
                ],
                label: {
                    formatter : function(s) {
                        return (new Date(s)).getFullYear();
                    }
                }
            },
            title: {
                subtext: '数据来自国家粮食和物资储备局'
            },
            tooltip: {
            },
            legend: {
                left: 'right',
                data: ['面粉设计', '大米设计', '食用油设计','其它设计','面粉实际','大米实际','食用油实际','其它实际'],
                selected: {
                    '面粉实际': false, '大米实际': false, '食用油实际': false, '其它实际': false
                }
            },
            calculable : true,
            grid: {
                top: 80,
                bottom: 100,
                tooltip: {
                    trigger: 'axis',
                    axisPointer: {
                        type: 'shadow',
                        label: {
                            show: true,
                            formatter: function (params) {
                                return params.value.replace('\n', '');
                            }
                        }
                    }
                }
            },
            xAxis: [
                {
                    'type':'category',
                    'axisLabel':{'interval':0},
                    'data':[
                        '北京','\n天津','河北','\n山西','内蒙古','\n辽宁','吉林','\n黑龙江',
                        '上海','\n江苏','浙江','\n安徽','福建','\n江西','山东','\n河南',
                        '湖北','\n湖南','广东','\n广西','海南','\n重庆','四川','\n贵州',
                        '云南','\n西藏','陕西','\n甘肃','青海','\n宁夏','新疆'
                    ],
                    splitLine: {show: false}
                }
            ],
            yAxis: [
                {
                    type: 'value',
                    name: '日供应能力（吨）'
                }
            ],
            series: [
                {name: '面粉设计', type: 'bar'},
                {name: '大米设计', type: 'bar'},
                {name: '食用油设计', type: 'bar'},
                {name: '其它设计', type: 'bar'},
                {name: '面粉实际', type: 'bar'},
                {name: '大米实际', type: 'bar'},
                {name: '食用油实际', type: 'bar'},
                {name: '其它实际', type: 'bar'},
                {
                    name: '企业能力占比',
                    type: 'pie',
                    center: ['75%', '35%'],
                    radius: '28%',
                    z: 100
                }
            ]
        },
        options: [
            {
                title: {text: '2020全国应急供应网点能力'},
                series: [
                    {data: dataMap.dataPI['2020']},
                    {data: dataMap.dataSI['2020']},
                    {data: dataMap.dataTI['2020']},
                    {data: dataMap.dataEI['2020']},
                    {data: dataMap.dataPII['2020']},
                    {data: dataMap.dataSII['2020']},
                    {data: dataMap.dataTII['2020']},
                    {data: dataMap.dataEII['2020']},
                    {data: [
                        {name: '面粉设计', value: dataMap.dataPI['2020sum']},
                        {name: '大米设计', value: dataMap.dataSI['2020sum']},
                        {name: '食用油设计', value: dataMap.dataTI['2020sum']},
                        {name: '其他设计', value: dataMap.dataEI['2020sum']}
                    ]}
                ]
            }

        ]
    };
    //使用制定的配置项和数据显示图表
    myChart.setOption(option);
}

function supplyBar3(data){
    var copdata = data.split("~");
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('supplyBar3'));



    var dataMap = {};
    function dataFormatter(obj) {
        var pList = ['北京','天津','河北','山西','内蒙古','辽宁','吉林','黑龙江','上海','江苏','浙江','安徽','福建','江西','山东','河南','湖北','湖南','广东','广西','海南','重庆','四川','贵州','云南','西藏','陕西','甘肃','青海','宁夏','新疆'];
        var temp;
        for (var year = 2020; year <= 2020; year++) {
            var max = 0;
            var sum = 0;
            temp = obj[year];
            for (var i = 0, l = temp.length; i < l; i++) {
                max = Math.max(max, temp[i]);
                sum += temp[i];
                obj[year][i] = {
                    name: pList[i],
                    value: temp[i]
                };
            }
            obj[year + 'max'] = Math.floor(max / 100) * 100;
            obj[year + 'sum'] = sum;
        }
        return obj;
    }


    dataMap.dataPI = dataFormatter({
        //max : 4000,
        2020:new Function("return" + copdata[0])()
    });

    dataMap.dataSI = dataFormatter({
        //max : 26600,
        2020:new Function("return" + copdata[1])()

    });

    var option = {
        baseOption: {
            timeline: {
                axisType: 'category',
                autoPlay: true,
                playInterval: 1000,
                data: [
                    '2020-01-01'
                ],
                label: {
                    formatter : function(s) {
                        return (new Date(s)).getFullYear();
                    }
                }
            },
            title: {
                subtext: '数据来自国家粮食和物资储备局'
            },
            tooltip: {
            },
            legend: {
                left: 'right',
                data: ['正常', '停产'],

            },
            calculable : true,
            grid: {
                top: 80,
                bottom: 100,
                tooltip: {
                    trigger: 'axis',
                    axisPointer: {
                        type: 'shadow',
                        label: {
                            show: true,
                            formatter: function (params) {
                                return params.value.replace('\n', '');
                            }
                        }
                    }
                }
            },
            xAxis: [
                {
                    'type':'category',
                    'axisLabel':{'interval':0},
                    'data':[
                        '北京','\n天津','河北','\n山西','内蒙古','\n辽宁','吉林','\n黑龙江',
                        '上海','\n江苏','浙江','\n安徽','福建','\n江西','山东','\n河南',
                        '湖北','\n湖南','广东','\n广西','海南','\n重庆','四川','\n贵州',
                        '云南','\n西藏','陕西','\n甘肃','青海','\n宁夏','新疆'
                    ],
                    splitLine: {show: false}
                }
            ],
            yAxis: [
                {
                    type: 'value',
                    name: '数量 '
                }
            ],
            series: [
                {name: '正常', type: 'bar'},
                {name: '停产', type: 'bar'},
                {
                    name: '企业指标占比',
                    type: 'pie',
                    center: ['75%', '35%'],
                    radius: '28%',
                    z: 100
                }
            ]
        },
        options: [
            {
                title: {text: '2020全国应急供应网点状态'},
                series: [
                    {data: dataMap.dataPI['2020']},
                    {data: dataMap.dataSI['2020']},
                    {data: [
                        {name: '正常', value: dataMap.dataPI['2020sum']},
                        {name: '停产', value: dataMap.dataSI['2020sum']},
                    ]}
                ]
            }

        ]
    };
    //使用制定的配置项和数据显示图表
    myChart.setOption(option);
}