package com.example.android.dream_project;

import android.widget.ImageView;

public class FavouriteOrdersModel {

    private int fav_img;
    private String fav_item,fav_time;

    public FavouriteOrdersModel(int fav_img, String fav_item, String fav_time) {
        this.fav_img = fav_img;
        this.fav_item = fav_item;
        this.fav_time = fav_time;
    }

    public int getFav_img() {
        return fav_img;
    }

    public void setFav_img(int fav_img) {
        this.fav_img = fav_img;
    }

    public String getFav_item() {
        return fav_item;
    }

    public void setFav_item(String fav_item) {
        this.fav_item = fav_item;
    }

    public String getFav_time() {
        return fav_time;
    }

    public void setFav_time(String fav_time) {
        this.fav_time = fav_time;
    }
}
