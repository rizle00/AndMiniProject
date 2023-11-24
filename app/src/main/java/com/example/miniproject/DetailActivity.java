package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DetailActivity extends AppCompatActivity {

    ProductDTO dto = new ProductDTO();
    Button btn_logout, btn_purchase, btn_back;
    ImageView [] ivs = new ImageView[4];
    TextView [] tvs = new TextView[4];
    EditText [] edts = new EditText[4];
    String[] gimsT = {};
    String[] ramensT = {};
    String[] noodlesT = {};
    String[] ricesT = {};
    String[] tteoksT = {};
    String[] frysT = {};
    String[] coffeesT = { };
    String[] adesT = {};
    String[] colasT = {};
    int[] gimsI = {};
    int[] ramensI = {};
    int[] noodlesI = {};
    int[] ricesI = {};
    int[] tteoksI = {};
    int[] frysI = {};
    int[] coffeesI = {R.drawable.coffee_espresso, R.drawable.coffee_americano, R.drawable.coffee_cafelatte, R.drawable.coffe_vanilla_latte };
    int[] adesI = {R.drawable.ade_grape_fruit, R.drawable.ade_halla, R.drawable.ade_lemon, R.drawable.ade_lime};
    int[] colasI = {R.drawable.can_coke, R.drawable.can_cider, R.drawable.can_fanta, R.drawable.can_dew};
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
        for (int i = 0; i<4; i++){
            if(choice.equals("gim")){
                ivs[i].setImageResource(gimsI[i]);
                tvs[i].setText("");
            } else if(choice.equals("ramen")){
                ivs[i].setImageResource(ramensI[i]);
                tvs[i].setText("");
            } else if(choice.equals("noodle")){
                ivs[i].setImageResource(noodlesI[i]);
                tvs[i].setText("");
            } else if(choice.equals("rice")){
                ivs[i].setImageResource(ricesI[i]);
                tvs[i].setText("");
            } else if(choice.equals("tteok")){
                ivs[i].setImageResource(tteoksI[i]);
                tvs[i].setText("");
            } else if(choice.equals("fry")){
                ivs[i].setImageResource(frysI[i]);
                tvs[i].setText("");
            } else if(choice.equals("coffee")){
                ivs[i].setImageResource(coffeesI[i]);
                tvs[i].setText("");
            } else if(choice.equals("ade")){
                ivs[i].setImageResource(adesI[i]);
                tvs[i].setText("");
            } else if(choice.equals("cola")){
                ivs[i].setImageResource(colasI[i]);
                tvs[i].setText("");
            }
        }

    }
}