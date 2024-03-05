package com.example.learningpoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class Gknowladge extends AppCompatActivity {

    ListView gknowladgeListview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gknowladge);

        // Initialize the ListView
        gknowladgeListview = findViewById(R.id.gknowladgeListview);

        // Create and set the adapter
        MyAdapter myAdapter = new MyAdapter();
        gknowladgeListview.setAdapter(myAdapter);
    }

    private class MyAdapter extends BaseAdapter {
        LayoutInflater layoutInflater;

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
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = layoutInflater.inflate(R.layout.listviewitem, parent, false);
            }
            return convertView;
        }
    }
}
