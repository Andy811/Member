package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AgeActivity extends AppCompatActivity  implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickname);
        TextView tv_age= findViewById(R.id.age);
        String age =tv_age.getText().toString();
        SharedPreferences pref = getSharedPreferences("member", MODE_PRIVATE);
        pref.edit()
                .putString("age", age)
                .commit();
        next();
    }
    private void next() {
        findViewById(R.id.next_age).setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,GenderActivity.class);
        startActivity(intent);
    }
}