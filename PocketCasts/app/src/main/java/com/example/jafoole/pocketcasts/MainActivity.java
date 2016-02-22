package com.example.jafoole.pocketcasts;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        ImageView imageView2 = (ImageView)findViewById(R.id.imageView2);
        TextView text2 = (TextView)findViewById(R.id.text2);


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Pressed Album Cover Image", Toast.LENGTH_SHORT).show();
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Pressed Play Button", Toast.LENGTH_SHORT).show();
            }
        });






    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_more:
                Toast.makeText(MainActivity.this, "Pressed More Button", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_add:
                Toast.makeText(MainActivity.this, "Pressed Add Button", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_cast:
                Toast.makeText(MainActivity.this, "Pressed Cast Button", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}


