package com.example.android.dream_project;
public class NotificationModel {

    private int  notificationimg,  notificationseen;
    private String notificationmsg,notificationtime;


    public NotificationModel(int notificationimg, int notificationseen, String notificationmsg, String notificationtime) {
        this.notificationimg = notificationimg;
        this.notificationseen = notificationseen;
        this.notificationmsg = notificationmsg;
        this.notificationtime = notificationtime;
    }

    public int getNotificationimg() {
        return notificationimg;
    }

    public void setNotificationimg(int notificationimg) {
        this.notificationimg = notificationimg;
    }

    public int getNotificationseen() {
        return notificationseen;
    }

    public void setNotificationseen(int notificationseen) {
        this.notificationseen = notificationseen;
    }

    public String getNotificationmsg() {
        return notificationmsg;
    }

    public void setNotificationmsg(String notificationmsg) {
        this.notificationmsg = notificationmsg;
    }

    public String getNotificationtime() {
        return notificationtime;
    }

    public void setNotificationtime(String notificationtime) {
        this.notificationtime = notificationtime;
    }
}
