package com.gsdyx.otakuhappy.pojo;

public class User {
    private Integer userid;

    private String openid;

    private String firstlogintime;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getFirstlogintime() {
        return firstlogintime;
    }

    public void setFirstlogintime(String firstlogintime) {
        this.firstlogintime = firstlogintime == null ? null : firstlogintime.trim();
    }
}