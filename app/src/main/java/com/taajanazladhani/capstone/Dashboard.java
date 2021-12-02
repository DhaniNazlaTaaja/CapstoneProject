package com.taajanazladhani.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void rute(View view) {
        Intent intent=new Intent(Dashboard.this,MainActivity.class);
        startActivity(intent);
    }

    public void about(View view) {
        Intent intent=new Intent(Dashboard.this,about.class);
        startActivity(intent);
    }
}