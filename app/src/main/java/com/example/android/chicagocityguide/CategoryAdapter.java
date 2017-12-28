package com.example.android.chicagocityguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Rohan on 11/1/17.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new DiningFragment();
        } else if (position == 1) {
            return new AttractionsFragment();
        } else if (position == 2) {
            return new NeighborhoodsFragment();
        } else if (position == 3) {
            return new MuseumsFragment();
        } else if (position == 4) {
            return new HotelsFragment();
        } else {
            return new AirBnBFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_dining);
        } else if (position == 1) {
            return mContext.getString(R.string.category_attractions);
        } else if (position == 2) {
            return mContext.getString(R.string.category_neighborhoods);
        }  else if (position == 3) {
            return mContext.getString(R.string.category_museums);
        }  else if (position == 4) {
            return mContext.getString(R.string.category_hotels);
        } else {
            return mContext.getString(R.string.category_airbnb);
        }
    }
}