package com.example.p0421_simplelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] names = {"Ivan", "Maria", "Petr", "Anton", "Dasha", "Boris", "Kostya", "Igor"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvMain = findViewById(R.id.lvMain);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.my_list_item, names);

        lvMain.setAdapter(adapter);
    }
}
