package com.example.miniproject;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    EditText signId, signPW , signAddress ;
    Button btnSign;

    //내부 db?
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        sharedPreferences = getSharedPreferences("db", Context.MODE_PRIVATE);

        signId = findViewById(R.id.signId);
        signPW = findViewById(R.id.signPW);
        signAddress = findViewById(R.id.signAddress);

        btnSign = findViewById(R.id.btnSign);

        // block touch
        signAddress.setFocusable(false);
        signAddress.setOnClickListener(v -> {
            // 주소 검색 웹뷰 화면으로 이동
            Intent intent = new Intent(this,SearchActivity.class);
        });

        btnSign.setOnClickListener(v -> {

        String id = signId.getText().toString();
        String pw = signPW.getText().toString();
        String address = signAddress.getText().toString();


        if (SignUp(id,pw,address)){
            saveLoginStatus(true,id);
            startActivity(new Intent(this,LoginActivity.class));
            finish();
        }else{
            Toast.makeText(SignUpActivity.this, "회원가입 실패!", Toast.LENGTH_SHORT).show();
        }

    });

    }

    private final ActivityResultLauncher<Intent> getSearchResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {
                
            }

    )
    private boolean SignUp(String name,String pw, String address){
        if(!sharedPreferences.contains(name)){
            SharedPreferences.Editor editor = sharedPreferences.edit(); //데이터를 저장할 수 있는 메소드
            editor.putString("loginId",name);
            editor.putString("loginPw",pw);
            editor.commit();
            return true;
        }
        return false;
    }

    private void saveLoginStatus(boolean login,String name){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("login",login);
        editor.putString("username",name);
        editor.commit();
    }
}