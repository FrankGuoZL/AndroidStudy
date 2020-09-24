package com.example.ch1_helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         textView=(TextView)findViewById(R.id.textview);
        Resources resources = getResources();
        String string = resources.getString(R.string.hello_frank);
        textView.setText(string);
        textView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==textView.getId())
        {

        }
    }
}
