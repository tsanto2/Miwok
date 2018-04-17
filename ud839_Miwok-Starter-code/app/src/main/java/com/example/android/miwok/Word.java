package com.example.android.miwok;

import android.content.Context;

public class Word {
    private String mDefaultTranslation, mMiwokTranslation;

    private int mImageSource, mAudioSource;

    private Boolean mHideImage;

    public Word(String defaultTranslation, String miwokTranslation, int imageSource, int audioSource){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageSource = imageSource;
        mAudioSource = audioSource;
        mHideImage = false;
    }

    public Word(String defaultTranslation, String miwokTranslation, int audioSource){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioSource = audioSource;
        mHideImage = true;
    }

    public int getAudioSource(){ return mAudioSource; }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageSource() { return mImageSource; }

    public Boolean hideImage() { return mHideImage; }

    public String[] getText(){
        String[] translationPair = new String[2];
        translationPair[0] = mMiwokTranslation;
        translationPair[1] = mDefaultTranslation;

        return  translationPair;
    }

}
