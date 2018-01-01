package com.example.androidui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SloopActivity extends AppCompatActivity implements View.OnClickListener{

    private int viewId;
    private View btn_sloop_base;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sloop);

        initView();
    }

    private void initView() {
        btn_sloop_base = findViewById(R.id.btn_sloop_base);

        btn_sloop_base.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        viewId = view.getId();
        if(viewId==R.id.btn_sloop_base){
            startActivity(new Intent(this,SloopBaseActivity.class));
        }
    }
}
