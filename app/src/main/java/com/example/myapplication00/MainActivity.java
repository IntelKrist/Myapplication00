package com.example.myapplication00;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
           Intent i =new Intent (MainActivity.this, HomeActivity.class);
           startActivity(i);
           finish();
        }
    }, 5*1000);
    }




















}