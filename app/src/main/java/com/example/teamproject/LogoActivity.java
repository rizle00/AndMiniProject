package com.example.teamproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class LogoActivity extends AppCompatActivity implements View.OnClickListener{

    private final String TAG="a";
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
        Log.d(TAG, "onCreate: ");

//      logo = findViewById(R.id.logo);
//
//        logo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {


//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(5000);
//                    Intent intent = new Intent(LogoActivity.this, FrontActivity.class);
//                    startActivity(intent);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(LogoActivity.this, FrontActivity.class);
                startActivity(intent);
            }
        }, 2 * 1000);

//            }
//        });
//
//        Glide.with(this).load(R.drawable.mjsend).into(logo);


    }


    @Override
    public void onClick(View v) {
//        Intent intent = new Intent(LogoActivity.this, FrontActivity.class);
//        startActivity(intent);
    }
}

