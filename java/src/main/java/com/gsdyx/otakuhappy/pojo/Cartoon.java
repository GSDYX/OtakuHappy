package com.gsdyx.otakuhappy.pojo;

public class Cartoon {
    private Integer cartoonid;

    private String cartoonname;

    private String episodes;

    private String episodesall;

    private String weekplay;

    private String timeplay;

    public Integer getCartoonid() {
        return cartoonid;
    }

    public void setCartoonid(Integer cartoonid) {
        this.cartoonid = cartoonid;
    }

    public String getCartoonname() {
        return cartoonname;
    }

    public void setCartoonname(String cartoonname) {
        this.cartoonname = cartoonname == null ? null : cartoonname.trim();
    }

    public String getEpisodes() {
        return episodes;
    }

    public void setEpisodes(String episodes) {
        this.episodes = episodes == null ? null : episodes.trim();
    }

    public String getEpisodesall() {
        return episodesall;
    }

    public void setEpisodesall(String episodesall) {
        this.episodesall = episodesall == null ? null : episodesall.trim();
    }

    public String getWeekplay() {
        return weekplay;
    }

    public void setWeekplay(String weekplay) {
        this.weekplay = weekplay == null ? null : weekplay.trim();
    }

    public String getTimeplay() {
        return timeplay;
    }

    public void setTimeplay(String timeplay) {
        this.timeplay = timeplay == null ? null : timeplay.trim();
    }
}