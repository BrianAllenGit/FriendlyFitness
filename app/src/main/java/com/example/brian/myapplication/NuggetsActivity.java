package com.example.brian.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Brian on 3/29/2016.
 */
public class NuggetsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nuggets_activity);
        Intent i = getIntent();
        String message = i.getStringExtra("EMAIL");
        //EditText test = (EditText) findViewById(R.id.edito);
        //test.setText(message);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sub_menu, menu);
        return true;
    }

    @Override
    public void onBackPressed(){
    }


    public void goTimer(View view){
        Intent i = new Intent(getApplicationContext(), TimerActivity.class);
        startActivity(i);
    }
}
