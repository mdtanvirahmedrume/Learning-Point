package com.example.learningpoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class screen extends AppCompatActivity {

    Button btnscreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);

        btnscreen = findViewById(R.id.btnscreen);
        btnscreenAction();
    }


    private void btnscreenAction(){
        btnscreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(screen.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}