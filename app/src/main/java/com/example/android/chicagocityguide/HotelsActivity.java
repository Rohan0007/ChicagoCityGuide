package com.example.android.chicagocityguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Rohan on 9/27/17.
 */

public class HotelsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        // Create a list of info objects
        final ArrayList<Info> infos = new ArrayList<>();
        infos.add(new Info("Chicago Athletic Association", R.string.athletic, R.drawable.athletic, this));
        infos.add(new Info("Palmer House Hilton", R.string.palmer, R.drawable.palmer, this));
        infos.add(new Info("Virgin Hotels Chicago", R.string.virgin, R.drawable.virgin, this));
        infos.add(new Info("The Blackstone", R.string.blackstone, R.drawable.blackstone, this));
        infos.add(new Info("JW Marriott", R.string.marriott, R.drawable.marriott, this));
        infos.add(new Info("Hard Rock Hotel", R.string.hard_rock, R.drawable.hard_rock, this));
        infos.add(new Info("LondonHouse Chicago", R.string.london_house, R.drawable.london_house, this));
        infos.add(new Info("The Kimpton Gray Hotel", R.string.kimpton, R.drawable.kimpton, this));

        InfoAdapter adapter = new InfoAdapter(this, infos, R.color.dining);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}