package com.example.p0301_activityresult;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AlignActivity extends AppCompatActivity {
    Button btnLeft;
    Button btnRight;
    Button btnCenter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.align);

        btnLeft = findViewById(R.id.btnLeft);
        btnRight = findViewById(R.id.btnRight);
        btnCenter = findViewById(R.id.btnCenter);

        btnLeft.setOnClickListener(this::handleClick);
        btnRight.setOnClickListener(this::handleClick);
        btnCenter.setOnClickListener(this::handleClick);
    }

    public void handleClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.btnLeft:
                intent.putExtra("alignment", Gravity.LEFT);
                break;
            case R.id.btnCenter:
                intent.putExtra("alignment", Gravity.CENTER);
                break;
            case R.id.btnRight:
                intent.putExtra("alignment", Gravity.RIGHT);
                break;
        }
        setResult(RESULT_OK, intent);
        finish();
    }
}
