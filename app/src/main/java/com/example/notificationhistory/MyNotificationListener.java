package com.example.notificationhistory;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;

public class MyNotificationListener extends NotificationListenerService
{
//    private MyListener listener;
//    public MyNotificationListener(MyListener listener)
//    {
//        this.listener=listener;
//    }
//    public void callFunction(String a,String b,String c)
//    {
//        listener.showText(a,b,c);
//    }

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

//        callFunction(packageName,title,text);
//        MainActivity ob=new MainActivity();
//        MainActivity.showText(packageName,title,text);
    }

    @Override
    public void onNotificationRemoved(StatusBarNotification sbn)
    {
        Log.d("NOTI","Notification removed: "+sbn.getPackageName());
    }
}
