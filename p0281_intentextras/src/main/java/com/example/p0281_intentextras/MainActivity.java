package com.example.p0281_intentextras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etFName;
    EditText etLName;
    EditText etAge;

    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFName = findViewById(R.id.etFName);
        etLName = findViewById(R.id.etLName);
        etAge = findViewById(R.id.etAge);

        btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this::onClick);
    }

    public void onClick(View v) {
        Intent intent = new Intent(this, ViewActivity.class);
        intent.putExtra("fname", etFName.getText().toString());
        intent.putExtra("lname", etLName.getText().toString());
        intent.putExtra("age", etAge.getText().toString());
        startActivity(intent);
    }
}
