package com.example.android.chicagocityguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view/layout that shows the Dine n Drink category
        RelativeLayout dining = (RelativeLayout) findViewById(R.id.dine_n_drink);
        dining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent diningIntent = new Intent(MainActivity.this, DiningActivity.class);
                startActivity(diningIntent);
            }
        });

        // Find the view/layout that shows the Famous Attractions category
        RelativeLayout attractions = (RelativeLayout) findViewById(R.id.famous_attractions);
        attractions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent attractionsIntent = new Intent(MainActivity.this, AttractionsActivity.class);
                startActivity(attractionsIntent);
            }
        });

        // Find the view/layout that shows the Neighborhoods category
        RelativeLayout neighborhoods = (RelativeLayout) findViewById(R.id.neighborhoods);
        neighborhoods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent neighborhoodsIntent = new Intent(MainActivity.this, NeighborhoodsActivity.class);
                startActivity(neighborhoodsIntent);
            }
        });

        // Find the view/layout that shows the Museums category
        RelativeLayout museums = (RelativeLayout) findViewById(R.id.museums);
        museums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent museumsIntent = new Intent(MainActivity.this, MuseumsActivity.class);
                startActivity(museumsIntent);
            }
        });

        // Find the view/layout that shows the Popular Hotels category
        RelativeLayout hotels = (RelativeLayout) findViewById(R.id.popular_hotels);
        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotelsIntent = new Intent(MainActivity.this, HotelsActivity.class);
                startActivity(hotelsIntent);
            }
        });

        // Find the view/layout that shows the Cool AirBnB Rentals category
        RelativeLayout airbnb = (RelativeLayout) findViewById(R.id.airbnb_rentals);
        airbnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent airbnbIntent = new Intent(MainActivity.this, AirBnBActivity.class);
                startActivity(airbnbIntent);
            }
        });

    }
}
