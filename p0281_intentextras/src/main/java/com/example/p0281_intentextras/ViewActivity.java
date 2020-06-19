package com.example.p0281_intentextras;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ViewActivity extends AppCompatActivity {
    TextView tvView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view);

        tvView = findViewById(R.id.tvView);
        Intent intent = getIntent();
        String fname = intent.getStringExtra("fname");
        String lname = intent.getStringExtra("lname");
        String age = intent.getStringExtra("age");

        tvView.setText("You name is: " + fname + " " + lname+ ". You are " + age + " years old");
    }
}
