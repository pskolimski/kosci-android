package com.example.kosci;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        String nickName = intent.getStringExtra("nickName");
        String date = intent.getStringExtra("date");
        String points = intent.getStringExtra("points");

        ListView listView = findViewById(R.id.resultListView);
        List<String> pointsList = new ArrayList<>();
        pointsList.add(points);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, pointsList);
        listView.setAdapter(adapter);
    }
}
