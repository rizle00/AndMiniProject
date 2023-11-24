package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {

    DAO dao = new DAO();
    ProductDTO dto = new ProductDTO();
    Button btn_logout, btn_purchase, btn_back;
    ImageView [] ivs = new ImageView[4];
    TextView [] tvs = new TextView[4];
    EditText [] edts = new EditText[4];
    List<ProductDTO> list;

    int[] gimsI = {R.drawable.gy, R.drawable.gt, R.drawable.gn, R.drawable.gm};
    int[] ramensI = {R.drawable.rg, R.drawable.rt, R.drawable.rc, R.drawable.rs };
    int[] noodlesI = {R.drawable.nj, R.drawable.nb, R.drawable.nz, R.drawable.nwoo};
    int[] ricesI = {R.drawable.cb, R.drawable.cj, R.drawable.co, R.drawable.cg};
    int[] tteoksI = {R.drawable.tg, R.drawable.tc, R.drawable.tr, R.drawable.tj};
    int[] frysI = {R.drawable.fs, R.drawable.fg, R.drawable.fo, R.drawable.fm};
    int[] coffeesI = {R.drawable.coffee_espresso, R.drawable.coffee_americano, R.drawable.coffee_cafelatte, R.drawable.coffe_vanilla_latte };
    int[] adesI = {R.drawable.ade_grape_fruit, R.drawable.ade_halla, R.drawable.ade_lemon, R.drawable.ade_lime};
    int[] colasI = {R.drawable.can_coke, R.drawable.can_cider, R.drawable.can_fanta, R.drawable.can_dew};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        findId();
        String select;
        Intent intent = getIntent();
        select = intent.getStringExtra("name");
        setChoice(select);
        btn_logout.setOnClickListener(this);
        btn_back.setOnClickListener(this);
        btn_purchase.setOnClickListener(this);

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


    public void setChoice(String select){

        for (int i = 0; i<4; i++){
            if(select.equals("gim")){
                list = dao.makeMenu("gimsT");
                ivs[i].setImageResource(gimsI[i]);

            } else if(select.equals("ramen")){
                list = dao.makeMenu("ramensT");
                ivs[i].setImageResource(ramensI[i]);

            } else if(select.equals("noodle")){
                list = dao.makeMenu("noodlesT");
                ivs[i].setImageResource(noodlesI[i]);

            } else if(select.equals("rice")){
                list = dao.makeMenu("ricesT");
                ivs[i].setImageResource(ricesI[i]);

            } else if(select.equals("tteok")){
                list = dao.makeMenu("tteoksT");
                ivs[i].setImageResource(tteoksI[i]);

            } else if(select.equals("fry")){
                list = dao.makeMenu("frysT");
                ivs[i].setImageResource(frysI[i]);

            } else if(select.equals("coffee")){
                list = dao.makeMenu("coffeesT");
                ivs[i].setImageResource(coffeesI[i]);

            } else if(select.equals("ade")){
                list = dao.makeMenu("adesT");
                ivs[i].setImageResource(adesI[i]);

            } else if(select.equals("cola")){
                list = dao.makeMenu("colasT");
                ivs[i].setImageResource(colasI[i]);

            }
            tvs[i].setText(list.get(i).getName()+"\n"+list.get(i).getInfo()+"\n"+"가격 : "+list.get(i).getPrice());
        }

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_logout){
            Intent intent = new Intent(this, MainActivity.class );
            startActivity(intent);
        } else if(v.getId() == R.id.btn_back){
            Intent intent = new Intent(this, ProductActivity.class );
            startActivity(intent);
        } else if(v.getId() == R.id.btn_purchase){
            Intent intent = new Intent(this, CartActivity.class );
            for(int i = 0; i<4; i++){
                intent.putExtra("name"+(i+1),list.get(i).getName());
                intent.putExtra("choice"+(i+1),edts[i].getText().toString());
            }
            startActivity(intent);
        }
    }
}