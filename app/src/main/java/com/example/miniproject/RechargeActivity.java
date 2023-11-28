package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RechargeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MemberDTO dto = new MemberDTO();

        EditText edt_recharge = findViewById(R.id.edt_recharge);
        TextView tv_money = findViewById(R.id.rc_money);
        Button btn_recharge = findViewById(R.id.btn_rechar);

        tv_money.setText(dto.getMoney());


        btn_recharge.setOnClickListener(v -> {
            Intent intent = new Intent(this , PaymentActivity.class);
            dto.setMoney(dto.getMoney()+Integer.parseInt(edt_recharge.toString()));
            startActivity(intent);
        });


    }
}