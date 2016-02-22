package com.example.roberrera.toolbars_and_menus_hw;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class TedActivity extends AppCompatActivity {


    ImageView mLogo;
    ImageButton mBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ted);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getIntent();

        setTitle("");


        mLogo = (ImageView) findViewById(R.id.imageview_tedlogo);
        mBackButton = (ImageButton)findViewById(R.id.button_back);

        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TedActivity.this, "In future update, this will go back.", Toast.LENGTH_SHORT).show();
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TedActivity.this, "You've clicked a useless button!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ted, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id){
            case R.id.action_bookmark:
                Toast.makeText(TedActivity.this, "Video bookmarked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_share:
                Toast.makeText(TedActivity.this, "Sharing available in future update", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_download:
                Toast.makeText(TedActivity.this, "Downloading video", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
