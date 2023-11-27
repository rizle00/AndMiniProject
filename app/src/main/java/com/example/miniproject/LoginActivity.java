package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText userId , userPw;
    Button btnLogin, btnSign;
    //내부 db ?
   SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        sharedPreferences = getSharedPreferences("db", Context.MODE_PRIVATE); //앱 내부에서만 접근하게

        userId=findViewById(R.id.userId);
        userPw=findViewById(R.id.userPw);
        btnLogin=findViewById(R.id.btnLogin);
        btnSign=findViewById(R.id.btnSign);


        btnSign.setOnClickListener(v -> {
            Intent intent = new Intent(this,SignUpActivity.class);
            startActivity(intent);
        });

        btnLogin.setOnClickListener(v -> {
            String loginId = userId.getText().toString();
            String loginPw = userPw.getText().toString();

            if(Login(loginId,loginPw)){
                saveLoginStatus(true,loginId);
                startActivity(new Intent(LoginActivity.this,ProductActivity.class));
                finish();
            }else{
                Toast.makeText(LoginActivity.this, "로그인 실패!", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private boolean Login(String loginId,String loginPw){
        String saveId = sharedPreferences.getString("loginId","");
        String savePw = sharedPreferences.getString("loginPw","");

        return saveId.equals(loginId) && savePw.equals(loginPw);
    }

    private void saveLoginStatus(boolean login,String id){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("login",login);
        editor.putString("id",id);
        editor.commit();
    }


}

