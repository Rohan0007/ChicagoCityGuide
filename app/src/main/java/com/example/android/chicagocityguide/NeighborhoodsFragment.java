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
public class NeighborhoodsFragment extends Fragment {


    public NeighborhoodsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of info objects
        final ArrayList<Info> infos = new ArrayList<>();
        infos.add(new Info(R.string.neighborhoods_title1, R.string.irving, R.drawable.irving, getContext()));
        infos.add(new Info(R.string.neighborhoods_title2, R.string.edgewater, R.drawable.edgewater, getContext()));
        infos.add(new Info(R.string.neighborhoods_title3, R.string.avondale, R.drawable.avondale, getContext()));
        infos.add(new Info(R.string.neighborhoods_title4, R.string.midway, R.drawable.midway, getContext()));
        infos.add(new Info(R.string.neighborhoods_title5, R.string.roscoe, R.drawable.roscoe, getContext()));

        InfoAdapter adapter = new InfoAdapter(getContext(), infos, R.color.dining);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
