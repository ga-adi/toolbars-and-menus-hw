package com.adi.ho.jackie.toolbarhw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button mPandora;
    public Button mFacetune;
    public Button mPocketcast;
    public Button mTed;
    private MenuInflater menuInflater;
    private boolean isPandoraPlaying = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFacetune = (Button) findViewById(R.id.facetune_button);
        mPocketcast = (Button) findViewById(R.id.pocketcast_button);
        mTed = (Button) findViewById(R.id.ted_button);
        menuInflater = getMenuInflater();

        Toolbar topToolbar = (Toolbar) findViewById(R.id.top_toolbar);
        Toolbar botToolbar = (Toolbar) findViewById(R.id.bot_toolbar);
        setSupportActionBar(topToolbar);

        botToolbar.inflateMenu(R.menu.bottom_pandora_menu);
        botToolbar.setOnMenuItemClickListener(pandoraBottomMenuListener);

        //Listeners for buttons
        mPocketcast.setOnClickListener(pocketcastListener);
        mFacetune.setOnClickListener(facetuneListener);
        mTed.setOnClickListener(tedListener);

    }

    Toolbar.OnMenuItemClickListener pandoraBottomMenuListener = new Toolbar.OnMenuItemClickListener() {
        @Override
        public boolean onMenuItemClick(MenuItem item) {
            switch (item.getItemId()) {
                case R.id.action_thumbsupbot:
                    Toast.makeText(MainActivity.this, "Thumbs up bottom", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.action_fastforward:
                    Toast.makeText(MainActivity.this, "Fastforwarding", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.action_playpause:
                    int mediaIcon = isPandoraPlaying ? android.R.drawable.ic_media_pause: android.R.drawable.ic_media_play;
                    item.setIcon(mediaIcon);
                    isPandoraPlaying = !isPandoraPlaying;
                    return true;
                case R.id.action_thumbsdown:
                    Toast.makeText(MainActivity.this, "Thumbing down", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.action_comment:
                    Toast.makeText(MainActivity.this, "Going to comments", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.action_friends:
                    Toast.makeText(MainActivity.this, "Friends", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.action_settings:
                    Toast.makeText(MainActivity.this, "Settings", Toast.LENGTH_SHORT).show();
                    return true;
                default: return false;

            }
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menuInflater.inflate(R.menu.pandora_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_thumbsup:
                Toast.makeText(MainActivity.this, "Thumbs up", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    View.OnClickListener pocketcastListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,PocketcastActivity.class);
            startActivity(intent);
        }
    };
    View.OnClickListener facetuneListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(MainActivity.this,FacetuneActivity.class);
            startActivity(i);
        }
    };
    View.OnClickListener tedListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent j = new Intent(MainActivity.this, TedActivity.class);
            startActivity(j);
        }
    };
}
