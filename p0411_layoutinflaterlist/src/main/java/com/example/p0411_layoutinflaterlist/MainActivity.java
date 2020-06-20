package com.example.p0411_layoutinflaterlist;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final String TAG = "MyLogs";
    String[] name = {"Ivan", "Maria", "Petr", "Anton", "Dasha", "Boris", "Kostya", "Igor"};
    String[] position = {"Developer", "Doctor", "Layer", "Director", "Developer", "Doctor", "Layer", "Director"};
    int[] salary = {13000, 10000, 13000, 13000, 10000, 15000, 14000, 6000};

    int[] colors = new int[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors[0] = Color.parseColor("#559966CC");
        colors[1] = Color.parseColor("#55336699");

        LinearLayout linLayout = findViewById(R.id.linLayout);
        LayoutInflater ltInflater = getLayoutInflater();

        for (int i = 0; i < name.length; i++) {
            Log.d(TAG, "i= " + i);
            View item = ltInflater.inflate(R.layout.item, linLayout, false);

            TextView tvName = item.findViewById(R.id.tvName);
            TextView tvPosition = item.findViewById(R.id.tvPosition);
            TextView tvSalary = item.findViewById(R.id.tvSalary);

            tvName.setText(name[i]);
            tvPosition.setText("Должность: " + position[i]);
            tvSalary.setText("Оклад: " + salary[i]);

            item.getLayoutParams().width = LayoutParams.MATCH_PARENT;
            item.setBackgroundColor(colors[i % 2]);
            linLayout.addView(item);
        }
    }
}
