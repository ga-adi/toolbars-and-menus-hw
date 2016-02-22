package com.example.ra.toolbarhw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Facetune extends AppCompatActivity {
    ImageButton mMove;
    ImageButton mWhiten;
    ImageButton mHelp;
    ImageButton mErase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facetune);

        Toolbar toolbar= (Toolbar)findViewById(R.id.bottom_toolbar);
        setSupportActionBar(toolbar);

        mWhiten=(ImageButton)findViewById(R.id.whiten);
        mMove=(ImageButton)findViewById(R.id.move);
        mHelp=(ImageButton)findViewById(R.id.help);
        mErase=(ImageButton)findViewById(R.id.erase);

        mWhiten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Facetune.this,"Whiten Teeth", Toast.LENGTH_SHORT).show();
            }
        });
        mErase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Facetune.this,"Erase this", Toast.LENGTH_SHORT).show();
            }
        });
        mMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Facetune.this, "Move this ", Toast.LENGTH_SHORT).show();
            }
        });
        mHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Facetune.this, "HELP ME!!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
