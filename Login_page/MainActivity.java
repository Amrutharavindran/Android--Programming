package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainAadminctivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText user=findViewById(R.id.username);
        EditText pwd=findViewById(R.id.password);
        Button btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (user.getText().toString().equals("admin") && pwd.getText().toString().equals("123")) {
                    Toast.makeText(MainActivity.this, "Login successfull", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Login failed", Toast.LENGTH_LONG).show();


                }
            }
        });
    }
}