package com.example.learningpoint;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bdtopcoder.smart_slider.SliderAdapter;
import com.bdtopcoder.smart_slider.SliderItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button biology,english,math,gknowladge;
    ImageView Whatsapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager2 viewPager2 = findViewById(R.id.smartSlider);
        biology = findViewById(R.id.biology);
        english = findViewById(R.id.english);
        math = findViewById(R.id.math);
        gknowladge = findViewById(R.id.gknowladge);
        Whatsapp = findViewById(R.id.Whatsapp);



        List<SliderItem> sliderItems = new ArrayList<>();
        sliderItems.add(new SliderItem(R.drawable.img1,"image 1"));
        sliderItems.add(new SliderItem(R.drawable.img2,"Image 2"));
        sliderItems.add(new SliderItem(R.drawable.img3,"Image 3"));

        viewPager2.setAdapter(new SliderAdapter(sliderItems,viewPager2,3000));

         new SliderAdapter((position, title, view) -> Toast.makeText(this, "Position: "+position+" Title: "+title, Toast.LENGTH_SHORT).show());


         //Function Calling Method is Here
        biologyCall();
        englishCall();
        mathCall();
        gknowladgeCall();
        WhatsappCall();


    }//Oncreate Method Close here

    private void gknowladgeCall() {
        gknowladge.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Gknowladge.class);
            startActivity(intent);
        });
    }

    private void mathCall() {
        math.setOnClickListener(v ->{
                Intent intent = new Intent(MainActivity.this, Math.class);
                startActivity(intent);
        });
    }

    private void englishCall() {
        english.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, English.class);
                startActivity(intent);

        });
    }

    private void biologyCall() {
        biology.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Biology.class);
            startActivity(intent);
        });
    }

    //Whatsapp Function
    private void WhatsappCall() {
        Whatsapp.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("QueryPermissionsNeeded")
            @Override
            public void onClick(View v) {
                String phoneNumber = "+8801728491646"; // Corrected phone number format
                String whatsappUrl = "https://wa.me/" + phoneNumber;

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(whatsappUrl));
                intent.setPackage("com.whatsapp");

                PackageManager pm = getPackageManager();
                if (intent.resolveActivity(pm) != null) {
                    try {
                        startActivity(intent);
                    } catch (Exception e) {
                        e.printStackTrace();
                        Toast.makeText(getApplicationContext(), "Error opening WhatsApp.", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    String message = "WhatsApp is not installed on your device.";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }



}