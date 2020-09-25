package com.frank.ch2_junior;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.frank.ch2_junior.util.Utils;

public class ScreenActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);
        textView=(TextView)findViewById(R.id.textview);


        int width= Utils.getScreenWidth(this);
        int height=Utils.getScreenHeight(this);
        float density=Utils.getScreenDensity(this);

        String str=String.format("当前屏幕的宽度是%dpx，高度是%dpx，像素密度是%f", width, height, density);
        textView.setText(str);
    }
}