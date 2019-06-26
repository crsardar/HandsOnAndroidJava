package com.crsardar.handson.android.simplebr;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyBR extends BroadcastReceiver {

    private static final String TAG = BroadcastReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {



        Log.d(TAG, "==========> onReceive Braodcast = " + intent.getAction()
                + " : " + intent.getStringExtra("service_name"));

        new Thread(() -> {

            while (true) {

                try {

                    Log.d(TAG, "--------> He There, I am still alive! ");
                    Thread.currentThread().sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}
