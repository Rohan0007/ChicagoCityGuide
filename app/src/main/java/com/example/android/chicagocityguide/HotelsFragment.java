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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of info objects
        final ArrayList<Info> infos = new ArrayList<>();
        infos.add(new Info(R.string.hotels_title1, R.string.athletic, R.drawable.athletic, getContext()));
        infos.add(new Info(R.string.hotels_title2, R.string.palmer, R.drawable.palmer, getContext()));
        infos.add(new Info(R.string.hotels_title3, R.string.virgin, R.drawable.virgin, getContext()));
        infos.add(new Info(R.string.hotels_title4, R.string.blackstone, R.drawable.blackstone, getContext()));
        infos.add(new Info(R.string.hotels_title5, R.string.marriott, R.drawable.marriott, getContext()));
        infos.add(new Info(R.string.hotels_title6, R.string.hard_rock, R.drawable.hard_rock, getContext()));
        infos.add(new Info(R.string.hotels_title7, R.string.london_house, R.drawable.london_house, getContext()));
        infos.add(new Info(R.string.hotels_title8, R.string.kimpton, R.drawable.kimpton, getContext()));

        InfoAdapter adapter = new InfoAdapter(getContext(), infos, R.color.dining);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
