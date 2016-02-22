package com.example.williamtygret.toolbarlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class TeethActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teeth);

        ImageView teethImg = (ImageView)findViewById(R.id.imageView2);
        teethImg.setImageResource(R.drawable.teethpic);

        ImageButton yellowImg = (ImageButton)findViewById(R.id.imageButtonYell);
        yellowImg.setImageResource(R.drawable.ic_open_with_black_18dp);
        yellowImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TeethActivity.this, "You Clicked the MOVE button!", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton blueImg = (ImageButton)findViewById(R.id.imageButtonBlue);
        blueImg.setImageResource(R.drawable.ic_brightness_5_black_18dp);
        blueImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TeethActivity.this, "Whiten Yo Teeth!!", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton redImg = (ImageButton)findViewById(R.id.imageButtonRed);
        redImg.setImageResource(R.drawable.ic_create_black_18dp);
        redImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TeethActivity.this, "Erase Your Teeth!", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton greenImg = (ImageButton)findViewById(R.id.imageButtonGreen);
        greenImg.setImageResource(R.drawable.ic_help_black_18dp);
        greenImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TeethActivity.this, "Get Help", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
