package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        //Creating Array
        ArrayList<Word> wordList= new ArrayList<Word>();

        wordList.add(new Word("one","Miwokone", R.drawable.number_one));
        wordList.add(new Word("two","Miwoktwo", R.drawable.number_two));
        wordList.add(new Word("three","Miwokthree", R.drawable.number_three));
        wordList.add(new Word("four","Miwokfour", R.drawable.number_four));
        wordList.add(new Word("five","Miwokfive", R.drawable.number_five));
        wordList.add(new Word("six","Miwoksix", R.drawable.number_six));
        wordList.add(new Word("seven","Miwokseven", R.drawable.number_seven));
        wordList.add(new Word("eight","Miwokeight", R.drawable.number_eight));
        wordList.add(new Word("nine","Miwoknine", R.drawable.number_nine));
        wordList.add(new Word("ten","Miwokten", R.drawable.number_ten));




        WordAdapter wordAdapt= new WordAdapter(this, wordList);

        ListView listv = (ListView) findViewById(R.id.list);
        listv.setAdapter(wordAdapt);



        //adding textviews
//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
//        for (String str : numbers){
//
//            TextView word = new TextView(this);
//
//            word.setText(str);
//            rootView.addView(word);
//
//
//    }
}}
