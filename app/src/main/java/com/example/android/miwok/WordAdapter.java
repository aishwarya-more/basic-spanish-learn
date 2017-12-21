package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Aishwarya on 20-12-2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    public static final String LOG_TAG1 = NumbersActivity.class.getSimpleName();
    public static final String LOG_TAG2 = ColorsActivity.class.getSimpleName();
    public static final String LOG_TAG3 = FamilyActivity.class.getSimpleName();
    public static final String LOG_TAG4 = PhrasesActivity.class.getSimpleName();

    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId)
    {

        super(context,0,words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Word currentNumber = getItem(position);
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentNumber.getDefaultTranslation());
        TextView spanishTextView = (TextView) listItemView.findViewById(R.id.spanish_text_view);
        spanishTextView.setText(currentNumber.getMiwokTranslation());
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
        if(currentNumber.hasImage())
        {
            iconView.setImageResource(currentNumber.getmImageResourceID());
            iconView.setVisibility(View.VISIBLE);
        }
        else
        {
            iconView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);


        return listItemView;
    }
}
