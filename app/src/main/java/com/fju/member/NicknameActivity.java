package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class NicknameActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickname);
        TextView tv_nickname = findViewById(R.id.nickname);
        String nickname = tv_nickname.getText().toString();
        SharedPreferences pref = getSharedPreferences("member", MODE_PRIVATE);
        pref.edit()
                .putString("nickname", nickname)
                .commit();
        next();
    }
    private void next() {
        findViewById(R.id.next_nick).setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,AgeActivity.class);
        startActivity(intent);
    }
}
