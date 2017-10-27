package com.example.android.chicagocityguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rohan on 9/28/17.
 */

/**
 * InfoAdapter is an ArrayAdapter that can provide the layout for each list item
 * based on a data source, which is a list of Info objects.
 */
public class InfoAdapter extends ArrayAdapter<Info> {

    /**
     * Resource ID for the background color for this list of words
     */
    private int mColorResourceID;

    /**
     * Create a new InfoAdapter object.
     *
     * @param context         is the current context (i.e. Activity) that the adapter is being created in.
     * @param infos           is the list of Info to be displayed.
     * @param colorResourceID is the resource ID for the background color for this list of words
     */
    public InfoAdapter(Context context, ArrayList<Info> infos, int colorResourceID) {
        super(context, 0, infos);
        mColorResourceID = colorResourceID;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the Info object located at this position in the list
        Info currentInfo = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID title
        TextView title = (TextView) listItemView.findViewById(R.id.title);

        // Get the title from the currentInfo object and set this title on the
        // title text view
        title.setText(currentInfo.getTitle());

        // Find the TextView in the list_item.xml layout with the ID text_container
        TextView description = (TextView) listItemView.findViewById(R.id.description);

        // Get the description from the currentInfo object and set this text on
        // the description TextView.
        description.setText(currentInfo.getDescription());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        image.setImageResource(currentInfo.getImageID());

        // Set the theme color for the list item
        View container = listItemView.findViewById(R.id.list_item_container);

        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceID);

        // Set the background color of the text container View
        container.setBackgroundColor(color);

        // Return the whole list item layout so that it can be shown in the ListView.
        return listItemView;
    }
}