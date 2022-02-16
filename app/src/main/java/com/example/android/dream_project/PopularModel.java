package com.example.android.dream_project;

public class PopularModel {

    int category_img;
    String category_txt;

    public PopularModel(int category_img, String category_txt) {
        this.category_img = category_img;
        this.category_txt = category_txt;
    }

    public int getCategory_img() {
        return category_img;
    }

    public void setCategory_img(int category_img) {
        this.category_img = category_img;
    }

    public String getCategory_txt() {
        return category_txt;
    }

    public void setCategory_txt(String category_txt) {
        this.category_txt = category_txt;
    }
}
