package com.example.todo.toolbarshw;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class TedActivity extends AppCompatActivity {

    private Toolbar mToolbar, mToolbarMidtabs;
    private ActionBar mActionbar;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ted);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle("TED");
        mToolbar.setTitleTextColor(Color.RED);
        setSupportActionBar(mToolbar);
        mActionbar = getSupportActionBar();
        mActionbar.setDisplayHomeAsUpEnabled(true);
        mActionbar.setHomeAsUpIndicator(null);

        mToolbarMidtabs = (Toolbar) findViewById(R.id.toolbarTedTabs);
        mTabLayout = (TabLayout)findViewById(R.id.xmlTabLayout);
        mTabLayout.addTab(mTabLayout.newTab().setText("About"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Watch Next"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Related"));
        mTabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                String id = tab.getText().toString();
                switch (id) {
                    case "About":
                        Toast.makeText(TedActivity.this, "About!", Toast.LENGTH_SHORT).show();
                        break;
                    case "Watch Next":
                        Toast.makeText(TedActivity.this, "Watch Next!", Toast.LENGTH_SHORT).show();
                        break;
                    case "Related":
                        Toast.makeText(TedActivity.this, "Related!", Toast.LENGTH_SHORT).show();
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_ted,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.action_TedBookmark:
                Toast.makeText(TedActivity.this, "Bookmarked!", Toast.LENGTH_SHORT).show();
                return super.onOptionsItemSelected(item);
            case R.id.action_TedShare:
                Toast.makeText(TedActivity.this, "Shared!", Toast.LENGTH_SHORT).show();
                return super.onOptionsItemSelected(item);
            case R.id.action_TedSave:
                Toast.makeText(TedActivity.this, "Saved!", Toast.LENGTH_SHORT).show();
                return super.onOptionsItemSelected(item);
        }
        return super.onOptionsItemSelected(item);
    }
}
