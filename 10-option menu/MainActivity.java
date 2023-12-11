package com.example.menu;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuInflater;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

   public boolean onOptionsItemSelected(@Nullable MenuItem item){
        Intent intent =new Intent();

        if (item.getItemId()== R.id.item3){
                intent.setClass(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                return true;}
        else if (item.getItemId()== R.id.item4){
                intent.setClass(MainActivity.this,MainActivity3.class);
                startActivity(intent);
                return true;}

        else {
            return super.onOptionsItemSelected(item);


        }
    }
}
