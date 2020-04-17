


$(document).ready(function(){
    $.post("homemap",function(data){homemap(data);});
    $.post("homejjj",function(data){homepie_jjj(data);});
    $.post("homeygc",function(data){homepie_ygc(data);});
    $.post("homecsj",function(data){homepie_csj(data);});
    $.post("homezsj",function(data){homepie_zsj(data);});

});

function homemap(data){
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('chinamap'));
    var optionMap = {
        backgroundColor: '#FFFFFF',
        title: {
            text: '全国粮食应急保障企业统计',
            subtext: '',
            x:'center'
        },
        tooltip : {
            trigger: 'item'
        },

        //左侧小导航图标
        visualMap: {
            show : true,
            x: 'left',
            y: 'center',
            splitList: [
                {start: 500, end:600},{start: 400, end: 500},
                {start: 300, end: 400},{start: 200, end: 300},
                {start: 100, end: 200},{start: 0, end: 100},
            ],
            color: ['#5475f5', '#9feaa5', '#85daef','#74e2ca', '#e6ac53', '#9fb5ea']
        },
        //配置属性
        series: [{
            name: '数据',
            type: 'map',
            mapType: 'china',
            roam: true,
            label: {
                normal: {
                    show: true  //省份名称
                },
                emphasis: {
                    show: false
                }
            },
            data:new Function("return" + data)(),  //数据
        }]
    };
    //使用制定的配置项和数据显示图表
    myChart.setOption(optionMap);
}

function homepie_jjj(data){
    var myChart = echarts.init(document.getElementById('doughnut'));
    var option = {
        tooltip: {
            trigger: 'item',
            formatter: '{a} <br/>{b}: {c} ({d}%)'
        },
        legend: {
            orient: 'vertical',
            left: 10,
            data: ['供应网点', '配送中心', '储运企业', '应急加工']
        },
        series: [
            {
                name: '应急企业',
                type: 'pie',
                radius: ['60%', '80%'],
                avoidLabelOverlap: false,
                label: {
                    show: false,
                    position: 'center'
                },
                emphasis: {
                    label: {
                        show: true,
                        fontSize: '30',
                        fontWeight: 'bold'
                    }
                },
                labelLine: {
                    show: false
                },
                data: new Function("return" + data)(),
            }
        ]
    };
    myChart.setOption(option);
}

function homepie_ygc(data){

    var myChart = echarts.init(document.getElementById('line'));
    var option = {
        tooltip: {
            trigger: 'item',
            formatter: '{a} <br/>{b} : {c} ({d}%)'
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data: ['供应网点', '配送中心', '储运企业', '应急加工']
        },
        series: [
            {
                name: '访问来源',
                type: 'pie',
                radius: '50%',
                center: ['60%', '50%'],
                data: new Function("return" + data)(),
                emphasis: {
                    itemStyle: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            }
        ]
    };

    myChart.setOption(option);

}

function homepie_csj(data){
    var myChart = echarts.init(document.getElementById('radar'));
    var option = {


        title: {
            text: '',
            left: 'center',
            top: 20,
            textStyle: {
                color: '#ccc'
            }
        },

        tooltip: {
            trigger: 'item',
            formatter: '{a} <br/>{b} : {c} ({d}%)'
        },

        visualMap: {
            show: false,
            min: 80,
            max: 600,
            inRange: {
                colorLightness: [0, 1]
            }
        },
        series: [
            {
                name: '访问来源',
                type: 'pie',
                radius: '65%',
                center: ['40%', '60%'],
                data: [
                    {value: 335, name: '供应网点'},
                    {value: 310, name: '配送中心'},
                    {value: 274, name: '储运企业'},
                    {value: 235, name: '应急加工'}
                ].sort(function (a, b) { return a.value - b.value; }),
                roseType: 'radius',
                label: {
                    color: 'rgba(255, 255, 255, 0.3)'
                },
                labelLine: {
                    lineStyle: {
                        color: 'rgba(255, 255, 255, 0.3)'
                    },
                    smooth: 0.2,
                    length: 10,
                    length2: 20
                },
                itemStyle: {
                    color: '#c23531',
                    shadowBlur: 200,
                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                },

                animationType: 'scale',
                animationEasing: 'elasticOut',
                animationDelay: function (idx) {
                    return Math.random() * 200;
                }
            }
        ]
    };

    myChart.setOption(option);
}

function homepie_zsj(data){
    var myChart = echarts.init(document.getElementById('polarArea'));
    var option = {
        tooltip: {
            trigger: 'item',
            formatter: '{a} <br/>{b} : {c} ({d}%)'
        },
        legend: {
            left: 'left',
            top: 'bottom',
            data: ['供应网点', '配送中心', '储运企业', '应急加工']
        },
        toolbox: {
            show: true,
            feature: {
                mark: {show: true},
                dataView: {show: true, readOnly: false},
                magicType: {
                    show: true,
                    type: ['pie', 'funnel']
                },
                restore: {show: true},
                saveAsImage: {show: true}
            }
        },
        series: [
            {
                name: '半径模式',
                type: 'pie',
                radius: [20, 60],
                center: ['50%', '50%'],
                roseType: 'radius',
                label: {
                    show: false
                },
                emphasis: {
                    label: {
                        show: true
                    }
                },
                data: new Function("return" + data)(),
            },

        ]
    };
    myChart.setOption(option);
}