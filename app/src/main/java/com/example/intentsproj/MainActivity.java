package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button btnok;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //defining the text objects
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);


        btnok = findViewById(R.id.btnok);
        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String n1 = num1.getText().toString();
                String n2 = num2.getText().toString();

                Intent i=new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("Extra1",n1);
                i.putExtra("Extra2",n2);

              // Toast toast =  Toast.makeText(getApplicationContext(),"opening calculator",Toast.LENGTH_LONG);

             //  toast.setGravity(Gravity.TOP|Gravity.CENTER,0,0);
              // toast.show();

                //Creating the LayoutInflater instance
                LayoutInflater li = getLayoutInflater();
                //Getting the View object as defined in the customtoast.xml file
                View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                        findViewById(R.id.custom_toast_layout));
                //Creating the Toast object
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setView(layout);//setting the view of custom toast layout
                toast.show();
                startActivity(i);
            }
        });
    }
}