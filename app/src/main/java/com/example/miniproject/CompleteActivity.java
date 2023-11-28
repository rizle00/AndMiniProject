package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class CompleteActivity extends AppCompatActivity{
private final String TAG="C";
Button TextViewList;
Button GoHome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete);
        Log.d(TAG, "onCreate: ");

        TextView oderListNameWrite=findViewById(R.id.oderListNameWrite);
        TextView oderListMoneyWrite=findViewById(R.id.oderListMoneyWrite);


        Button GoHome=findViewById(R.id.GoHome);








        GoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(CompleteActivity.this, FrontActivity.class);
                startActivity(intent);
            }
        });


    }


}