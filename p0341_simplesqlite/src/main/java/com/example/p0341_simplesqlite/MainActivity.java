package com.example.p0341_simplesqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    final String TAG = "myLogs";
    final String TABLE_NAME = "mytable";

    Button btnAdd, btnRead, btnClear;
    EditText etName, etEmail;

    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.btnAdd);
        btnRead = findViewById(R.id.btnRead);
        btnClear = findViewById(R.id.btnClear);
        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);

        btnClear.setOnClickListener(this::onClick);
        btnRead.setOnClickListener(this::onClick);
        btnAdd.setOnClickListener(this::onClick);

        dbHelper = new DBHelper(this);
    }

    public void onClick(View v) {
        ContentValues cv = new ContentValues();

        String name = etName.getText().toString();
        String email = etEmail.getText().toString();

        SQLiteDatabase db = dbHelper.getWritableDatabase();

        switch (v.getId()) {
            case R.id.btnAdd:
                Log.d(TAG, "--- Insert my " + TABLE_NAME + ": ---");
                cv.put("email", email);
                cv.put("name", name);

                long rowID = db.insert(TABLE_NAME, null, cv);
                Log.d(TAG, "row inserted ID = " + rowID);
                break;
            case R.id.btnRead:
                Log.d(TAG, "--- Rows in " + TABLE_NAME + " ---");
                Cursor c = db.query(TABLE_NAME, null, null, null, null, null, null);
                if (c.moveToFirst()) {
                    int idColIndex = c.getColumnIndex("id");
                    int nameColIndex = c.getColumnIndex("name");
                    int emailColIndex = c.getColumnIndex("email");

                    do {
                        Log.d(TAG, "ID = " + c.getInt(idColIndex) +
                                ", name = " + c.getString(nameColIndex) +
                                ", email = " + c.getString(emailColIndex));
                    } while (c.moveToNext());
                } else {
                    Log.d(TAG, "0 rows");
                }
                c.close();
                break;
            case R.id.btnClear:
                Log.d(TAG, "--- Clear " + TABLE_NAME + ": ---");
                int clearCount = db.delete(TABLE_NAME, null, null);
                Log.d(TAG, "deleted rows count = " + clearCount);
                break;
        }
        dbHelper.close();
    }

    class DBHelper extends SQLiteOpenHelper {
        public DBHelper(Context context) {
            super(context, "myDB", null, 1);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            Log.d(TAG, "--- onCreate database ---");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        }
    }
}
