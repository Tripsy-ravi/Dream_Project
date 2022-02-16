package com.example.android.dream_project;

public class HomeModel {

    int near_img;
    String near_title;
    String near_loc;
    String near_tym;
    String near_rate;

    public HomeModel(int near_img, String near_title, String near_loc, String near_tym, String near_rate) {
        this.near_img = near_img;
        this.near_title = near_title;
        this.near_loc = near_loc;
        this.near_tym = near_tym;
        this.near_rate = near_rate;
    }

    public int getNear_img() {
        return near_img;
    }

    public void setNear_img(int near_img) {
        this.near_img = near_img;
    }

    public String getNear_title() {
        return near_title;
    }

    public void setNear_title(String near_title) {
        this.near_title = near_title;
    }

    public String getNear_loc() {
        return near_loc;
    }

    public void setNear_loc(String near_loc) {
        this.near_loc = near_loc;
    }

    public String getNear_tym() {
        return near_tym;
    }

    public void setNear_tym(String near_tym) {
        this.near_tym = near_tym;
    }

    public String getNear_rate() {
        return near_rate;
    }

    public void setNear_rate(String near_rate) {
        this.near_rate = near_rate;
    }

}
