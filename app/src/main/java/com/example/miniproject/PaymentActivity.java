package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


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
        MemberDTO dto = new MemberDTO();

        tv_price.setText(""+getIntent().getStringExtra("total"));
        tv_money.setText(""+dto.getMoney());
        tv_change.setText("" +(dto.getMoney() - getIntent().getIntExtra("total",-1)));


        btn_pay.setOnClickListener(v -> {
            Intent intent = new Intent(this,CartActivity.class);
            dto.setMoney(dto.getMoney() - getIntent().getIntExtra("total",-1));
            startActivity(intent);
        });
        imgv_close.setOnClickListener(v -> {
            Intent intent = new Intent(this, CartActivity.class);
            startActivity(intent);
        });
        btn_recharge.setOnClickListener(v -> {
            Intent intent = new Intent(this , RechargeActivity.class);
            startActivity(intent);
        });

        
    }
}