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

import com.example.teamproject.R;

public class LoginActivity extends AppCompatActivity {

    TextView textId;
    EditText userId , userPw;
    Button btnLogin, btnSign;

    //내부 db 저장소 같은
   SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        sharedPreferences = getSharedPreferences("db", Context.MODE_PRIVATE);

        textId=findViewById(R.id.textId);
        userId=findViewById(R.id.userId);
        userPw=findViewById(R.id.userPw);
        btnLogin=findViewById(R.id.btnLogin);
        btnSign=findViewById(R.id.btnSign);


        btnSign.setOnClickListener(v -> {
            Intent intent = new Intent(this,SignUpActivity.class);
            startActivity(intent);
        });

        btnLogin.setOnClickListener(v -> {
            String loginid = userId.getText().toString();
            String loginpw = userPw.getText().toString();

            if(Login(loginid,loginpw)){
                saveLoginStatus(true,loginid);
                startActivity(new Intent(LoginActivity.this,ProductActivity.class));
                finish();
            }else{
                Toast.makeText(LoginActivity.this, "로그인 실패!", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private boolean Login(String id,String pw){
        String saveid = sharedPreferences.getString("id","");
        String savepw = sharedPreferences.getString("pw","");

        return saveid.equals(id) && savepw.equals(pw);
    }

    private void saveLoginStatus(boolean login,String id){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("login",login);
        editor.putString("id",id);
        editor.apply();
    }


}

