package com.example.android.chicagocityguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Rohan on 9/27/17.
 */

public class AttractionsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        // Create a list of info objects
        final ArrayList<Info> infos = new ArrayList<>();
        infos.add(new Info("Millennium Park", R.string.millennium, R.drawable.millennium, this));
        infos.add(new Info("The Second City", R.string.second_city, R.drawable.second_city, this));
        infos.add(new Info("Wrigley Field", R.string.wrigley, R.drawable.wrigley, this));
        infos.add(new Info("Lincoln Park Zoo", R.string.lincoln, R.drawable.lincoln, this));
        infos.add(new Info("Chicago Riverwalk", R.string.riverwalk, R.drawable.riverwalk, this));
        infos.add(new Info("Shedd Aquarium", R.string.aquarium, R.drawable.aquarium, this));
        infos.add(new Info("Adler Planetarium", R.string.planetarium, R.drawable.planetarium, this));
        infos.add(new Info("Willis Tower Skydeck", R.string.skydeck, R.drawable.skydeck, this));
        infos.add(new Info("Chicago Cultural Center", R.string.cultural_center, R.drawable.cultural_center, this));

        InfoAdapter adapter = new InfoAdapter(this, infos, R.color.dining);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
