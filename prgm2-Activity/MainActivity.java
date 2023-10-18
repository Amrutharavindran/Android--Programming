package com.example.activity_cycle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               btnOnclick();
            }
        });
        Log.i("my tag","on create");
    Toast.makeText(this, "on create", Toast.LENGTH_SHORT).show();
}
    private void btnOnclick() {
        Intent in=new Intent(this,MainActivity2.class);
        startActivity(in);
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("my tag","on restart");
        Toast.makeText(this, "on restart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("my tag","on pause");
        Toast.makeText(this, "on pause", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("my tag","on start");
        Toast.makeText(this, "on start", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("my tag","on destroy");
        Toast.makeText(this, "on destroy", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("my tag","on stop");
        Toast.makeText(this, "on stop", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("my tag","on resume");
        Toast.makeText(this, "on resume", Toast.LENGTH_SHORT).show();
    }
}


