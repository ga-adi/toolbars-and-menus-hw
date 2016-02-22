package com.example.wasabi.toolbarhomework;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class PocketCastsActivity extends AppCompatActivity {

    MediaPlayer mMediaPlayer;
    ImageView playIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pocket_casts);

        Toolbar toolbar = (Toolbar) findViewById(R.id.pocket_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(android.R.drawable.ic_menu_agenda);

        mMediaPlayer = MediaPlayer.create(this, R.raw.bensound_funnysong);

        playIcon = (ImageView)findViewById(R.id.pocket_play_icon);
        playIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mMediaPlayer.isPlaying()){
                    mMediaPlayer.pause();
                    playIcon.setImageResource(android.R.drawable.ic_media_play);
                }else{
                    mMediaPlayer.start();
                    playIcon.setImageResource(android.R.drawable.ic_media_pause);
                }
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.podcast_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_mirror:
                Toast.makeText(PocketCastsActivity.this, "Pressed mirror icon", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_plus:
                Toast.makeText(PocketCastsActivity.this, "Pressed add icon", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_settings:
                Toast.makeText(PocketCastsActivity.this, "Pressed settings icon", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
