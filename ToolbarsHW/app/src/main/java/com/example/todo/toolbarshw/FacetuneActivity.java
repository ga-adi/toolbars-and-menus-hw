package com.example.todo.toolbarshw;

import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class FacetuneActivity extends AppCompatActivity {

    private Toolbar mToolbar, mToolbarbottom;
    private ActionBar mActionbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facetune);

        mToolbar = (Toolbar)findViewById(R.id.xmlFaceActionBar);
        mToolbarbottom = (Toolbar)findViewById(R.id.xmlFaceToolbarBottom);
        mToolbar.setTitle("Whiten");
        mToolbar.setTitleTextColor(Color.GRAY);
        mToolbar.setNavigationIcon(R.drawable.facetunenav);
        setSupportActionBar(mToolbar);
        mActionbar = getSupportActionBar();
        mActionbar.setDisplayHomeAsUpEnabled(true);

        mToolbarbottom.inflateMenu(R.menu.menu_facebottom);
        mToolbarbottom.setTitle("");
        mToolbarbottom.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int id = item.getItemId();
                switch (id){
                    case R.id.action_facemove:
                        Toast.makeText(FacetuneActivity.this, "Moved!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_facewhiten:
                        Toast.makeText(FacetuneActivity.this, "Whitened!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_faceerase:
                        Toast.makeText(FacetuneActivity.this, "Erased!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_facehelp:
                        Toast.makeText(FacetuneActivity.this, "Helped!", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_face,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.action_faceConfirm){
            Toast.makeText(FacetuneActivity.this, "Confirmed!", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
