package com.example.miniproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import org.w3c.dom.Text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CartActivity extends AppCompatActivity {
    int totalprice = 0;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        ImageView imgv_close = findViewById(R.id.imgv_close);
        Button btn_logout = findViewById(R.id.btn_logout);
        Button btn_payment = findViewById(R.id.payment);
        TextView tv_name = findViewById(R.id.cartName);
        TextView tv_amount = findViewById(R.id.cartAmount);
        TextView tv_price = findViewById(R.id.cartPrice);

        btn_logout.setOnClickListener(v -> {
            Intent intent = new Intent(this, LoginActivity.class); //첫화면으로 수정해야함
            startActivity(intent);
        });

        imgv_close.setOnClickListener(v -> {
            Intent intent = new Intent(this,ProductActivity.class); //전 화면으로 수정해야함
            startActivity(intent);
        });

        for()
        getIntent()
        String name = "";
        for(int i = 0 ; i < list.size() ; i++) {
            name = name + list.get(i).getName() +"\n\r";
            totalprice = totalprice + list.get(i).getPrice()*list.get(i).getQuantity();
        };
        tv_name.setText(name);
        String price = "";
        for(int i = 0 ; i < list.size() ; i++) {
            price = price +   list.get(i).getPrice() + "원 " +"\n\r";
        };
        tv_price.setText(price);
        String amouont = "";
        for(int i = 0 ; i < list.size() ; i++) {
            amouont = amouont + list.get(i).getQuantity() + "개 " +"\n\r";
        };
        tv_amount.setText(amouont);

        TextView tv_totalprice = findViewById(R.id.totalprice);
        tv_totalprice.setText("총액 : " + totalprice + "원");


        btn_payment.setOnClickListener(v -> {
            Intent intent = new Intent(this, PaymentActivity.class);
            int a = totalprice;
            intent.putExtra("str",totalprice);
            startActivity(intent);
        });

    }
}