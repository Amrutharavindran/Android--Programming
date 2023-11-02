package com.example.calculator_functions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText text1,text2,textans;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
       textans=findViewById(R.id.textans);

        btn1 = findViewById(R.id.btn1);

    }

    public void sum(View view) {
        float n1=Float.parseFloat(text1.getText().toString());
        float n2=Float.parseFloat(text2.getText().toString());
        float s=n1+n2;
        textans.setText(Float.toString(s));


    }

    public void subtraction(View view) {
        float n1=Float.parseFloat(text1.getText().toString());
        float n2=Float.parseFloat(text2.getText().toString());
        float s = n1 - n2;
        textans.setText(Float.toString(s));

    }

    public void division(View view) {
        float n1=Float.parseFloat(text1.getText().toString());
        float n2=Float.parseFloat(text2.getText().toString());
        float s=n1/n2;
        textans.setText(Float.toString(s));


    }


    public void multiplication(View view) {
        float n1=Float.parseFloat(text1.getText().toString());
        float n2=Float.parseFloat(text2.getText().toString());
        float s=n1*n2;
        textans.setText(Float.toString(s));


    }



}
