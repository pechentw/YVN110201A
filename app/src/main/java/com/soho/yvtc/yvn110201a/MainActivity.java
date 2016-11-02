package com.soho.yvtc.yvn110201a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button btn = new Button(MainActivity.this);
//        setContentView(btn);
        Button btn = new Button(MainActivity.this);
        btn.setText("Click!!");
        Button btn2 = new Button(MainActivity.this);
        btn2.setText("Click2222!!");
        LinearLayout layout = (LinearLayout) findViewById(R.id.activity_main);
        layout.addView(btn);
        layout.addView(btn2);

    }
}
