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

import java.util.ArrayList;


public class CompleteActivity extends AppCompatActivity{
private final String TAG="C";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete);
        Log.d(TAG, "onCreate: ");

        TextView oderListNameWrite=findViewById(R.id.oderListNameWrite);
        TextView oderListMoneyWrite=findViewById(R.id.oderListMoneyWrite);


        Button GoHome=findViewById(R.id.GoHome);

        Intent intent=getIntent();
        ArrayList<ProductDTO> list =  (ArrayList<ProductDTO>) getIntent().getSerializableExtra("list");

        oderListNameWrite.setText(list.get().getName()+list.get().getName());


        oderListMoneyWrite.setText(list.get().getName());

        startActivity(intent);












        GoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(CompleteActivity.this, FrontActivity.class);
                startActivity(intent);
            }
        });


    }


}