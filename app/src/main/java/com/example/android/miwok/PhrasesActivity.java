package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Hello","Hola"));
        words.add(new Word("Good morning","Buenos días"));
        words.add(new Word("Good afternoon","Buenas tardes"));
        words.add(new Word("Good night","Buenas noches "));
        words.add(new Word("How’s it going?","¿Qué tal?"));
        words.add(new Word("What’s happening?","¿Qué pasa?"));
        words.add(new Word("What is your name?","¿Cómo te llamas?"));
        words.add(new Word("My name is… ","Me llamo…"));
        words.add(new Word("How are you?","¿Cómo estás? "));
        words.add(new Word("I’m well","Estoy bien"));
        words.add(new Word("Nice to meet you ","Mucho gusto"));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
