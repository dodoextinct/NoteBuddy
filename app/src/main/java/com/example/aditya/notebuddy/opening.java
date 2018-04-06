package com.example.aditya.notebuddy;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class opening extends AppCompatActivity {

    TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);

        imageView = (ImageView)findViewById(R.id.splashscreen);
        textView = (TextView)findViewById(R.id.teo);
        int secondsDelayed = 1;
        new Handler().postDelayed(new Runnable() {
            public void run() {

                startActivity(new Intent(opening.this, LaunchingActivity.class));
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();
            }
        }, secondsDelayed * 1000);

        getSupportActionBar().hide();
    }

}
