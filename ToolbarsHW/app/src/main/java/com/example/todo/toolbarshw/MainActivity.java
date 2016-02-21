package com.example.todo.toolbarshw;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton mFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mFab = (FloatingActionButton) findViewById(R.id.fab);
        mFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Use the ActionBar to navigate!", Snackbar.LENGTH_LONG)
                        .setAction("Animate?", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Animation anim = AnimationUtils.loadAnimation(MainActivity.this,R.anim.custom);
                                mFab.setAnimation(anim);
                            }
                        }).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        Intent intent;
        switch (id) {
            case (R.id.action_Ted):
                intent = new Intent(MainActivity.this, TedActivity.class);
                startActivity(intent);
                return true;
            case (R.id.action_Pandora):
                intent = new Intent(MainActivity.this, PandoraActivity.class);
                startActivity(intent);
                return true;
            case (R.id.action_Facetune):
                intent = new Intent(MainActivity.this, FacetuneActivity.class);
                startActivity(intent);
                return true;
            case (R.id.action_Pocketcasts):
                intent = new Intent(MainActivity.this, PocketcastsActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
