package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    Button button2;
    ImageView imageview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("과제2");

        button1=findViewById(R.id.btn1);
        button2=findViewById(R.id.btn2);

        imageview1=findViewById(R.id.image);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                imageview1.setVisibility(View.VISIBLE);
                break;
            case R.id.btn2:
                imageview1.setVisibility(View.INVISIBLE);
                break;
        }
    }
}
