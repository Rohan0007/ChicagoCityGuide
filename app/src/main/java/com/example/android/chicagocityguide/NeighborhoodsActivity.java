package com.example.android.chicagocityguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Rohan on 9/27/17.
 */

public class NeighborhoodsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        // Create a list of info objects
        final ArrayList<Info> infos = new ArrayList<>();
        infos.add(new Info("Irving Park", R.string.irving, R.drawable.irving, this));
        infos.add(new Info("Edgewater", R.string.edgewater, R.drawable.edgewater, this));
        infos.add(new Info("Avondale", R.string.avondale, R.drawable.avondale, this));
        infos.add(new Info("Midway Area", R.string.midway, R.drawable.midway, this));
        infos.add(new Info("Roscoe Village", R.string.roscoe, R.drawable.roscoe, this));

        InfoAdapter adapter = new InfoAdapter(this, infos, R.color.dining);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}