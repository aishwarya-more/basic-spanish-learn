package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one","uno", R.drawable.number_one, R.raw.number_one));
        words.add(new Word("two","dos",R.drawable.number_two, R.raw.number_two));
        words.add(new Word("three","tres", R.drawable.number_three, R.raw.number_three));
        words.add(new Word("four","cuatro", R.drawable.number_four, R.raw.number_four));
        words.add(new Word("five","cinco", R.drawable.number_five, R.raw.number_five));
        words.add(new Word("six","seis", R.drawable.number_six, R.raw.number_six));
        words.add(new Word("seven","siete", R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word("eight","ocho", R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word("nine","nueve",R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word("ten","diez",R.drawable.number_ten, R.raw.number_ten));



        //Log.v("NumbersActivity","Word at index 0: " + words.get(0));

        //LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

//        for(int index = 0; index < words.size(); index++)
//         {
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            rootView.addView(wordView);
//
//        }

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Word word = words.get(position);
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getmAudioResourceId());
                mMediaPlayer.start();

            }
        });
    }


}
