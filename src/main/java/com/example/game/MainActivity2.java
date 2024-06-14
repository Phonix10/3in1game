package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    ImageButton tik,che,snk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tik=findViewById(R.id.imageButton);
        tik.setBackgroundResource(R.drawable.tictak);
        che=findViewById(R.id.imageButton2);
        che.setBackgroundResource(R.drawable.chess);
        snk = findViewById(R.id.imageButton3);
        snk.setBackgroundResource(R.drawable.snakesim);

        tik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(in);
            }
        });
        che.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity2.this,MainActivity4.class);
                startActivity(in);
            }
        });
        snk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity2.this,MainActivity5.class);
                startActivity(in);
            }
        });


    }
}
