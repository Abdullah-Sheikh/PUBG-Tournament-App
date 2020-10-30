package com.comptech.login.pubgtournament;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
public int a=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ProgressBar progressBar =(ProgressBar)findViewById(R.id.progressBar2) ;
        new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                a=a+1;
                progressBar.setProgress(a);

            }

            @Override
            public void onFinish() {


                startActivity(  new Intent(MainActivity.this, signin.class));

            }
        }.start();
    }
}