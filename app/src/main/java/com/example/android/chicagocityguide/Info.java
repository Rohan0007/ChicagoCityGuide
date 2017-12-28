package com.example.android.chicagocityguide;

import android.content.Context;
import android.content.res.Resources;

/**
 * Created by Rohan on 9/28/17.
 */

public class Info {
    private Context mContext;

    // Title of the current list item
    private String mTitle;

    // Description of the list item
    private String mDescription;

    // Image resource ID for the list item
    private int mImageID;

    /**
     * Create a new Info object
     *
     * @param descriptionID is the desription ID of the item inputted
     * @param imageID is the image resource ID for the image
     */
    public Info(int titleID, int descriptionID, int imageID, Context context){
        mContext = context;
        mTitle = mContext.getString(titleID);
        mDescription = mContext.getString(descriptionID);
        mImageID = imageID;
    }

    // get the title of the current list item
    public String getTitle(){
        return mTitle;
    }
    // get the description of the list item
    public String getDescription(){
        return mDescription;
    }

    // returns the image resource ID of the list item
    public int getImageID(){
        return mImageID;
    }
}
