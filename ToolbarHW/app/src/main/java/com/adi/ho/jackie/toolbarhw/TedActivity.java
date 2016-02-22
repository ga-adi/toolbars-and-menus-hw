package com.adi.ho.jackie.toolbarhw;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class TedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ted);

        Toolbar topToolbar = (Toolbar) findViewById(R.id.ted_toptoolbar);
        setSupportActionBar(topToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("");

        TabLayout tablayout = (TabLayout) findViewById(R.id.ted_tablayout);
        tablayout.addTab(tablayout.newTab().setText("About"));
        tablayout.addTab(tablayout.newTab().setText("Watch Next"));
        tablayout.addTab(tablayout.newTab().setText("Related"));
        tablayout.setTabGravity(TabLayout.GRAVITY_CENTER);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.ted_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            case R.id.action_share:
                Toast.makeText(TedActivity.this, "Share this", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_bookmark:
                Toast.makeText(TedActivity.this, "Bookmarked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_download:
                Toast.makeText(TedActivity.this, "Downloading", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
