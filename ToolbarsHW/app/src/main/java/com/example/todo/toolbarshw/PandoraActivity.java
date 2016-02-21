package com.example.todo.toolbarshw;

import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;

public class PandoraActivity extends AppCompatActivity {

    private Toolbar mTopToolbar, mBottomToolbar;
    private ActionBar mActionbar;
    private ImageView mThumbsUp,mThumbsDown,mPause,mSkip;
    private SeekBar mSeekbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pandora);

        mTopToolbar = (Toolbar)findViewById(R.id.xmlPandoraActionBar);
        mBottomToolbar = (Toolbar)findViewById(R.id.xmlPandoraToolBarBottom);
        mThumbsDown = (ImageView)findViewById(R.id.xmlPandoraBottomThumbsDown);
        mThumbsUp = (ImageView)findViewById(R.id.xmlPandoraBottomThumbsUp);
        mPause = (ImageView)findViewById(R.id.xmlPandoraBottomPause);
        mSkip = (ImageView)findViewById(R.id.xmlPandoraBottomSkip);
        mSeekbar = (SeekBar)findViewById(R.id.xmlPandoraSeekbar);

        mTopToolbar.setTitle("PANDORA");
        mTopToolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(mTopToolbar);
        mActionbar = getSupportActionBar();
        mActionbar.setDisplayHomeAsUpEnabled(true);
        mActionbar.setHomeAsUpIndicator(null);

        mBottomToolbar.inflateMenu(R.menu.menu_pandorabottom);
        mBottomToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int id = item.getItemId();
                switch (id) {
                    case R.id.action_pandoraDialog:
                        Toast.makeText(PandoraActivity.this, "Dialog button clicked!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_pandoraFriend:
                        Toast.makeText(PandoraActivity.this, "Friend button clicked!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_pandoraSettings:
                        Toast.makeText(PandoraActivity.this, "Settings button clicked!", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
        mThumbsDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PandoraActivity.this, "Thumbs Down!", Toast.LENGTH_SHORT).show();
            }
        });
        mThumbsUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PandoraActivity.this, "Thumbs up!", Toast.LENGTH_SHORT).show();
            }
        });
        mPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PandoraActivity.this, "Paused!", Toast.LENGTH_SHORT).show();
            }
        });
        mSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PandoraActivity.this, "Skipped!", Toast.LENGTH_SHORT).show();
            }
        });
        mSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(PandoraActivity.this, "Seekbar moving!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(PandoraActivity.this, "Seekbar Touched", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(PandoraActivity.this, "Seekbar free!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_pandoratop,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.action_pandoraTopLike){
            Toast.makeText(PandoraActivity.this, "Liked!", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
