package com.example.android.toolbars;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mPlayButton;
    ImageView mNextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPlayButton = (ImageView) findViewById(R.id.thePlayButton);
        mNextButton = (ImageView) findViewById(R.id.nextButton);

        mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
                mPlayButton.startAnimation(animation);

            }
        });


        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}
