package com.example.chap2_homework;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Exercises3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_exercises3);
        ListView  listView = findViewById(R.id.listview);
        listView.setAdapter(new ListViewAdapter(this));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Exercises3.this, "当前位置" + i, Toast.LENGTH_SHORT).show();
            }
        });
        ImageView iv11 = findViewById(R.id.img11);
        TextView tv11 = findViewById(R.id.textView7);
        iv11.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                Intent it11 = new Intent(Exercises3.this, fans.class);
                it11.putExtra("String1", getText(R.id.textView7));
                startActivity(it11);
            }
        });
    }

    public static class ListViewAdapter extends BaseAdapter{
        private Context mContext;

        public ListViewAdapter(Context context){
            mContext = context;
        }
        @Override
        public int getCount() {
            return 200;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View v;
            LayoutInflater inflater = LayoutInflater.from(mContext);
            view = inflater.inflate(R.layout.list, null);
            TextView tv1 = view.findViewById(R.id.textView2);
            TextView tv2 = view.findViewById(R.id.textView9);
            TextView tv3 = view.findViewById(R.id.textView10);
            ImageView iv1 = view.findViewById(R.id.img11);
            if(i % 4 == 0){
                tv1.setText("北航学生" + i);
                tv2.setText("games?");
                tv3.setText("12:00");
                iv1.setImageResource(R.mipmap.icon_micro_game_comment);
            }
            else if(i%4 == 1){
                tv1.setText("北航老师" + i);
                tv2.setText("好好学习");
                tv3.setText("11:35");
                iv1.setImageResource(R.mipmap.session_robot);
            }
            else if(i%4 == 2){
                tv1.setText("北航cxk" + i);
                tv2.setText("喜欢唱跳rap篮球");
                tv3.setText("12:50");
                iv1.setImageResource(R.mipmap.session_stranger);
            }
            else if(i%4 == 3){
                tv1.setText("北航非凡哥" + i);
                tv2.setText("我是梁非凡");
                tv3.setText("13:00");
                iv1.setImageResource(R.mipmap.session_system_notice);
            }


            return view;
        }
    }


}
