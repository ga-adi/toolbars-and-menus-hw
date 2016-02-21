package com.example.todo.toolbarshw;

import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class PocketcastsActivity extends AppCompatActivity {

    private Toolbar mToolbarTop, mToolbarBottom;
    private ActionBar mActionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pocketcasts);

        mToolbarTop = (Toolbar)findViewById(R.id.xmlPocketCastsActionBar);
        mToolbarBottom = (Toolbar)findViewById(R.id.xmlPocketCastsBottomBar);

        mToolbarTop.setTitle("Podcasts");
        mToolbarTop.setTitleTextColor(Color.WHITE);
        setSupportActionBar(mToolbarTop);
        mActionBar = getSupportActionBar();
        mActionBar.setDisplayHomeAsUpEnabled(true);
        mActionBar.setHomeAsUpIndicator(null);

        mToolbarBottom.inflateMenu(R.menu.menu_pocketcastsbottom);
        mToolbarBottom.setNavigationIcon(R.drawable.pocketcastsbottomicon1);
        mToolbarBottom.setTitle("Infinite Guest Everything Feed");
        mToolbarBottom.setTitleTextColor(Color.WHITE);
        mToolbarBottom.setSubtitle("TBTL #1810: Cash Rules Some Things...");
        mToolbarBottom.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PocketcastsActivity.this, "Clicked bottom Navigation icon!", Toast.LENGTH_SHORT).show();
            }
        });
        mToolbarBottom.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if(item.getItemId()==R.id.action_PocketcastsBottom){
                    Toast.makeText(PocketcastsActivity.this, "Clicked bottom icon!", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_pocketcaststop,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.action_PocketcastsTopCast:
                Toast.makeText(PocketcastsActivity.this, "Casted!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_PocketcastsTopAdd:
                Toast.makeText(PocketcastsActivity.this, "Added podcast!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_PocketcastsTopOverflow:
                Toast.makeText(PocketcastsActivity.this, "Clicked overflow option!", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
