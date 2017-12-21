package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red","rojo", R.drawable.color_red));
        words.add(new Word("mustard yellow"," amarillo mostaza",R.drawable.color_mustard_yellow));
        words.add(new Word("dusty yellow"," amarillo polvoriento", R.drawable.color_dusty_yellow));
        words.add(new Word("green","verde", R.drawable.color_green));
        words.add(new Word("brown","café / marrón", R.drawable.color_brown));
        words.add(new Word("gray","gris", R.drawable.color_gray));
        words.add(new Word("black","negro", R.drawable.color_black));
        words.add(new Word("white","blanco", R.drawable.color_white));


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
