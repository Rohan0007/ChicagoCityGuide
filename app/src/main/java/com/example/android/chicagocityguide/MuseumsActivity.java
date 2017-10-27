package com.example.android.chicagocityguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Rohan on 9/27/17.
 */

public class MuseumsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        // Create a list of info objects
        final ArrayList<Info> infos = new ArrayList<>();
        infos.add(new Info("Art Institute of Chicago", R.string.art_institute, R.drawable.art_institute, this));
        infos.add(new Info("The Field Museum", R.string.field, R.drawable.field, this));
        infos.add(new Info("Museum of Science and Industry", R.string.science, R.drawable.science, this));
        infos.add(new Info("Chicago History Museum", R.string.history, R.drawable.history, this));

        InfoAdapter adapter = new InfoAdapter(this, infos, R.color.dining);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}