package com.example.android.dream_project;

import android.widget.ImageView;
import android.widget.TextView;

public class OrderModel {

    int orderimg;
    String restname;
    String orderdetails;
    String totalitems;
    String cost;
    String status;

    public OrderModel(int orderimg, String restname, String orderdetails, String totalitems, String cost, String status) {
        this.orderimg = orderimg;
        this.restname = restname;
        this.orderdetails = orderdetails;
        this.totalitems = totalitems;
        this.cost = cost;
        this.status = status;
    }


    public int getOrderimg() {
        return orderimg;
    }

    public void setOrderimg(int orderimg) {
        this.orderimg = orderimg;
    }

    public String getRestname() {
        return restname;
    }

    public void setRestname(String restname) {
        this.restname = restname;
    }

    public String getOrderdetails() {
        return orderdetails;
    }

    public void setOrderdetails(String orderdetails) {
        this.orderdetails = orderdetails;
    }

    public String getTotalitems() {
        return totalitems;
    }

    public void setTotalitems(String totalitems) {
        this.totalitems = totalitems;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
