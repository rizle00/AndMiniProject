package com.example.miniproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        ImageView imgv_close = findViewById(R.id.imgv_close);
        Button btn_logout = findViewById(R.id.btn_logout);
        Button btn_payment = findViewById(R.id.payment);
        /* 테스트 데이터*/
        int testnum = 2;
        int testprice = 2000;
        int money = 10000;

        /* 테스트 데이터 끝 */
        btn_logout.setOnClickListener(v -> {
            Intent intent = new Intent(this,MainActivity.class); //첫화면으로 수정해야함
            startActivity(intent);
        });

        imgv_close.setOnClickListener(v -> {
            Intent intent = new Intent(this,MainActivity.class); //전 화면으로 수정해야함
            startActivity(intent);
        });

  /*      if(testnum <1){
            ImageView testimg = findViewById(R.id.testimg);
            testimg.setVisibility(View.GONE);
        }*/
/*        if(testnum<1){
            LinearLayout testlayout = findViewById(R.id.testlayout);
            testlayout.setVisibility(View.GONE);
        } */
        /*총액 구하기*/
        /*TextView testtv = findViewById(R.id.testtotal);*/
  /*      testtv.setText(""+testnum * testprice);
        btn_payment.setOnClickListener(v -> {
            Intent intent = new Intent(this, PaymentActivity.class);
            startActivity(intent);
        });*/





    }


}