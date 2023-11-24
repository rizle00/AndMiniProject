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
        EditText edt_address = findViewById(R.id.edt_address);
        TextView tv_price = findViewById(R.id.tv_price);
        TextView tv_money = findViewById(R.id.tv_money);
        TextView tv_change = findViewById(R.id.tv_change);
        Button btn_pay = findViewById(R.id.btn_pay);
        MemberDTO dto = new MemberDTO();
        ProductDTO pdto = new ProductDTO();
        /* 테스트 데이터*/
        int money = 1000000;
        int price ;
        int count = 2;
        String address = "광주광역시 농성동";
        /* 테스트 데이터 끝 */

        imgv_close.setOnClickListener(v -> {
            Intent intent = new Intent(this, CartActivity.class);
            startActivity(intent);
        });
        edt_address.setText(address); //dto.getaddress
        tv_price.setText(pdto.getPrice());
        tv_money.setText(""+money);
        btn_pay.setOnClickListener(v -> {
            Intent intent = new Intent(this,CartActivity.class);
            startActivity(intent);
        });




    }

}