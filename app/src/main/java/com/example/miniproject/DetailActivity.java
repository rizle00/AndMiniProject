package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    Button btn_logout, btn_purchase, btn_back;
    ImageView [] ivs = new ImageView[4];
    TextView [] tvs = new TextView[4];
    EditText [] edts = new EditText[4];
    R.drawable [] imgs = {R.drawable.};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        findId();
        String choice;
        Intent intent = getIntent();
        choice = intent.getStringExtra("name");
        setChoice(choice);
    }

    public void findId(){
        btn_logout= findViewById(R.id.btn_logout);
        btn_purchase= findViewById(R.id.btn_purchase);
        btn_back= findViewById(R.id.btn_back);

        ivs[0] = findViewById(R.id.imgv_detail1);
        ivs[1] = findViewById(R.id.imgv_detail2);
        ivs[2] = findViewById(R.id.imgv_detail3);
        ivs[3] = findViewById(R.id.imgv_detail4);

        tvs[0] = findViewById(R.id.tv_detail1);
        tvs[1] = findViewById(R.id.tv_detail2);
        tvs[2] = findViewById(R.id.tv_detail3);
        tvs[3] = findViewById(R.id.tv_detail4);

        edts[0] = findViewById(R.id.edt_text1);
        edts[1] = findViewById(R.id.edt_text2);
        edts[2] = findViewById(R.id.edt_text3);
        edts[3] = findViewById(R.id.edt_text4);
    }

    public void setChoice(String choice){
        if(choice.equals("gim")){
            ivs[0].setImageResource(R.drawable.);
        }
    }
}