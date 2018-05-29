
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
    n: 1,
    animationData: {}
  },
  onLoad: function () {
   
  },
  onShow: function () {
  
    
  },
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
      console.log("向右滑动");

  

    this.animation = animation;

    animation.rotateY(180).step();

    this.setData({

      animationData: animation.export()

    })

    }
    // 向右滑动   
    if (touchMove - touchDot >= 40 && time < 10 && flag_hd == true) {
      flag_hd = false;
      //执行切换页面的方法
      console.log("向左滑动");


      this.animation = animation;

      animation.rotateY(-180).step();

      this.setData({

        animationData: animation.export()

      })
    }
    clearInterval(interval); // 清除setInterval
    time = 0;
    flag_hd = true;  
  }
})