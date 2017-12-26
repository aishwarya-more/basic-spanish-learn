package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red","rojo", R.drawable.color_red, R.raw.red));
        words.add(new Word("mustard yellow"," amarillo mostaza",R.drawable.color_mustard_yellow, R.raw.mustard_yellow));
        words.add(new Word("dusty yellow"," amarillo polvoriento", R.drawable.color_dusty_yellow, R.raw.dusty_yellow));
        words.add(new Word("green","verde", R.drawable.color_green, R.raw.green));
        words.add(new Word("brown","café / marrón", R.drawable.color_brown, R.raw.brown));
        words.add(new Word("gray","gris", R.drawable.color_gray, R.raw.gray));
        words.add(new Word("black","negro", R.drawable.color_black,R.raw.black));
        words.add(new Word("white","blanco", R.drawable.color_white, R.raw.white));


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Word word = words.get(position);
                mMediaPlayer = MediaPlayer.create(ColorsActivity.this, word.getmAudioResourceId());
                mMediaPlayer.start();

            }
        });
    }
}
