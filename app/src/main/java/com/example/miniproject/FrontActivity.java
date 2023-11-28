package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;



public class FrontActivity extends AppCompatActivity {
    private final String TAG="B";
    LinearLayout pageChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);
        Log.d(TAG, "onCreate: ");
        pageChange=findViewById(R.id.pageChange);

        pageChange.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(FrontActivity.this, LoginActivity.class);
                    startActivity(intent);
                }
            });

    }

}





