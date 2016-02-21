package lab.imaginenat.com.toolbarhw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton mMoveButton;
    ImageButton mWhitenButton;
    ImageButton mEraseButton;
    ImageButton mHelpButton;
    //ImageButton mNextButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.firstPageToolbar);
        //setSupportActionBar(toolbar);
        //getSupportActionBar().setDisplayShowTitleEnabled(false);
        //toolbar.setTitle("");
        //toolbar.setSubtitle("");
        mMoveButton = (ImageButton)findViewById(R.id.move_button);
        mWhitenButton = (ImageButton)findViewById(R.id.tooth_brush_button);
        mEraseButton= (ImageButton)findViewById(R.id.erase_button);
        mHelpButton = (ImageButton)findViewById(R.id.thelp_button);
        //mNextButton=(ImageButton)findViewById(R.id.forwardArrow_Button);


        mMoveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"MOVE BUTTON CLICKED",Toast.LENGTH_SHORT).show();
            }
        });

        mWhitenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Whiten BUTTON CLICKED", Toast.LENGTH_SHORT).show();
            }
        });

        mEraseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Erase BUTTON CLICKED",Toast.LENGTH_SHORT).show();
            }
        });

        mHelpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"HELP BUTTON CLICKED",Toast.LENGTH_SHORT).show();
            }
        });

//        mNextButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent toNextScreen = new Intent(MainActivity.this,SecondActivity.class);
//                startActivity(toNextScreen);
//            }
//        });

    }
}
