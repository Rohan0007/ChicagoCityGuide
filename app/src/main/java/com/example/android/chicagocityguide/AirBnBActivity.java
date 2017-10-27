package com.example.android.chicagocityguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Rohan on 9/27/17.
 */

public class AirBnBActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        // Create a list of info objects
        final ArrayList<Info> infos = new ArrayList<>();
        infos.add(new Info("Sunny Stunner", R.string.sunny, R.drawable.sunny, this));
        infos.add(new Info("Instagram IRL", R.string.instagram, R.drawable.instagram, this));
        infos.add(new Info("Hipster Paradise", R.string.hipster, R.drawable.hipster, this));
        infos.add(new Info("Artsy Abode", R.string.artsy, R.drawable.artsy, this));
        infos.add(new Info("Playful Loft", R.string.playful, R.drawable.playful, this));

        InfoAdapter adapter = new InfoAdapter(this, infos, R.color.dining);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
