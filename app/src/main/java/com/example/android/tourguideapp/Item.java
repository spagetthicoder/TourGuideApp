package com.example.android.tourguideapp;

/**
 * Created by hobbit2 on 15.6.2017 г..
 */

public class Item {

    private int mTitle;

    private int mLocation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Item(int title, int location) {
        mTitle = title;
        mLocation = location;
    }

    public Item(int title, int location, int imageResourceId) {
        mTitle = title;
        mLocation = location;
        mImageResourceId = imageResourceId;
    }

    public int getTitle() {

        return mTitle;
    }

    public int getLocation() {
        return mLocation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Item{" +
                "mTitle='" + mTitle + '\'' +
                ", mLocation='" + mLocation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }


}
