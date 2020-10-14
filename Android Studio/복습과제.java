package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    Button button2;
    Button button3;
    TextView textview1;
    TextView textview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("복습과제");

        button1=findViewById(R.id.btn1);
        button2=findViewById(R.id.btn2);
        button3=findViewById(R.id.btn3);
        textview1=findViewById(R.id.text1);
        textview2=findViewById(R.id.text2);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                textview1.setText("버튼 눌림");
                textview2.setText("1번 버튼 눌림");
                break;
            case R.id.btn2:
                textview2.setText("2번 버튼 눌림");
                break;
            case R.id.btn3:
                textview2.setText("3번 버튼 눌림");
                break;
        }
    }
}
