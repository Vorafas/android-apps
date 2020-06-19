package com.example.p0271_getintentaction;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Info extends AppCompatActivity {
    TextView tvInfo;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);

        Intent intent = getIntent();
        String action = intent.getAction();
        String format = "", textInfo = "";

        if (action.equals("com.example.intent.action.showtime")) {
            format = "HH:mm:ss";
            textInfo = "Time: ";
        } else if (action.equals("com.example.intent.action.showdate")) {
            format = "dd.MM.yyyy";
            textInfo = "Date: ";
        }

        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String datetime = sdf.format(new Date(System.currentTimeMillis()));

        tvInfo = findViewById(R.id.tvInfo);
        tvInfo.setText(textInfo + datetime);
    }
}
