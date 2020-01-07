package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String gender = getSharedPreferences("member", MODE_PRIVATE)
                .getString("gender", "");
        String age = getSharedPreferences("member", MODE_PRIVATE)
                .getString("age","");
        String nickname = getSharedPreferences("member", MODE_PRIVATE)
                .getString("nickname","");
        if(gender.equals("") || age.equals("") || nickname.equals("")){
            Intent intent = new Intent(this,NicknameActivity.class);
            startActivity(intent);
        }
        TextView tv_nick = findViewById(R.id.tv_nick);
        TextView tv_age = findViewById(R.id.tv_age);
        TextView tv_gender = findViewById(R.id.tv_gender);
        tv_age.setText(age);
        tv_gender.setText(gender);
        tv_nick.setText(nickname);
    }
}
