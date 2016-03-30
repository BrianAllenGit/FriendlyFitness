package com.example.brian.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
        EditText test = (EditText) findViewById(R.id.edito);
        test.setText(message);
    }
}
