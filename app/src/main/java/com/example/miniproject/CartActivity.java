package com.example.miniproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
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
//    DAO dao = new DAO();

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
        TextView tv_totalprice = findViewById(R.id.totalprice);

        btn_logout.setOnClickListener(v -> {
            Intent intent = new Intent(this, LoginActivity.class); //첫화면으로
            startActivity(intent);
        });

        imgv_close.setOnClickListener(v -> {
            Intent intent = new Intent(this, ProductActivity.class);
            startActivity(intent);
            finish();
        });


//        ArrayList<ProductDTO> list = new ArrayList<>();
//        ArrayList<ProductDTO> ad = (ArrayList<ProductDTO>) getIntent().getSerializableExtra("cart");
      /* ArrayList<ArrayList<ProductDTO>> listaaa = new ArrayList<>();
        listaaa.add(ad);*/
        for(int i = 0 ; i < DAO.cart.size() ; i++) {
            tv_name.append(DAO.cart.get(i).getName()+"\n\r");
            tv_amount.append(""+DAO.cart.get(i).getChoice()+"\n\r");
            tv_price.append(""+DAO.cart.get(i).getPrice()+"\n\r");
            totalprice = totalprice + (DAO.cart.get(i).getChoice()*DAO.cart.get(i).getPrice());
        };
        tv_totalprice.setText("총액 : " + totalprice + "원");

        btn_payment.setOnClickListener(v -> {
            Intent intent = new Intent(this, PaymentActivity.class);
            intent.putExtra("total",totalprice);
            startActivity(intent);
        });

    }
}