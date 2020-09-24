package com.frank.ch2_junior;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    static final  String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_px).setOnClickListener(this);
        findViewById(R.id.btn_color).setOnClickListener(this);
        findViewById(R.id.btn_screen).setOnClickListener(this);
        findViewById(R.id.btn_margin).setOnClickListener(this);
        findViewById(R.id.btn_gravity).setOnClickListener(this);
        findViewById(R.id.btn_scroll).setOnClickListener(this);
        findViewById(R.id.btn_marquee).setOnClickListener(this);
        findViewById(R.id.btn_bbs).setOnClickListener(this);
        findViewById(R.id.btn_click).setOnClickListener(this);
        findViewById(R.id.btn_scale).setOnClickListener(this);
        findViewById(R.id.btn_capture).setOnClickListener(this);
        findViewById(R.id.btn_icon).setOnClickListener(this);
        findViewById(R.id.btn_state).setOnClickListener(this);
        findViewById(R.id.btn_shape).setOnClickListener(this);
        findViewById(R.id.btn_nine).setOnClickListener(this);
        findViewById(R.id.btn_calculator).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {

            case R.id.btn_px:
                Log.d(TAG,"PxActivity");
                startActivity(new Intent(this,PxActivity.class));
                break;
            case R.id.btn_color:
                Log.d(TAG,"ColorActivity");
                startActivity(new Intent(this,ColorActivity.class));
                break;
            case R.id.btn_screen:
                Log.d(TAG,"ScreenActivity");
                startActivity(new Intent(this,ScreenActivity.class));
                break;
            case R.id.btn_margin:
                Log.d(TAG,"MarginActivity");
                startActivity(new Intent(this,MarginActivity.class));
                break;

            case R.id.btn_gravity:
                Log.d(TAG,"GravityActivity");
                startActivity(new Intent(this, GravityActivity.class));
                break;
            case R.id.btn_scroll:
                Log.d(TAG,"GravityActivity");
                startActivity(new Intent(this, ScrollActivity.class));
                break;
        }
    }
}
