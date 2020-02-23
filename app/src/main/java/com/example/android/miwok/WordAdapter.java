package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {



    public WordAdapter(Context context, ArrayList<Word> Word){

        super(context, 0, Word);


    }





    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {

        View listView =convertView;
        if (listView== null){

            listView = LayoutInflater.from(getContext()).inflate(R.layout.list_view,parent,false);

        }

        Word currentWord = getItem(position);

        TextView wordDef= (TextView) listView.findViewById(R.id.Eng);
        wordDef.setText(currentWord.getDefWord());

        TextView wordMiw= (TextView) listView.findViewById(R.id.Miwok);
        wordMiw.setText(currentWord.getMiwokWord());

        ImageView wordImg= (ImageView) listView.findViewById(R.id.imgId);
        wordImg.setImageResource(currentWord.getResId());

        return listView;

    }
}
