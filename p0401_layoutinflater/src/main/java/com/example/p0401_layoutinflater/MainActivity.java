package com.example.p0401_layoutinflater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final String TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater ltInflater = getLayoutInflater();

        LinearLayout linLayout = findViewById(R.id.linLayout);
        View view1 = ltInflater.inflate(R.layout.text, linLayout, true);
        LayoutParams lp1 = (LayoutParams) view1.getLayoutParams();

        Log.d(TAG, "Class of view1: " + view1.getClass().toString());
        Log.d(TAG, "Class of layoutParams of view1: " + lp1.getClass().toString());

        RelativeLayout relLayout = findViewById(R.id.relLayout);
        View view2 = ltInflater.inflate(R.layout.text, relLayout, true);
        LayoutParams lp2 = (LayoutParams) view2.getLayoutParams();

        Log.d(TAG, "Class of view1: " + view2.getClass().toString());
        Log.d(TAG, "Class of layoutParams of view1: " + lp2.getClass().toString());
    }
}
