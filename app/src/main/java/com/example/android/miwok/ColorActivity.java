package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        //Creating Array
        ArrayList<Word> wordList= new ArrayList<Word>();

        wordList.add(new Word("colorone","MiwokColorone"));
        wordList.add(new Word("ctwo","MiwokColortwo"));
        wordList.add(new Word("cthree","MiwokColorthree"));
        wordList.add(new Word("cfour","MiwokColorfour"));
        wordList.add(new Word("cfive","MiwokColorfive"));
        wordList.add(new Word("csix","MiwokColorsix"));
        wordList.add(new Word("cseven","MiwokColorseven"));
        wordList.add(new Word("ceight","MiwokColoreight"));
        wordList.add(new Word("cnine","MiwokColornine"));
        wordList.add(new Word("cten","MiwokColorten"));




        WordAdapter wordAdapt= new WordAdapter(this, wordList);

        ListView listv = (ListView) findViewById(R.id.list);
        listv.setAdapter(wordAdapt);

    }}
