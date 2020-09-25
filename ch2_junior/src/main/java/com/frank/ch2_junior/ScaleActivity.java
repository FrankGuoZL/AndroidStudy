package com.frank.ch2_junior;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ScaleActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView iv_scale; // 声明一个图像视图的对象
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale);

        // 从布局文件中获取名叫iv_scale的图像视图
        iv_scale = findViewById(R.id.iv_scale);
        // 下面通过七个按钮，分别演示不同拉伸类型的图片拉伸效果
        findViewById(R.id.btn_center).setOnClickListener(this);
        findViewById(R.id.btn_fitCenter).setOnClickListener(this);
        findViewById(R.id.btn_centerCrop).setOnClickListener(this);
        findViewById(R.id.btn_centerInside).setOnClickListener(this);
        findViewById(R.id.btn_fitXY).setOnClickListener(this);
        findViewById(R.id.btn_fitStart).setOnClickListener(this);
        findViewById(R.id.btn_fitEnd).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn_center:
                // 将拉伸类型设置为“按照原尺寸居中显示”
                iv_scale.setScaleType(ImageView.ScaleType.CENTER);
                break;
            case R.id.btn_fitCenter:
                // 将拉伸类型设置为“按照原尺寸居中显示”
                iv_scale.setScaleType(ImageView.ScaleType.FIT_CENTER);
                break;
            case R.id.btn_centerCrop:
                // 将拉伸类型设置为“按照原尺寸居中显示”
                iv_scale.setScaleType(ImageView.ScaleType.CENTER_CROP);
                break;
            case R.id.btn_centerInside:
                // 将拉伸类型设置为“按照原尺寸居中显示”
                iv_scale.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                break;
            case R.id.btn_fitXY:
                // 将拉伸类型设置为“按照原尺寸居中显示”
                iv_scale.setScaleType(ImageView.ScaleType.FIT_XY);
                break;
            case R.id.btn_fitStart:
                // 将拉伸类型设置为“按照原尺寸居中显示”
                iv_scale.setScaleType(ImageView.ScaleType.FIT_START);
                break;
            case R.id.btn_fitEnd:
                // 将拉伸类型设置为“按照原尺寸居中显示”
                iv_scale.setScaleType(ImageView.ScaleType.FIT_END);
                break;

        }
    }
}