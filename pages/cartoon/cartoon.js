
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
    list : [
      {
        animationData: "",
       cur:0
      },
      {
        animationData: "",
        cur: 1
      
      },
      {
        animationData: "",
        cur: 2

      },
      {
        animationData: "",
        cur: 3

      },
      {
        animationData: "",
        cur: 4

      }]
    // animationData: {}
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
      console.log("向左滑动");
      var cur = e.currentTarget.dataset.current
  

    this.animation = animation;

    animation.rotateY(0).step();

    var list = this.data.list;
    list[cur].animationData= animation.export()
    this.setData({
    list:list
      

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
      var list = this.data.list;
      list[cur].animationData = animation.export()
      this.setData({
        list: list


      })
    }
    clearInterval(interval); // 清除setInterval
    time = 0;
    flag_hd = true;  
  }
})