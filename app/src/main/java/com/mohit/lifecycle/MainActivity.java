package com.mohit.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        Log.v ("MainActivity","Oncreate");
    }

    @Override
    protected void onStart() {
        super.onStart ();
        Log.v ("MainActivity","Onstart");
    }

    @Override
    protected void onStop() {
        super.onStop ();
        Log.v ("MainActivity","Onstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy ();
        Log.v ("MainActivity","Ondestroy");
    }

    @Override
    protected void onResume() {
        super.onResume ();
        Log.v ("MainActivity","Onresume");
    }
}
