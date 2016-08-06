package com.example.yurich.callcatcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.yurich.callcatcher.PhoneCatcher.PhoneCatchService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PhoneCatchService phoneCatchService;
        setContentView(R.layout.activity_main);
    }
}
