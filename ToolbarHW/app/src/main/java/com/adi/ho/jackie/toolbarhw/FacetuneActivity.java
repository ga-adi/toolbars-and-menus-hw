package com.adi.ho.jackie.toolbarhw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class FacetuneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facetune);

        Toolbar topToolbar = (Toolbar) findViewById(R.id.facetune_top_toolbar);
        setSupportActionBar(topToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("");

        ImageView facetuneImage = (ImageView)findViewById(R.id.facetune_image);
        final TextView toolbarText = (TextView) findViewById(R.id.facetune_text);
        facetuneImage.setImageResource(R.drawable.facetune);

        LinearLayout moveLayout = (LinearLayout) findViewById(R.id.move);
        LinearLayout whitenLayout = (LinearLayout) findViewById(R.id.whiten);
        LinearLayout eraseLayout = (LinearLayout) findViewById(R.id.erase);
        LinearLayout helpLayout = (LinearLayout) findViewById(R.id.help);
        moveLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toolbarText.setText("Move");
            }
        });
        whitenLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toolbarText.setText("Whiten");
            }
        });
        eraseLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toolbarText.setText("Erase");
            }
        });
        helpLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FacetuneActivity.this, "HALP!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.facetune_top_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            case R.id.action_check:
                Toast.makeText(FacetuneActivity.this, "Saved", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
