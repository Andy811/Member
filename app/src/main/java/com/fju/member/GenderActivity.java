package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class GenderActivity extends AppCompatActivity implements View.OnClickListener {
RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
        EditText ed_gender = findViewById(R.id.ed_gender);
       String gender = ed_gender.getText().toString();

        SharedPreferences pref = getSharedPreferences("member", MODE_PRIVATE);
        pref.edit()
                .putString("gender", gender)
                .commit();

    }
    private void next() {
        findViewById(R.id.done).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
