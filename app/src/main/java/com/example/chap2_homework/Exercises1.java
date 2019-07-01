package com.example.chap2_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import static java.lang.System.*;

public class Exercises1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("OnCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises1);
    }

    @Override
    protected void onStart() {
        System.out.println("OnStart");
        super.onStart();
    }

    @Override
    protected void onStop() {
        System.out.println("OnStop");
        super.onStop();
    }

    @Override
    protected void onPause() {
        System.out.println("OnPause");
        super.onPause();
    }

    @Override
    protected void onResume() {
        System.out.println("OnResume");
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        System.out.println("OnDestroy");
        super.onDestroy();
    }
}
