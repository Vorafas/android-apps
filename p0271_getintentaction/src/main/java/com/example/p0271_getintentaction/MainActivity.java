package com.example.p0271_getintentaction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnTime;
    Button btnDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTime = findViewById(R.id.btnTime);
        btnDate = findViewById(R.id.btnDate);

        btnTime.setOnClickListener((View v) -> {
            Intent intent = new Intent("com.example.intent.action.showtime");
            startActivity(intent);
        });

        btnDate.setOnClickListener((View v) -> {
            Intent intent = new Intent("com.example.intent.action.showdate");
            startActivity(intent);
        });
    }
}
