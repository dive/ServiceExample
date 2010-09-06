package org.divenvrsk.examples.service;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ServiceActivity extends Activity implements View.OnClickListener {

    Button buttonStart, buttonStop;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        buttonStart = (Button) findViewById(R.id.buttonStart);
        buttonStop = (Button) findViewById(R.id.buttonStop);

        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonStart:
                Log.v(this.getClass().getName(), "onClick: Starting service.");
                startService(new Intent(this, ServiceExample.class));
                break;
            case R.id.buttonStop:
                Log.v(this.getClass().getName(), "onClick: Stopping service.");
                stopService(new Intent(this, ServiceExample.class));
                break;
        }
    }
}
