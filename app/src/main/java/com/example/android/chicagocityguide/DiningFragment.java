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
public class DiningFragment extends Fragment {


    public DiningFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of info objects
        final ArrayList<Info> infos = new ArrayList<>();
        infos.add(new Info(R.string.dining_title1, R.string.parsons, R.drawable.parsons, getContext()));
        infos.add(new Info(R.string.dining_title2, R.string.dawson, R.drawable.dawson, getContext()));
        infos.add(new Info(R.string.dining_title3, R.string.irazu, R.drawable.irazu, getContext()));
        infos.add(new Info(R.string.dining_title4, R.string.boka, R.drawable.boka, getContext()));
        infos.add(new Info(R.string.dining_title5, R.string.portillos, R.drawable.portillos, getContext()));
        infos.add(new Info(R.string.dining_title6, R.string.sportsmans, R.drawable.sportsmans, getContext()));
        infos.add(new Info(R.string.dining_title7, R.string.kaiser, R.drawable.kaiser, getContext()));
        infos.add(new Info(R.string.dining_title8, R.string.homestead, R.drawable.homestead, getContext()));

        InfoAdapter adapter = new InfoAdapter(getContext(), infos, R.color.dining);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
