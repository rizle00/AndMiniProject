package com.example.teamproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class CompleteActivity extends AppCompatActivity implements View.OnClickListener{
private final String TAG="C";
Button TextViewList;
Button GoHome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete);
        Log.d(TAG, "onCreate: ");

        GoHome=findViewById(R.id.GoHome);
        TextViewList=findViewById(R.id.TextViewList);

        GoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CompleteActivity.this, FrontActivity.class);
                startActivity(intent);
            }
        });
        TextViewList.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(CompleteActivity.this, FrontActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onClick(View v) {

    }
}