package com.example.learningpoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class Math extends AppCompatActivity {

    ListView mathlistView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        mathlistView = findViewById(R.id.mathlistView);

        MyAdapter myAdapter = new MyAdapter();
        mathlistView.setAdapter(myAdapter);

    }//One Create method end here
    private class MyAdapter extends BaseAdapter{

        LayoutInflater layoutInflater;
        @Override
        public int getCount() {
            return 20;
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
            return layoutInflater.inflate(R.layout.listviewitem, viewGroup, false);
        }
    }


}