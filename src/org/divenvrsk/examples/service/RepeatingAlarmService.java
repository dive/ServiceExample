package org.divenvrsk.examples.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class RepeatingAlarmService extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "It's Service Time!", Toast.LENGTH_LONG).show();
        Log.v(this.getClass().getName(), "Timed alarm onReceive() started at time: " + new java.sql.Timestamp(System.currentTimeMillis()).toString());
    }
}
