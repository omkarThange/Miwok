package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMewokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceId;

    public Word(String defaultTranslation, String mewokTranslation, int audioResourceId){
        this.mDefaultTranslation = defaultTranslation;
        this.mMewokTranslation = mewokTranslation;
        this.mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String mewokTranslation, int imageResourceId, int audioResourceId){
        this.mDefaultTranslation = defaultTranslation;
        this.mMewokTranslation = mewokTranslation;
        this.mImageResourceId = imageResourceId;
        this.mAudioResourceId = audioResourceId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMewokTranslation(){
        return mMewokTranslation;
    }

    public int getImageResourceId(){ return mImageResourceId; }

    public boolean hasImage(){ return mImageResourceId != NO_IMAGE_PROVIDED; }

    public int getAudioResourceId(){ return mAudioResourceId; }
}
