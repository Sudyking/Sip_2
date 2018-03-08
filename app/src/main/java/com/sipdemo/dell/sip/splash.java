package com.sipdemo.dell.sip;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class splash extends AppCompatActivity {
    private int Progress_Sta = 0 ;
    private ProgressBar prg;
    private Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        prg = (ProgressBar)findViewById(R.id.progressBar);
        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 1 ;
                while (i <= 100){
                    Progress_Sta+=1;
                    i++;
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            prg.setProgress(Progress_Sta);
                            if (Progress_Sta == 100) {
                                Intent in = new Intent(getApplication(), MainActivity.class);
                                startActivity(in);
                                finish();
                            }
                        }
                    });
                    try{
                        Thread.sleep(100);
                        }

                    catch (InterruptedException e){
                    }

                    }
                }
        }).start();
    }
}