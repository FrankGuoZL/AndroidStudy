package com.frank.ch2_junior;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MarqueeActivity extends AppCompatActivity {

    TextView textView;
    boolean flag=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marquee);

        textView=(TextView)findViewById(R.id.textview);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag)
                {
                    textView.setFocusable(false);
                    textView.setFocusableInTouchMode(false);
                    flag=false;
                }else
                {
                    textView.setFocusable(true);
                    textView.setFocusableInTouchMode(true);
                    textView.requestFocus();
                    flag=true;
                }
            }
        });


    }


}