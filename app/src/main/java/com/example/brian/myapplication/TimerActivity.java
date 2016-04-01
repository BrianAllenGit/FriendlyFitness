package com.example.brian.myapplication;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;


/**
 * Created by Brian on 4/1/2016.
 */
public class TimerActivity extends Activity{
    private TextView test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timer_activity);
        test = (TextView) findViewById(R.id.timer1);

    }

    public void startTimer(View view){
        InputMethodManager inputManager = (InputMethodManager)
                getSystemService(Context.INPUT_METHOD_SERVICE);

        inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                InputMethodManager.HIDE_NOT_ALWAYS);
        EditText time = (EditText) findViewById(R.id.timeValue);
        int myNum = 0;
        try {
            myNum = Integer.parseInt(time.getText().toString());
        } catch(NumberFormatException nfe) {
            System.out.println("Could not parse " + nfe);
        }
        new CountDownTimer((myNum*1000), 1000) {

            public void onTick(long millisUntilFinished) {
                test.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                test.setText("done!");
            }
        }.start();
    }

}
