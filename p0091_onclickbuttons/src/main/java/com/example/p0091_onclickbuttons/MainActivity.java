package com.example.p0091_onclickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvOut;
    Button btnOk;
    Button btnCancel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = findViewById(R.id.tvOut);
        btnOk = findViewById(R.id.btnOk);
        btnCancel = findViewById(R.id.btnCancel);

        OnClickListener onBtnOk = new OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Hello");
            }
        };

        btnOk.setOnClickListener((View) -> tvOut.setText("Нажата кнопка ОК"));
        btnCancel.setOnClickListener((View v) -> tvOut.setText("Нажата кнопка Cancel"));
    }
}
