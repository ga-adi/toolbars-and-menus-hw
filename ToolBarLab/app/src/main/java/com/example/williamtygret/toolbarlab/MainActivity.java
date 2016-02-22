package com.example.williamtygret.toolbarlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView mImageView;
    ImageButton mImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar)findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToNext = new Intent(MainActivity.this, TeethActivity.class);
                startActivity(intentToNext);
            }
        });

        mImageButton = (ImageButton)findViewById(R.id.imageButton);
        mImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "PLAY THE SHREK SOUNDTRACK", Toast.LENGTH_SHORT).show();
            }
        });

        mImageView = (ImageView)findViewById(R.id.imageView);
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "GET THE SHREK SOUNDTRACK TRACK LIST", Toast.LENGTH_SHORT).show();}
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);

        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_share:
                //where you put what you do to share things
                Toast.makeText(this, "Pressed Shared", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_settings:

                return true;
            case R.id.action_crop:
                Toast.makeText(MainActivity.this, "Crop That Shit!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_call:
                Toast.makeText(MainActivity.this, "DONT CALL THAT GIRL", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_search:
                Toast.makeText(MainActivity.this, "Search on em", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
