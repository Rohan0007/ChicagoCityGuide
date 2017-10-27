package com.example.android.chicagocityguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Rohan on 9/27/17.
 */

public class DiningActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        // Create a list of info objects
        final ArrayList<Info> infos = new ArrayList<>();
        infos.add(new Info("Parson's Chicken And Fish", R.string.parsons, R.drawable.parsons, this));
        infos.add(new Info("The Dawson", R.string.dawson, R.drawable.dawson, this));
        infos.add(new Info("Irazu", R.string.irazu, R.drawable.irazu, this));
        infos.add(new Info("Boka", R.string.boka, R.drawable.boka, this));
        infos.add(new Info("Portillo's", R.string.portillos, R.drawable.portillos, this));
        infos.add(new Info("Sportsman's Club", R.string.sportsmans, R.drawable.sportsmans, this));
        infos.add(new Info("Kaiser Tiger", R.string.kaiser, R.drawable.kaiser, this));
        infos.add(new Info("Homestead", R.string.homestead, R.drawable.homestead, this));

        InfoAdapter adapter = new InfoAdapter(this, infos, R.color.dining);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
