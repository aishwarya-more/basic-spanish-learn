package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one","uno", R.drawable.number_one));
        words.add(new Word("two","dos",R.drawable.number_two));
        words.add(new Word("three","tres", R.drawable.number_three));
        words.add(new Word("four","cuatro", R.drawable.number_four));
        words.add(new Word("five","cinco", R.drawable.number_five));
        words.add(new Word("six","seis", R.drawable.number_six));
        words.add(new Word("seven","siete", R.drawable.number_seven));
        words.add(new Word("eight","ocho", R.drawable.number_eight));
        words.add(new Word("nine","nueve",R.drawable.number_nine));
        words.add(new Word("ten","diez",R.drawable.number_ten));



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
    }


}
