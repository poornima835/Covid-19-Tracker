package com.example.covid_19tracker;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

import android.os.Handler;


public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUTTIME  = 3000;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainactivity2Intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(mainactivity2Intent);
                finish();

            }
        },SPLASH_TIME_OUTTIME);
    }
}