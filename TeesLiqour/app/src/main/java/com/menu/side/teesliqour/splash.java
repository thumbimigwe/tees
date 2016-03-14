package com.menu.side.teesliqour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.logging.Handler;

public class splash extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 4000;

//    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable() {

            public void run() {
                Intent intent = new Intent(splash.this, Main.class);
                startActivity(intent);

                finish();
            }
           }, SPLASH_TIME_OUT);
    }
}
