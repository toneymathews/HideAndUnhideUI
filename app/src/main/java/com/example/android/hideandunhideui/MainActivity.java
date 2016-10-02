package com.example.android.hideandunhideui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
    }
    public void hideTextView(View v){
        textView.setVisibility(View.INVISIBLE);
    }
    public void showTextView(View v){
        textView.setVisibility(View.VISIBLE);
    }
}
