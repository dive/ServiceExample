package org.divenvrsk.examples.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class OnBootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            Intent serviceLauncher = new Intent(context, ServiceExample.class);
            context.startService(serviceLauncher);
            Log.v(this.getClass().getName(), "Service loaded while device boot.");
        }
    }
}
