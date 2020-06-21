package com.example.p0691_parcelable;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    final String TAG = "myLogs";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        Log.d(TAG, "getParcelableExtra");
        MyObject myObj = getIntent().getParcelableExtra(MyObject.class.getCanonicalName());
        Log.d(TAG, "myObj: " + myObj.s + ", " + myObj.i);
    }
}
