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

public class SignUpActivity extends AppCompatActivity {

    TextView Signup,textSignname,textPwsign,textSignAddress;
    EditText SignName, signPW , signaddress ;
    Button btnSign;

    //내부 db?
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        sharedPreferences = getSharedPreferences("db", Context.MODE_PRIVATE);

        Signup = findViewById(R.id.Signup);
        textSignname = findViewById(R.id.textSignname);
        textPwsign = findViewById(R.id.textPwsign);
        textSignAddress = findViewById(R.id.textSignAddress);

        SignName = findViewById(R.id.SignName);
        signPW = findViewById(R.id.signPW);
        signaddress = findViewById(R.id.signaddress);

        btnSign = findViewById(R.id.btnSign);

    btnSign.setOnClickListener(v -> {

        String name = textSignname.getText().toString();
        String pw = textPwsign.getText().toString();
        String address = textSignAddress.getText().toString();

        if (SignUp(name,pw,address)){
            saveLoginStatus(true,name);
            startActivity(new Intent(this,LoginActivity.class));
            finish();
        }else{
            Toast.makeText(SignUpActivity.this, "회원가입 실패!", Toast.LENGTH_SHORT).show();
        }

    });

    }
    private boolean SignUp(String name,String pw, String address){
        if(!sharedPreferences.contains(name)){
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString(name,pw);
            editor.apply();
            return true;
        }
        return false;
    }

    private void saveLoginStatus(boolean login,String name){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("login",login);
        editor.putString("username",name);
        editor.apply();
    }
}