package com.charlesdrews.facetunetoolbars;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_top);
        setSupportActionBar(toolbar);

        // remove title from top toolbar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }

        // set on click listeners
        findViewById(R.id.back_arrow).setOnClickListener(this);
        findViewById(R.id.face_icon).setOnClickListener(this);
        findViewById(R.id.move).setOnClickListener(this);
        findViewById(R.id.whiten).setOnClickListener(this);
        findViewById(R.id.erase).setOnClickListener(this);
        findViewById(R.id.help).setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_done:
                Toast.makeText(MainActivity.this, "Done!", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back_arrow:
                Toast.makeText(MainActivity.this, "Go back", Toast.LENGTH_SHORT).show();
                break;
            case R.id.face_icon:
                Toast.makeText(MainActivity.this, "Go back", Toast.LENGTH_SHORT).show();
                break;
            case R.id.move:
                Toast.makeText(MainActivity.this, "Move", Toast.LENGTH_SHORT).show();
                break;
            case R.id.whiten:
                Toast.makeText(MainActivity.this, "Whiten", Toast.LENGTH_SHORT).show();
                break;
            case R.id.erase:
                Toast.makeText(MainActivity.this, "Erase", Toast.LENGTH_SHORT).show();
                break;
            case R.id.help:
                Toast.makeText(MainActivity.this, "Help", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
