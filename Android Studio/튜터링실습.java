package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RadioGroup radioGroup;
    RadioButton radioButton1;
    RadioButton radioButton2;
    ImageView imageview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("튜터링 실습");

        radioGroup=findViewById(R.id.radiogroup);
        radioButton1=findViewById(R.id.radio1);
        radioButton2=findViewById(R.id.radio2);

        imageview1=findViewById(R.id.image);

        radioButton1.setOnClickListener(this);
        radioButton2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
                case R.id.radio1:
                    imageview1.setVisibility(View.VISIBLE);
                    break;
                case R.id.radio2:
                    imageview1.setVisibility(View.GONE);
                    break;

        }
    }
}
