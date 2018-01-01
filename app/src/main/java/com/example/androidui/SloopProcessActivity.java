package com.example.androidui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.view.SloopView;

/**
 * 1.自定义ViewGroup
 * 2.自定义View
 */
public class SloopProcessActivity extends AppCompatActivity {

    private SloopView viwe_sloopView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sloop_process);

        viwe_sloopView = findViewById(R.id.viwe_sloopView);

    }
}
