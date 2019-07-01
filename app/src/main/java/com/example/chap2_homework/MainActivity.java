package com.example.chap2_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt1 = findViewById(R.id.btn1);
       bt1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent it1 = new Intent(MainActivity.this, Exercises1.class);
               startActivity(it1);
           }
       });
       Button bt2 = findViewById(R.id.btn2);
       bt2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent it2 = new Intent(MainActivity.this, Exercises2.class);
               startActivity(it2);
           }
       });
       Button bt3 = findViewById(R.id.btn3);
       bt3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent it3 = new Intent(MainActivity.this, Exercises3.class);
               startActivity(it3);
           }
       });

    }


}
