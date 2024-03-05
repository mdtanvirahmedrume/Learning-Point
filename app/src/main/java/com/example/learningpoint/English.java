package com.example.learningpoint;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class English extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);

        listView = findViewById(R.id.listView);

        MyAdapter myAdapter = new MyAdapter();
        listView.setAdapter(myAdapter);


    }//One Create Method End Here

    private class MyAdapter extends BaseAdapter{

        LayoutInflater  layoutInflater;

        @Override
        public int getCount() {
            return 25;
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
            layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            @SuppressLint("ViewHolder")
            View Myview = layoutInflater.inflate(R.layout.listviewitem, viewGroup,false);

            return Myview;
        }
    }

}