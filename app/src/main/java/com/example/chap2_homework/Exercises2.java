package com.example.chap2_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Exercises2 extends AppCompatActivity {

    private static Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises2);
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.activity_exercises2, null);
        TextView t1 = findViewById(R.id.reslt);
        t1.setText("There are total amount of" + getViewCount(view));

    }

    public static int getViewCount(View view){
        int count = 0;
        if(view == null) return 0;
        else if(view instanceof ViewGroup){//if belong to ViewGroup
            count = count + 1;
            for(int i = 0; i < ((ViewGroup)view).getChildCount(); i++){
                View vtemp = ((ViewGroup)view).getChildAt(i);
                if(view instanceof  ViewGroup){
                    count = count + getViewCount(vtemp);
                }
                else{
                    count++;
                }
            }

        }
        return count;
    }


}
