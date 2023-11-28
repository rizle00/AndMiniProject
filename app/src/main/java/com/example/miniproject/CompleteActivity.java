package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


public class CompleteActivity extends AppCompatActivity{
private final String TAG="C";
    DAO dao = new DAO();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete);
        Log.d(TAG, "onCreate: ");

        TextView oderListNameWrite=findViewById(R.id.oderListNameWrite);
        TextView oderListMoneyWrite=findViewById(R.id.oderListMoneyWrite);


        Button GoHome=findViewById(R.id.GoHome);


            int total =0;
        for (int i = 0; i<DAO.cart.size(); i++){
            oderListNameWrite.append(DAO.cart.get(i).getName()+"("+DAO.cart.get(i).getChoice()+")\n");
            total +=  DAO.cart.get(i).getPrice()*DAO.cart.get(i).getChoice();
            saveChoice(DAO.cart.get(i).getName(), i);
        }
            oderListMoneyWrite.setText(""+total);



        GoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(CompleteActivity.this, ProductActivity.class);
                DAO.cart.clear();
                startActivity(intent);
            }
        });


    }

    @SuppressLint("SuspiciousIndentation")
    public void saveChoice(String name, int i){
        dao.pref = getSharedPreferences("choice", Activity.MODE_PRIVATE);
        dao.edit = dao.pref.edit();

            dao.edit.putInt(name,DAO.cart.get(i).getChoice());

        dao.edit.commit();
    }

}
