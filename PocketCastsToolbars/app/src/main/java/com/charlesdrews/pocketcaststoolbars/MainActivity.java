package com.charlesdrews.pocketcaststoolbars;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private boolean mPlaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_top);
        setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(R.drawable.ic_menu_white_18dp);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Podcasts");
        }

        findViewById(R.id.play_pause).setOnClickListener(MainActivity.this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Toast.makeText(MainActivity.this, "Show menu", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_cast:
                Toast.makeText(MainActivity.this, "Cast to Chromecast", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_add:
                Toast.makeText(MainActivity.this, "Add a podcast", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_settings:
                Toast.makeText(MainActivity.this, "Settings", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.play_pause:
                mPlaying = !mPlaying;
                if (mPlaying) {
                    v.setBackgroundResource(R.drawable.ic_pause_circle_outline_white_48dp);
                    Toast.makeText(MainActivity.this, "Podcast is playing", Toast.LENGTH_SHORT).show();
                } else {
                    v.setBackgroundResource(R.drawable.ic_play_circle_outline_white_48dp);
                    Toast.makeText(MainActivity.this, "Podcast is paused", Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                break;
        }
    }
}
