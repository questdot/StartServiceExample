package com.example.questdot.startserviceexample;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service {
    public Thread thread = new Thread();

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        thread = new Thread(){
            @Override
            public void run() {
                super.run();


                while (!thread.isInterrupted()) {
                    System.out.println("Services runing..."+thread);
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


            }
        };

        thread.start();


        return super.onStartCommand(intent, flags, startId);
    }


}
