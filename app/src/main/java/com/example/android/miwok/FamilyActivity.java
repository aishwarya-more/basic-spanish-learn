package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("father","el padre", R.drawable.family_father));
        words.add(new Word("mother","la madre",R.drawable.family_mother));
        words.add(new Word("son","el hijo", R.drawable.family_son));
        words.add(new Word("daughter","la hija", R.drawable.family_daughter));
        words.add(new Word("older brother","el hermano mayor", R.drawable.family_older_brother));
        words.add(new Word("younger brother","el hermano menor", R.drawable.family_younger_brother));
        words.add(new Word("older sister","la hermana mayor", R.drawable.family_older_sister));
        words.add(new Word("younger sister","la hermana menor", R.drawable.family_younger_sister));
        words.add(new Word("grandmother","la abuela",R.drawable.family_grandmother));
        words.add(new Word("grandfather","el abuelo, eximir",R.drawable.family_grandfather));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
