package com.example.p0291_simpleactivityresult;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class NameActivity extends AppCompatActivity {
    EditText etName;
    Button btnOK;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.name);

        etName = findViewById(R.id.etName);
        btnOK = findViewById(R.id.btnOK);
        btnOK.setOnClickListener(this::handleClick);
    }

    public void handleClick(View v) {
        Intent intent = new Intent();
        intent.putExtra("name", etName.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}
