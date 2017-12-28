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
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of info objects
        final ArrayList<Info> infos = new ArrayList<>();
        infos.add(new Info(R.string.attractions_title1, R.string.millennium, R.drawable.millennium, getContext()));
        infos.add(new Info(R.string.attractions_title2, R.string.second_city, R.drawable.second_city, getContext()));
        infos.add(new Info(R.string.attractions_title3, R.string.wrigley, R.drawable.wrigley, getContext()));
        infos.add(new Info(R.string.attractions_title4, R.string.lincoln, R.drawable.lincoln, getContext()));
        infos.add(new Info(R.string.attractions_title5, R.string.riverwalk, R.drawable.riverwalk, getContext()));
        infos.add(new Info(R.string.attractions_title6, R.string.aquarium, R.drawable.aquarium, getContext()));
        infos.add(new Info(R.string.attractions_title7, R.string.planetarium, R.drawable.planetarium, getContext()));
        infos.add(new Info(R.string.attractions_title8, R.string.skydeck, R.drawable.skydeck, getContext()));
        infos.add(new Info(R.string.attractions_title9, R.string.cultural_center, R.drawable.cultural_center, getContext()));

        InfoAdapter adapter = new InfoAdapter(getContext(), infos, R.color.dining);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
