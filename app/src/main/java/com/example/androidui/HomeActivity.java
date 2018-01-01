package com.example.androidui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn_sloop;
    private int viewId;
    private View btn_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initView();
    }

    private void initView() {
        btn_sloop = findViewById(R.id.btn_sloop);
        btn_layout = findViewById(R.id.btn_layout);

        btn_sloop.setOnClickListener(this);
        btn_layout.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        viewId = view.getId();
        if(viewId==R.id.btn_sloop){
            startActivity(new Intent(this,SloopActivity.class));
        }else if(viewId==R.id.btn_layout){

        }else{

        }
    }
}
