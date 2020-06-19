package com.example.p0261_intentfilter;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ActivityDate extends AppCompatActivity {
    TextView tvDate;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.date);

        SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy");
        String date = sdf.format(new Date(System.currentTimeMillis()));

        tvDate = findViewById(R.id.tvDate);
        tvDate.setText(date);
    }
}
