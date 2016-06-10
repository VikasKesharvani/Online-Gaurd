package com.eighteentechnology.onlinegaurd.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.eighteentechnology.onlinegaurd.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach);
        startSplashScreen();
    }
    private void startSplashScreen() {
        Thread background = new Thread() {
            public void run() {

                try {
                    sleep(4 * 500);



                        Intent i = new Intent(SplashActivity.this, LoginActivity.class);

                        startActivity(i);
                        finish();


                } catch (Exception e) {

                }
            }
        };

        background.start();
    }
}
