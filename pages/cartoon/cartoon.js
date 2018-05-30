
var time = 0;
var touchDot = 0;//触摸时的原点
var interval = "";
var flag_hd = true;


var animation = wx.createAnimation({
  duration: 500,
  timingFunction: 'ease',
});

Page({

  data: {
    currentTab: 0, //预设顶端bar当前项的值
    cartoonList:[],
    // list : [
    //   {
    //     animationData: "",
    //    cur:0
    //   },
    //   {
    //     animationData: "",
    //     cur: 1
      
    //   },
    //   {
    //     animationData: "",
    //     cur: 2

    //   },
    //   {
    //     animationData: "",
    //     cur: 3

    //   },
    //   {
    //     animationData: "",
    //     cur: 4

    //   }]
    // animationData: {}
  },
  // 点击顶端bar切换当前页时改变样式并请数据库获取数据
  swichNav: function (e) {
    // 改变样式
    var cur = e.target.dataset.current;
    if (this.data.currentTab == cur) { return false; }
    else {
      this.setData({
        currentTab: cur
      })
    }
    //获取当前选择星期 
    var weeks = e.target.dataset.weeks;
    console.log(weeks)
    // var weeks=new Date().getDay()
    var _this = this;
    wx.request({
      url: 'http://localhost:8080/cartoon',
      data: {
        weeks: weeks
      },
      header: {
        'content-type': 'application/json' // 默认值
      },
      success: function (res) {
// 获取单日动画数
        var cartoonNum=res.data.length;
        // 重新构造list用来渲染卡片翻转
        for (var i = 0; i < cartoonNum; i++) {
          res.data[i]['cur'] = i;
          res.data[i]['animationData']='';
        }
        
    
        _this.setData({
          cartoonList:res.data
        })
   
        console.log(res.data)
      }
    })
  } ,

  // 触摸开始事件
  touchStart: function (e) {
    touchDot = e.touches[0].pageX; // 获取触摸时的原点
    // 使用js计时器记录时间    
    interval = setInterval(function () {
      time++;
    }, 100);
  },
  // 触摸结束事件
  touchEnd: function (e) {
    var touchMove = e.changedTouches[0].pageX;
    // 向左滑动   
    if (touchMove - touchDot <= -40 && time < 10 && flag_hd == true) {
      flag_hd = false;
      //执行切换页面的方法
      console.log("向左滑动");
      var cur = e.currentTarget.dataset.current
  

    this.animation = animation;

    animation.rotateY(0).step();

    var cartoonList = this.data.cartoonList;
    cartoonList[cur].animationData= animation.export()
    this.setData({
      cartoonList: cartoonList
      

    })

    }
    // 向右滑动   
    if (touchMove - touchDot >= 40 && time < 10 && flag_hd == true) {
      flag_hd = false;
      //执行切换页面的方法
      console.log("向右滑动");

      var cur = e.currentTarget.dataset.current
      console.log(cur)
      this.animation = animation;

      animation.rotateY(180).step();
      var cartoonList = this.data.cartoonList;
      cartoonList[cur].animationData = animation.export()
      this.setData({
        cartoonList: cartoonList


      })
    }
    clearInterval(interval); // 清除setInterval
    time = 0;
    flag_hd = true;  
  },
  onReady:function(){
  
  }

})