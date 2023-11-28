package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProductActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_logout, btn_cart;
    ImageView imgv_gim, imgv_ramen, imgv_noodle,
            imgv_rice, imgv_tteok, imgv_fry,
            imgv_coffee, imgv_ade, imgv_cola ;
    TextView tv_gim, tv_ramen , tv_noodle, tv_rice,
            tv_tteok, tv_fry, tv_coffee, tv_ade, tv_cola ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);



        findId();
        setOnClick();
    }

    public void findId(){
        btn_logout = findViewById(R.id.btn_logout);
        btn_cart = findViewById(R.id.btn_cart);
        imgv_gim = findViewById(R.id.imgv_gim);
        imgv_ramen = findViewById(R.id.imgv_ramen);
        imgv_noodle = findViewById(R.id.imgv_noodle);
        imgv_rice = findViewById(R.id.imgv_rice);
        imgv_tteok = findViewById(R.id.imgv_tteok);
        imgv_fry = findViewById(R.id.imgv_fry);
        imgv_coffee = findViewById(R.id.imgv_coffee);
        imgv_ade = findViewById(R.id.imgv_ade);
        imgv_cola = findViewById(R.id.imgv_cola);

        tv_gim = findViewById(R.id.tv_gim);
        tv_ramen = findViewById(R.id.tv_ramen);
        tv_noodle = findViewById(R.id.tv_noodle);
        tv_rice = findViewById(R.id.tv_rice);
        tv_tteok = findViewById(R.id.tv_tteok);
        tv_fry = findViewById(R.id.tv_fry);
        tv_coffee = findViewById(R.id.tv_coffee);
        tv_ade = findViewById(R.id.tv_ade);
        tv_cola = findViewById(R.id.tv_cola);

    }

    public void setOnClick(){
        btn_cart.setOnClickListener(this);
        btn_logout.setOnClickListener(this);
        imgv_gim.setOnClickListener(this);
        imgv_ramen.setOnClickListener(this);
        imgv_noodle.setOnClickListener(this);
        imgv_rice.setOnClickListener(this);
        imgv_tteok.setOnClickListener(this);
        imgv_fry.setOnClickListener(this);
        imgv_coffee.setOnClickListener(this);
        imgv_ade.setOnClickListener(this);
        imgv_cola.setOnClickListener(this);
        tv_gim.setOnClickListener(this);
        tv_ramen.setOnClickListener(this);
        tv_noodle.setOnClickListener(this);
        tv_rice.setOnClickListener(this);
        tv_tteok.setOnClickListener(this);
        tv_fry.setOnClickListener(this);
        tv_coffee.setOnClickListener(this);
        tv_ade.setOnClickListener(this);
        tv_cola.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_cart){
            Intent intent = new Intent(this, CartActivity.class );
            startActivity(intent);

        }else if(v.getId() == R.id.btn_logout){
            Intent intent = new Intent(this, FrontActivity.class );
            startActivity(intent);

        } else if(v.getId() == R.id.imgv_gim || v.getId() == R.id.tv_gim){
            setName("gim");

        } else if(v.getId() == R.id.imgv_ramen || v.getId() == R.id.tv_ramen){
            setName("ramen");

        } else if(v.getId() == R.id.imgv_noodle || v.getId() == R.id.tv_noodle){
            setName("noodle");

        } else if(v.getId() == R.id.imgv_rice || v.getId() == R.id.tv_rice){
            setName("rice");

        } else if(v.getId() == R.id.imgv_tteok || v.getId() == R.id.tv_tteok){
            setName("tteok");

        } else if(v.getId() == R.id.imgv_fry || v.getId() == R.id.tv_fry){
            setName("fry");

        } else if(v.getId() == R.id.imgv_coffee || v.getId() == R.id.tv_coffee){
            setName("coffee");

        } else if(v.getId() == R.id.imgv_ade || v.getId() == R.id.tv_ade){
            setName("ade");

        } else if(v.getId() == R.id.imgv_cola || v.getId() == R.id.tv_cola){
            setName("cola");

        }
    }

    public void setName(String name){
        Intent intent =  new Intent(this , DetailActivity.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }
}