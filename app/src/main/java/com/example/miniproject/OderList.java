package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class OderList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oder_list);

        TextView oderChecdkList,oderChecdkPrice;
        Button btn_oderEnd;

        oderChecdkList=findViewById(R.id.oderChecdkList);
        oderChecdkPrice=findViewById(R.id.oderChecdkPrice);
        btn_oderEnd=findViewById((R.id.btn_oderEnd);

        Intent intent=new Intent(this,FrontActivity.class);







        btn_oderEnd.setOnClickListener();




    }
}