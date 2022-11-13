package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);
    }

    public void registClick(View view) {
        setContentView(R.layout.register);
    }

    public void logClick(View view) {
        setContentView(R.layout.log_in);
    }

    public void getStart(View view) {
        setContentView(R.layout.getstart);
    }
}