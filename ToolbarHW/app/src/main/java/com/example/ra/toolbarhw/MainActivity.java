package com.example.ra.toolbarhw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView mDownload;
    ImageView mShare;
    ImageView mBookmark;
    ImageButton mBackButton;
    Button mButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar= (Toolbar)findViewById(R.id.bottom_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setClickable(true);
        mDownload= (ImageView)findViewById(R.id.action_pause_button);
        mBookmark=(ImageView)findViewById(R.id.bookmark);
        mShare=(ImageView)findViewById(R.id.share);
        mBackButton=(ImageButton)findViewById(R.id.backbutton);


        mDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Download This", Toast.LENGTH_SHORT).show();
            }
        });
        mBookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Bookmark this", Toast.LENGTH_SHORT).show();
            }
        });
        mShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Share this", Toast.LENGTH_SHORT).show();
            }
        });
        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Go home", Toast.LENGTH_SHORT).show();
            }
        });
        mButton=(Button)findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,Facetune.class);
                startActivity(intent);
            }
        });
    }



}
