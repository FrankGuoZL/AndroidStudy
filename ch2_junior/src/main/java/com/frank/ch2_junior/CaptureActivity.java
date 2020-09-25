package com.frank.ch2_junior;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CaptureActivity extends AppCompatActivity {
    private TextView tv_capture; // 声明一个文本视图对象
    private ImageView iv_capture; // 声明一个图像视图对象
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capture);
        // 从布局文件中获取名叫tv_capture的文本视图
        linearLayout=findViewById(R.id.LinerView);
        // 从布局文件中获取名叫iv_capture的图像视图
        iv_capture = findViewById(R.id.imageV);
        tv_capture=findViewById(R.id.dalaohu);

        // 开启文本视图tv_capture的绘图缓存
        linearLayout.setDrawingCacheEnabled(true);
        tv_capture.setDrawingCacheEnabled(true);
        iv_capture.setDrawingCacheEnabled(true);

        iv_capture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bitmap bitmap=linearLayout.getDrawingCache();
                iv_capture.setImageBitmap(bitmap);

                mHandler.postDelayed(mRunnable,1000);
            }
        });



    }
    Handler mHandler=new Handler();
    Runnable mRunnable= new Runnable() {
        @Override
        public void run() {
            linearLayout.setDrawingCacheEnabled(false);
            tv_capture.setDrawingCacheEnabled(false);
            iv_capture.setDrawingCacheEnabled(false);

            linearLayout.setDrawingCacheEnabled(true);
            tv_capture.setDrawingCacheEnabled(true);
            iv_capture.setDrawingCacheEnabled(true);
        }
    };

}