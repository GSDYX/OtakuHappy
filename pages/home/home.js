
Page({
  data: {
    currentTab: 0, //预设当前项的值
    // scrollLeft: 0, //tab标题的滚动条位置
    expertList: [{ //数据
     
    }]
  },
 
  // // 点击标题切换当前页时改变样式
  // swichNav: function (e) {
  //   var cur = e.target.dataset.current;
  //   if (this.data.currentTab == cur) { return false; }
  //   else {
  //     this.setData({
  //       currentTab: cur
  //     })
  //   }
  // } 

  time:function time(){
   
    console.log(new Date().getDay())
  }
  
  
  
})