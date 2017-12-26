package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Hello","Hola", R.raw.hello));
        words.add(new Word("Good morning","Buenos días", R.raw.good_morning));
        words.add(new Word("Good afternoon","Buenas tardes", R.raw.good_afternoon));
        words.add(new Word("Good night","Buenas noches ", R.raw.good_night));
        words.add(new Word("How’s it going?","¿Qué tal?", R.raw.hows_it_going));
        words.add(new Word("What’s happening?","¿Qué pasa?", R.raw.whats_happening));
        words.add(new Word("What is your name?","¿Cómo te llamas?", R.raw.what_is_your_name));
        words.add(new Word("My name is… ","Me llamo…", R. raw.my_name_is));
        words.add(new Word("How are you?","¿Cómo estás?", R.raw.how_are_you));
        words.add(new Word("I’m well","Estoy bien", R.raw.im_well));
        words.add(new Word("Nice to meet you ","Mucho gusto", R.raw.nice_to_meet_you));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Word word = words.get(position);
                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getmAudioResourceId());
                mMediaPlayer.start();

            }
        });

    }
}
