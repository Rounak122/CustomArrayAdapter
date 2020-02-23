package com.example.android.miwok;

import java.lang.String;

public class Word {

    private String defWord;
    private String miwokWord;
    private  int resId;

    public String getDefWord() {
        return defWord;
    }

    public String getMiwokWord() {
        return miwokWord;
    }

    public int getResId() {
        return resId;
    }

    public Word(String def, String miwok, int resId) {

        this.defWord = def;
        this.miwokWord = miwok;
        this.resId=resId;


    }
    public Word(String def, String miwok) {

        this.defWord = def;
        this.miwokWord = miwok;



    }

}
