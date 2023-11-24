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

import org.w3c.dom.Text;

import java.util.ArrayList;
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

        btn_logout.setOnClickListener(v -> {
            Intent intent = new Intent(this,MainActivity.class); //첫화면으로 수정해야함
            startActivity(intent);
        });

        imgv_close.setOnClickListener(v -> {
            Intent intent = new Intent(this,MainActivity.class); //전 화면으로 수정해야함
            startActivity(intent);
        });
        /*테스트 코드*/
        ArrayList<ProductDTO> list = new ArrayList<>();
        list.add(new ProductDTO("아메리카노","원두를 갈아만든 커피", 3000,10));
        list.add(new ProductDTO("카페라떼","아메리카노와 우유가 만난 커피", 4000,10));
        list.add(new ProductDTO("에스프레소","고소함을 느낄 수 있는 에스프레소", 2500,10));
        list.add(new ProductDTO("바닐라라떼","우유와 바닐라가 조화를 이루는 음료", 4000,10));
        list.add(new ProductDTO("콜라","코카콜라 뚱캔입니다", 2000,10));
        list.add(new ProductDTO("사이다","칠성사이다 뚱캔입니다", 2000,10));
        list.add(new ProductDTO("레몬에이드","상큼하게 즐기는 레몬에이드", 5000,10));
        list.add(new ProductDTO("자몽에이드","달콤 쌉쌀한 자몽에이드", 5000,10));
        list.add(new ProductDTO("라임에이드","새콤달콩한 라임에이드", 5000,10));
        list.add(new ProductDTO("한라봉에이드","제주 한라봉으로 만든 에이드", 5000,10));

        ProductDTO dto = new ProductDTO();
        ArrayList<ProductDTO> cart = new ArrayList<>();
        cart.add(new ProductDTO("한라봉에이드","제주 한라봉으로 만든 에이드", 5000,1));
                /*테스트 코드 끝 */
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

        TextView tv_test = findViewById(R.id.testid);

        for(int i = 0 ; i < list.size() ; i++) {
            tv_test.setText(list.get(i).getName());
        }



    }


}