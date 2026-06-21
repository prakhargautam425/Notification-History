package com.example.notificationhistory;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;

public class MyNotificationListener extends NotificationListenerService
{
    @Override
    public void onNotificationPosted(StatusBarNotification sbn)
    {
        String packageName= sbn.getPackageName();
        String title=sbn.getNotification().extras.getString("android.title");
        String text= sbn.getNotification().extras.getString("android.text");
        long time=sbn.getPostTime();

        Log.d("NOTI","App: "+packageName);
        Log.d("NOTI","Title: "+title);
        Log.d("NOTI","Text: "+text);

    }

    @Override
    public void onNotificationRemoved(StatusBarNotification sbn)
    {
        Log.d("NOTI","Notification removed: "+sbn.getPackageName());
    }
}
