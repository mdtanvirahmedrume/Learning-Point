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

public class Biology extends AppCompatActivity {

    ListView bioListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biology);
        bioListView = findViewById(R.id.bioListView);

        MyAdapter myAdapter = new MyAdapter();
        bioListView.setAdapter(myAdapter);

    }
    //ADAPTER MAKING
    private class MyAdapter extends BaseAdapter {
        LayoutInflater  layoutInflater;
        @Override
        public int getCount() {
            return 25;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            @SuppressLint("ViewHolder")
            View view = layoutInflater.inflate(R.layout.listviewitem, parent,false);

            return view;
        }
    }


}