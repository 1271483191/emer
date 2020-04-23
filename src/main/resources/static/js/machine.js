/**
 * Created by yinwenyao on 20/4/22.
 */

$(document).ready(function(){
    $.post("machineCompanyBar",function(data){companyBar(data);});
    $.post("machineBar",function(data){machineDayBar(data);machineRealBar(data);});
    $.post("machineStatusBar",function(data){statusBar(data);});
});

function companyBar(data){
    var copdata = data.split("~");
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('companyBar'));
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
                title: {text: '2020全国粮食应急加工企业指标'},
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

function machineDayBar(data){
    var copdata = data.split("~");
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('machineDayBar'));
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

    dataMap.dataMI = dataFormatter({
        //max : 25000,
        2020:new Function("return" + copdata[3])()
    });
    dataMap.dataEI = dataFormatter({
        //max : 25000,
        2020:new Function("return" + copdata[4])()
    });
    dataMap.dataWI = dataFormatter({
        //max : 25000,
        2020:new Function("return" + copdata[5])()
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
                data: ['小麦日加工', '稻谷日加工', '油料处理日加工', '油脂精炼日加工', '油脂分装日加工', '其它日加工'],

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
                    name: '能力指标（吨）'
                }
            ],
            series: [
                {name: '小麦日加工', type: 'bar'},
                {name: '稻谷日加工', type: 'bar'},
                {name: '油料处理日加工', type: 'bar'},
                {name: '油脂精炼日加工', type: 'bar'},
                {name: '油脂分装日加工', type: 'bar'},
                {name: '其它日加工', type: 'bar'},
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
                title: {text: '2020全国粮食应急加工企业日加工量'},
                series: [
                    {data: dataMap.dataPI['2020']},
                    {data: dataMap.dataSI['2020']},
                    {data: dataMap.dataTI['2020']},
                    {data: dataMap.dataMI['2020']},
                    {data: dataMap.dataEI['2020']},
                    {data: dataMap.dataWI['2020']},
                    {data: [
                        {name: '小麦日加工', value: dataMap.dataPI['2020sum']},
                        {name: '稻谷日加工', value: dataMap.dataSI['2020sum']},
                        {name: '油料处理日加工', value: dataMap.dataTI['2020sum']},
                        {name: '油脂精炼日加工', value: dataMap.dataMI['2020sum']},
                        {name: '油脂分装日加工', value: dataMap.dataEI['2020sum']},
                        {name: '其它日加工', value: dataMap.dataWI['2020sum']}

                    ]}
                ]
            }

        ]
    };
    //使用制定的配置项和数据显示图表
    myChart.setOption(option);
}


function machineRealBar(data){
    var copdata = data.split("~");
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('machineRealBar'));
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
        2020:new Function("return" + copdata[6])()
    });

    dataMap.dataSI = dataFormatter({
        //max : 26600,
        2020:new Function("return" + copdata[7])()

    });

    dataMap.dataTI = dataFormatter({
        //max : 25000,
        2020:new Function("return" + copdata[8])()
    });

    dataMap.dataMI = dataFormatter({
        //max : 25000,
        2020:new Function("return" + copdata[9])()
    });
    dataMap.dataEI = dataFormatter({
        //max : 25000,
        2020:new Function("return" + copdata[10])()
    });
    dataMap.dataWI = dataFormatter({
        //max : 25000,
        2020:new Function("return" + copdata[11])()
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
                data: ['小麦实际加工', '稻谷实际加工', '油料处理实际加工', '油脂精炼实际加工', '油脂分装实际加工', '其它实际加工'],

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
                    name: '能力指标（吨）'
                }
            ],
            series: [
                {name: '小麦实际加工', type: 'bar'},
                {name: '稻谷实际加工', type: 'bar'},
                {name: '油料处理实际加工', type: 'bar'},
                {name: '油脂精炼实际加工', type: 'bar'},
                {name: '油脂分装实际加工', type: 'bar'},
                {name: '其它实际加工', type: 'bar'},
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
                title: {text: '粮食应急加工企业实际加工量'},
                series: [
                    {data: dataMap.dataPI['2020']},
                    {data: dataMap.dataSI['2020']},
                    {data: dataMap.dataTI['2020']},
                    {data: dataMap.dataMI['2020']},
                    {data: dataMap.dataEI['2020']},
                    {data: dataMap.dataWI['2020']},
                    {data: [
                        {name: '小麦实际加工', value: dataMap.dataPI['2020sum']},
                        {name: '稻谷实际加工', value: dataMap.dataSI['2020sum']},
                        {name: '油料处理实际加工', value: dataMap.dataTI['2020sum']},
                        {name: '油脂精炼实际加工', value: dataMap.dataMI['2020sum']},
                        {name: '油脂分装实际加工', value: dataMap.dataEI['2020sum']},
                        {name: '其它实际加工', value: dataMap.dataWI['2020sum']}
                    ]}
                ]
            }

        ]
    };
    //使用制定的配置项和数据显示图表
    myChart.setOption(option);
}


function statusBar(data){
    var copdata = data.split("~");
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('statusBar'));
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

    // dataMap.dataTI = dataFormatter({
    //     //max : 25000,
    //     2020:[12363.18,5219.24,8483.17,3960.87,5015.89,8158.98,3679.91,4918.09,11142.86,20842.21,14180.23,4975.96,6878.74,3921.2,17370.89,7991.72,7247.02,7539.54,24097.7,3998.33,1148.93,3623.81,7014.04,2781.29,3701.79,322.57,4355.81,1963.79,540.18,861.92,2245.12]
    // });

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
                data: ['生产', '停产'],

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
                    name: '数量（个）'
                }
            ],
            series: [
                {name: '生产', type: 'bar'},
                {name: '停产', type: 'bar'},
                {
                    name: '占比',
                    type: 'pie',
                    center: ['75%', '35%'],
                    radius: '28%',
                    z: 100
                }
            ]
        },
        options: [
            {
                title: {text: '2020全国粮食应急配送中心企业生产状态'},
                series: [
                    {data: dataMap.dataPI['2020']},
                    {data: dataMap.dataSI['2020']},
                    {data: [
                        {name: '生产', value: dataMap.dataPI['2020sum']},
                        {name: '停产', value: dataMap.dataSI['2020sum']}
                    ]}
                ]
            }

        ]
    };
    //使用制定的配置项和数据显示图表
    myChart.setOption(option);
}