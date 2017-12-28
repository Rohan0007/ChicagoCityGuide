package com.example.android.chicagocityguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AirBnBFragment extends Fragment {


    public AirBnBFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of info objects
        final ArrayList<Info> infos = new ArrayList<>();
        infos.add(new Info(R.string.airbnb_title1, R.string.sunny, R.drawable.sunny, getContext()));
        infos.add(new Info(R.string.airbnb_title2, R.string.instagram, R.drawable.instagram, getContext()));
        infos.add(new Info(R.string.airbnb_title3, R.string.hipster, R.drawable.hipster, getContext()));
        infos.add(new Info(R.string.airbnb_title4, R.string.artsy, R.drawable.artsy, getContext()));
        infos.add(new Info(R.string.airbnb_title5, R.string.playful, R.drawable.playful, getContext()));

        InfoAdapter adapter = new InfoAdapter(getContext(), infos, R.color.dining);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
