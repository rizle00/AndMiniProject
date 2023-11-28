package com.example.miniproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        ImageView imgv_close = findViewById(R.id.imgv_close);
        TextView tv_price = findViewById(R.id.tv_price);
        TextView tv_money = findViewById(R.id.tv_money);
        TextView tv_change = findViewById(R.id.tv_change);
        Button btn_pay = findViewById(R.id.btn_pay);
        Button btn_recharge = findViewById(R.id.btn_recharge);
        

        int totalprice = getIntent().getIntExtra("total",0);
        tv_price.setText(""+totalprice);
        tv_money.setText(""+MemberDTO.getMoney());
        tv_change.setText("" +(MemberDTO.getMoney() - getIntent().getIntExtra("total",0)));


        btn_pay.setOnClickListener(v -> {
            if(MemberDTO.getMoney() < totalprice){
                Toast.makeText(this, "잔액이 부족합니다.", Toast.LENGTH_SHORT).show();
            }else{
            Intent intent = new Intent(this,CompleteActivity.class);
                MemberDTO.setMoney(MemberDTO.getMoney() - getIntent().getIntExtra("total",-1));
            startActivity(intent);
            }

        });
        imgv_close.setOnClickListener(v -> {
            Intent intent = new Intent(this, CartActivity.class);
            startActivity(intent);
        });
        btn_recharge.setOnClickListener(v -> {
            Intent intent = new Intent(this , RechargeActivity.class);
            intent.putExtra("total",totalprice);
            startActivity(intent);
        });


    }
}