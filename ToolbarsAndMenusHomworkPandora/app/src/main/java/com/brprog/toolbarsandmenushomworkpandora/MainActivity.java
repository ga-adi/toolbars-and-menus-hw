package com.brprog.toolbarsandmenushomworkpandora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Toolbar mMainToolbar;
    ImageButton mThumbsDownImageButton;
    ImageButton mBlurbImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainToolbar = (Toolbar) findViewById(R.id.main_toolbar);
        setSupportActionBar(mMainToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        //Responding to UI events
        mThumbsDownImageButton = (ImageButton)findViewById(R.id.thumbs_down_button);
        mBlurbImageButton = (ImageButton)findViewById(R.id.blurb_button);
        mBlurbImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Yeah this song kind of sucks!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    onCreateOptionsM
}
