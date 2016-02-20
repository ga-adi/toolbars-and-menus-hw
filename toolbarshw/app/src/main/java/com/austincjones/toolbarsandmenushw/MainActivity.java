package com.austincjones.toolbarsandmenushw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ted_layout);

        ImageButton check = (ImageButton)findViewById(R.id.checkimg);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Check Button Pressed", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton movebtn = (ImageButton)findViewById(R.id.movebtn);
        movebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Move Button Pressed", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton whitenbtn = (ImageButton)findViewById(R.id.whitenbtn);
        whitenbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Whiten Button Pressed", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton erasebtn = (ImageButton)findViewById(R.id.erasebtn);
        erasebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Erase Button Pressed", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton helpbtn = (ImageButton)findViewById(R.id.helpbtn);
        helpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Help Button Pressed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
