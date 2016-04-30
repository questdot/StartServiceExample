package com.example.questdot.startserviceexample;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startService(new Intent(this,MyService.class));
       // isMyServiceRunning(MyService.class);
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        //this method is to stop the service, the service will not be destroy if stopservice method not been called.
       // stopService(new Intent(this,MyService.class));
    }
}
