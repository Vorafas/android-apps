package com.example.p0211twoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends AppCompatActivity {
    Button btnActThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        btnActThree = findViewById(R.id.btnActThree);
        btnActThree.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ActivityThree.class);
            startActivity(intent);
        });
    }
}
