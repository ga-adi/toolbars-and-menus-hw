package com.example.wasabi.toolbarhomework;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    boolean isLiked;
    MediaPlayer mMediaPlayer;
    ImageView mPlayIcon, mForwardIcon, mAlbumArt, mSettingsIcon, mPersonalIcon, mChatIcon;
    TextView mLikeText, mDislikeText, mTimeElapsedText, mTimeRemainingText;
    SeekBar mSeekbar;
    double finalTime, elapsedTime;
    int forwardTime = 2000;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        isLiked = false;
        mAlbumArt = (ImageView) findViewById(R.id.albumart);
        mSettingsIcon = (ImageView) findViewById(R.id.settings_imageview);
        mPersonalIcon = (ImageView) findViewById(R.id.personal_imageview);
        mChatIcon = (ImageView) findViewById(R.id.comment_imageview);
        mPlayIcon = (ImageView) findViewById(R.id.play_icon);
        mForwardIcon = (ImageView) findViewById(R.id.forward_icon);
        mLikeText = (TextView) findViewById(R.id.like_textview);
        mDislikeText = (TextView) findViewById(R.id.dislike_textview);
        mTimeElapsedText = (TextView) findViewById(R.id.elapsed_time_textview);
        mTimeRemainingText = (TextView) findViewById(R.id.remaining_time_textview);
        mSeekbar = (SeekBar) findViewById(R.id.seekbar);
        mMediaPlayer = MediaPlayer.create(this, R.raw.bensound_funnysong);

        finalTime = (double) mMediaPlayer.getDuration();
        int finalMin = (int)(TimeUnit.MILLISECONDS.toMinutes((long)finalTime));
        int finalSec = (int)(TimeUnit.MILLISECONDS.toSeconds((long)finalTime) - TimeUnit.MINUTES.toSeconds(finalMin));
        mSeekbar.setMax((int) finalTime);
        mSeekbar.setClickable(false);

        if(mSettingsIcon!=null && mPersonalIcon != null && mChatIcon != null) {
            mSettingsIcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "Pressed settings icon", Toast.LENGTH_SHORT).show();
                }
            });
            mPersonalIcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "Pressed personal info icon", Toast.LENGTH_SHORT).show();
                }
            });
            mChatIcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "Pressed chat icon", Toast.LENGTH_SHORT).show();
                }
            });
        }

        mTimeElapsedText.setText("0:00");
        if(finalSec<10){
            mTimeRemainingText.setText(finalMin + ":0" + finalSec);
        }else {
            mTimeRemainingText.setText(finalMin + ":" + finalSec);
        }

        mAlbumArt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TedActivity.class);
                startActivity(intent);
            }
        });
        mLikeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Pressed like button", Toast.LENGTH_SHORT).show();
            }
        });

        mDislikeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Pressed dislike button", Toast.LENGTH_SHORT).show();
            }
        });

        mPlayIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mMediaPlayer.isPlaying()) {
                    mMediaPlayer.pause();
                    mPlayIcon.setImageResource(android.R.drawable.ic_media_play);
                } else {
                    mPlayIcon.setImageResource(android.R.drawable.ic_media_pause);
                    mMediaPlayer.start();
                    elapsedTime = mMediaPlayer.getCurrentPosition();
                    mSeekbar.setProgress((int) elapsedTime);
                    handler.postDelayed(updateSeekbarTime, 100);
                }
            }
        });

        mForwardIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((elapsedTime+forwardTime) < mMediaPlayer.getDuration()){
                    elapsedTime += forwardTime;
                    mMediaPlayer.seekTo((int)elapsedTime);
                }
            }
        });
    }

    Runnable updateSeekbarTime = new Runnable() {
        @Override
        public void run() {
            elapsedTime = mMediaPlayer.getCurrentPosition();
            mSeekbar.setProgress((int) elapsedTime);

            double remainingTime = finalTime - elapsedTime;
            int remainingMin = (int) (TimeUnit.MILLISECONDS.toMinutes((long) remainingTime));
            int remainingSec = (int) ((TimeUnit.MILLISECONDS.toSeconds((long) remainingTime)) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) remainingTime)));

            if(remainingSec<10){
                mTimeRemainingText.setText(remainingMin + ":0" + remainingSec);
            }else{
                mTimeRemainingText.setText(remainingMin + ":" + remainingSec);
            }

            int elapsedMin = (int)(TimeUnit.MILLISECONDS.toMinutes((long)elapsedTime));
            int elapsedSec = (int) ((TimeUnit.MILLISECONDS.toSeconds((long)elapsedTime)) - (TimeUnit.MINUTES.toSeconds((long)elapsedMin)));

            if(elapsedSec<10){
                mTimeElapsedText.setText(elapsedMin + ":0" + elapsedSec);
            } else {
                mTimeElapsedText.setText(elapsedMin + ":" + elapsedSec);
            }

            handler.postDelayed(this, 100);
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.pandora_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_like:
                Toast.makeText(MainActivity.this, "Pressed like button", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
