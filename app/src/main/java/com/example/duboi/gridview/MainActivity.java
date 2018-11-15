package com.example.duboi.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    GridView grid;
    List<Integer> imagesId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid = findViewById(R.id.grid);
        imagesId = new ArrayList<>();
        imagesId.add(R.drawable.tvshow1);
        imagesId.add(R.drawable.tvshow2);
        imagesId.add(R.drawable.tvshow3);
        imagesId.add(R.drawable.tvshow4);
        imagesId.add(R.drawable.tvshow5);
        imagesId.add(R.drawable.tvshow6);
        imagesId.add(R.drawable.tvshow7);
        imagesId.add(R.drawable.tvshow8);
        imagesId.add(R.drawable.tvshow9);
        imagesId.add(R.drawable.tvshow10);
        imagesId.add(R.drawable.tvshow11);
        imagesId.add(R.drawable.tvshow12);

        grid.setAdapter(new ImageAdapterGrid(getApplicationContext(),imagesId));

    }
}
