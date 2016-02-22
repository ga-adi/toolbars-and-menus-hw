package com.sarker.toolbarsandmenuslab;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Boolean mPauseFlag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton thumbsDownButton = (ImageButton) findViewById(R.id.thumbs_down);
        ImageButton thumbsUpButton = (ImageButton) findViewById(R.id.thumbs_up);
        final ImageButton playPauseButton = (ImageButton) findViewById(R.id.play_pause);
        ImageButton skipButton = (ImageButton) findViewById(R.id.skip);

        ImageButton moveButton = (ImageButton) findViewById(R.id.move);
        ImageButton whiteButton= (ImageButton) findViewById(R.id.brush);
        ImageButton eraseButton = (ImageButton) findViewById(R.id.erase);
        ImageButton helpButton = (ImageButton) findViewById(R.id.help);

        mPauseFlag = true;

        thumbsDownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Disliked", Toast.LENGTH_SHORT).show();
            }
        });

        thumbsUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Liked", Toast.LENGTH_SHORT).show();
            }
        });

        playPauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mPauseFlag) {
                    playPauseButton.setImageResource(R.drawable.ic_pause);
                    Toast.makeText(MainActivity.this, "Paused", Toast.LENGTH_SHORT).show();
                } else {
                    playPauseButton.setImageResource(R.drawable.ic_play);
                    Toast.makeText(MainActivity.this, "Play", Toast.LENGTH_SHORT).show();
                }
                mPauseFlag = !mPauseFlag;
            }
        });

        skipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Skip", Toast.LENGTH_SHORT).show();
            }
        });


        moveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Move", Toast.LENGTH_SHORT).show();
            }
        });

        whiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Whiten", Toast.LENGTH_SHORT).show();
            }
        });

        eraseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Erase", Toast.LENGTH_SHORT).show();
            }
        });

        helpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Help", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
