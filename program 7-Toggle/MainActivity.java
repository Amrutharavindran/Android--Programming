package com.example.toggle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int images[] ={R.drawable.flower, R.drawable.dried};
    int currentindex=0;
   Button btn;
   ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        image = findViewById(R.id.imageView);

    }
    public void Click(View view) {
        currentindex();
    }
    private void currentindex(){
        switch (currentindex){
            case 0:image.setImageResource(images[1]);
            currentindex=1;
            break;
             case 1:image.setImageResource(images[0]);
             currentindex=0;
             break;
        }
    }
}
