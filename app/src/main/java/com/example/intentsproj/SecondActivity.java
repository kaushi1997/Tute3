package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText num1, num2;
    String n1, n2;
    int no1, no2;
    TextView label;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        label = findViewById(R.id.label);

        Intent i = getIntent();

         n1 = i.getStringExtra("n1");
         n2 = i.getStringExtra("n2");

        num1.setText(n1);
        num2.setText(n2);

        no1 = Integer.parseInt(n1);
        no2 = Integer.parseInt(n2);
    }

    public void add(View v){

        label.setText(n1+"+"+n2+"="+(no1+no2));
    }

    public void substract(View v){

        label.setText(n1+"-"+n2+"="+(no1-no2));
    }

    public void multiply(View v){

        label.setText(n1+"x"+n2+"="+(no1*no2));
    }

    public void divide(View v){

        label.setText(n1+"/"+n2+"="+(no1/no2));
    }
}