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
            case R.id.btn_marquee:
                Log.d(TAG,"MarqueeActivity");
                startActivity(new Intent(this, MarqueeActivity.class));
                break;
            case R.id.btn_bbs:
                Log.d(TAG,"BbsActivity");
                startActivity(new Intent(this, BbsActivity.class));
                break;
            case R.id.btn_click:
                Log.d(TAG,"ClickActivity");
                startActivity(new Intent(this, ClickActivity.class));
                break;
            case R.id.btn_scale:
                Log.d(TAG,"ScaleActivity");
                startActivity(new Intent(this, ScaleActivity.class));
                break;

            case R.id.btn_capture:
                Log.d(TAG,"CaptureActivity");
                startActivity(new Intent(this, CaptureActivity.class));
                break;
            case R.id.btn_icon:
                Log.d(TAG,"IconActivity");
                startActivity(new Intent(this, IconActivity.class));
                break;
            case R.id.btn_state:
                Log.d(TAG,"StateActivity");
                startActivity(new Intent(this, StateActivity.class));
                break;
            case R.id.btn_shape:
                Log.d(TAG,"ShapeActivity");
                startActivity(new Intent(this, ShapeActivity.class));
                break;
            case R.id.btn_nine:
                Log.d(TAG,"BbsActivity");
                startActivity(new Intent(this, NineActivity.class));
                break;
            case R.id.btn_calculator:
                Log.d(TAG,"BbsActivity");
                startActivity(new Intent(this, CalculatorActivity.class));
                break;
        }
    }
}
