package com.example.p0111_resvalues;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    private static final String TAG = "nyLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = findViewById(R.id.tvOut);
        btnOk = findViewById(R.id.btnOk);
        btnCancel = findViewById(R.id.btnCancel);

        btnCancel.setOnClickListener((View v) -> {
            Log.d(TAG, "Кнопка Cancel");
            tvOut.setText("cancel".toUpperCase());
            Toast.makeText(this, "Нажата кнопка", Toast.LENGTH_LONG).show();
        });
        btnOk.setOnClickListener((View v) -> {
            Log.d(TAG, "Кнопка ОК");
            tvOut.setText("OK");
        });
    }
}
