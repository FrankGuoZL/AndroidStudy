package com.frank.ch2_junior;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);


        // 六位颜色，默认为alpha为00，即透明
        // 八位颜色，ff为完全不透明，然后Red,Green,Blue

        // 从布局文件中获取名叫tv_code_six的文本视图
        TextView tv_code_six = findViewById(R.id.tv_code_six);
        // 给文本视图tv_code_six设置背景为透明的绿色，透明就是看不到
        tv_code_six.setBackgroundColor(0xff0000ff);
        //tv_code_six.setText("12345678");
        // 从布局文件中获取名叫tv_code_eight的文本视图
        TextView tv_code_eight = findViewById(R.id.tv_code_eight);
        // 给文本视图tv_code_eight设置背景为不透明的绿色，即正常的绿色
        tv_code_eight.setBackgroundColor(0xffc0ff00);
    }
}