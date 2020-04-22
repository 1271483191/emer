/**
 * Created by yinwenyao on 20/4/22.
 */

$(document).ready(function(){
    // $.post("deliverBar",function(data){deliverBar(data);});
    companyBar();
    machineDayBar();
    machineRealBar();
    statusBar();
});

function companyBar(){
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
        2020:[136.27,159.72,2905.73,641.42,1306.3,1915.57,1277.44,1701.5,124.94,3064.78,1583.04,2015.31,1612.24,1391.07,3973.85,3512.24,2569.3,2768.03,2665.2,2047.23,659.23,844.52,2983.51,726.22,1411.01,74.47,1220.9,678.75,155.08,184.14,1139.03]
    });

    dataMap.dataSI = dataFormatter({
        //max : 26600,
        2020:[3752.48,5928.32,13126.86,6635.26,8037.69,12152.15,5611.48,5962.41,7927.89,25203.28,16555.58,8309.38,9069.2,6390.55,24017.11,15427.08,9815.94,9361.99,26447.38,5675.32,714.5,5543.04,11029.13,2194.33,3780.32,208.79,6935.59,2377.83,975.18,1056.15,3225.9]

    });

    dataMap.dataTI = dataFormatter({
        //max : 25000,
        2020:[12363.18,5219.24,8483.17,3960.87,5015.89,8158.98,3679.91,4918.09,11142.86,20842.21,14180.23,4975.96,6878.74,3921.2,17370.89,7991.72,7247.02,7539.54,24097.7,3998.33,1148.93,3623.81,7014.04,2781.29,3701.79,322.57,4355.81,1963.79,540.18,861.92,2245.12]
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

function machineDayBar(){
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
        2020:[136.27,159.72,2905.73,641.42,1306.3,1915.57,1277.44,1701.5,124.94,3064.78,1583.04,2015.31,1612.24,1391.07,3973.85,3512.24,2569.3,2768.03,2665.2,2047.23,659.23,844.52,2983.51,726.22,1411.01,74.47,1220.9,678.75,155.08,184.14,1139.03]
    });

    dataMap.dataSI = dataFormatter({
        //max : 26600,
        2020:[3752.48,5928.32,13126.86,6635.26,8037.69,12152.15,5611.48,5962.41,7927.89,25203.28,16555.58,8309.38,9069.2,6390.55,24017.11,15427.08,9815.94,9361.99,26447.38,5675.32,714.5,5543.04,11029.13,2194.33,3780.32,208.79,6935.59,2377.83,975.18,1056.15,3225.9]

    });

    dataMap.dataTI = dataFormatter({
        //max : 25000,
        2020:[12363.18,5219.24,8483.17,3960.87,5015.89,8158.98,3679.91,4918.09,11142.86,20842.21,14180.23,4975.96,6878.74,3921.2,17370.89,7991.72,7247.02,7539.54,24097.7,3998.33,1148.93,3623.81,7014.04,2781.29,3701.79,322.57,4355.81,1963.79,540.18,861.92,2245.12]
    });

    dataMap.dataMI = dataFormatter({
        //max : 25000,
        2020:[9179.19,3405.16,6068.31,2886.92,3696.65,5891.25,2756.26,3371.95,8930.85,13629.07,9918.78,3662.15,5048.49,2637.07,11768.18,5700.91,5127.12,5402.81,18052.59,2919.13,748.59,2474.44,5198.8,1885.79,2519.62,240.85,3143.74,1363.27,398.54,563.74,1587.72],
    });
    dataMap.dataEI = dataFormatter({
        //max : 25000,
        2020:[10600.84,4238.65,7123.77,3412.38,4209.03,6849.37,3111.12,4040.55,9833.51,17131.45,12063.82,4193.69,5850.62,3121.4,14343.14,6607.89,6053.37,6369.27,20711.55,3383.11,953.67,2881.08,6030.41,2177.07,2892.31,274.82,3688.93,1536.5,470.88,702.45,1766.69]
    });
    dataMap.dataWI = dataFormatter({
        //max : 25000,
        2020:[8375.76,2886.65,5276.04,2759.46,3212.06,5207.72,2412.26,2905.68,7872.23,11888.53,8799.31,3234.64,4346.4,2355.86,10358.64,5099.76,4466.85,4633.67,16321.46,2529.51,643.47,2160.48,4561.69,1652.34,2218.81,218.67,2699.74,1234.21,355.93,475,1421.38],
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


function machineRealBar(){
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
        2020:[136.27,159.72,2905.73,641.42,1306.3,1915.57,1277.44,1701.5,124.94,3064.78,1583.04,2015.31,1612.24,1391.07,3973.85,3512.24,2569.3,2768.03,2665.2,2047.23,659.23,844.52,2983.51,726.22,1411.01,74.47,1220.9,678.75,155.08,184.14,1139.03]
    });

    dataMap.dataSI = dataFormatter({
        //max : 26600,
        2020:[3752.48,5928.32,13126.86,6635.26,8037.69,12152.15,5611.48,5962.41,7927.89,25203.28,16555.58,8309.38,9069.2,6390.55,24017.11,15427.08,9815.94,9361.99,26447.38,5675.32,714.5,5543.04,11029.13,2194.33,3780.32,208.79,6935.59,2377.83,975.18,1056.15,3225.9]

    });

    dataMap.dataTI = dataFormatter({
        //max : 25000,
        2020:[12363.18,5219.24,8483.17,3960.87,5015.89,8158.98,3679.91,4918.09,11142.86,20842.21,14180.23,4975.96,6878.74,3921.2,17370.89,7991.72,7247.02,7539.54,24097.7,3998.33,1148.93,3623.81,7014.04,2781.29,3701.79,322.57,4355.81,1963.79,540.18,861.92,2245.12]
    });

    dataMap.dataMI = dataFormatter({
        //max : 25000,
        2020:[9179.19,3405.16,6068.31,2886.92,3696.65,5891.25,2756.26,3371.95,8930.85,13629.07,9918.78,3662.15,5048.49,2637.07,11768.18,5700.91,5127.12,5402.81,18052.59,2919.13,748.59,2474.44,5198.8,1885.79,2519.62,240.85,3143.74,1363.27,398.54,563.74,1587.72],
    });
    dataMap.dataEI = dataFormatter({
        //max : 25000,
        2020:[10600.84,4238.65,7123.77,3412.38,4209.03,6849.37,3111.12,4040.55,9833.51,17131.45,12063.82,4193.69,5850.62,3121.4,14343.14,6607.89,6053.37,6369.27,20711.55,3383.11,953.67,2881.08,6030.41,2177.07,2892.31,274.82,3688.93,1536.5,470.88,702.45,1766.69]
    });
    dataMap.dataWI = dataFormatter({
        //max : 25000,
        2020:[8375.76,2886.65,5276.04,2759.46,3212.06,5207.72,2412.26,2905.68,7872.23,11888.53,8799.31,3234.64,4346.4,2355.86,10358.64,5099.76,4466.85,4633.67,16321.46,2529.51,643.47,2160.48,4561.69,1652.34,2218.81,218.67,2699.74,1234.21,355.93,475,1421.38],
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


function statusBar(){
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
        2020:[136.27,159.72,2905.73,641.42,1306.3,1915.57,1277.44,1701.5,124.94,3064.78,1583.04,2015.31,1612.24,1391.07,3973.85,3512.24,2569.3,2768.03,2665.2,2047.23,659.23,844.52,2983.51,726.22,1411.01,74.47,1220.9,678.75,155.08,184.14,1139.03]
    });

    dataMap.dataSI = dataFormatter({
        //max : 26600,
        2020:[3752.48,5928.32,13126.86,6635.26,8037.69,12152.15,5611.48,5962.41,7927.89,25203.28,16555.58,8309.38,9069.2,6390.55,24017.11,15427.08,9815.94,9361.99,26447.38,5675.32,714.5,5543.04,11029.13,2194.33,3780.32,208.79,6935.59,2377.83,975.18,1056.15,3225.9]

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