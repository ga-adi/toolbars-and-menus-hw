package com.adi.ho.jackie.toolbarhw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class PocketcastActivity extends AppCompatActivity {

    private boolean playingPodcast = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pocketcast);
        Toolbar topToolbar = (Toolbar) findViewById(R.id.top_pocketcasttoolbar);
        setSupportActionBar(topToolbar);
        Toolbar botToolbar = (Toolbar)findViewById(R.id.bot_pocketcasetoolbar);

        ImageView altMenu = (ImageView)findViewById(R.id.altmenu);
        final ImageView bottomPlayButton = (ImageView)findViewById(R.id.podcast_play_button);

        bottomPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int playPause = playingPodcast ? android.R.drawable.ic_media_pause : android.R.drawable.ic_media_play;
                playingPodcast = !playingPodcast;
                bottomPlayButton.setBackgroundResource(playPause);
            }
        });

        altMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PocketcastActivity.this, "Another menu appears", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.pocketcast_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_add:
                Toast.makeText(PocketcastActivity.this, "Adding something", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_screen:
                Toast.makeText(PocketcastActivity.this, "Don't know what this does", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_settings:
                Toast.makeText(PocketcastActivity.this, "Open up settings", Toast.LENGTH_SHORT).show();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
