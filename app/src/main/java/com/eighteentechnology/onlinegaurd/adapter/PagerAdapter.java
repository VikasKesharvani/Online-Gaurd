package com.eighteentechnology.onlinegaurd.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.eighteentechnology.onlinegaurd.fragment.TodayFragment;


/**
 * Created by kundan on 10/16/2015.
 */
public class PagerAdapter extends FragmentPagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment frag = null;
        switch (position) {
            case 0:
                frag = new TodayFragment();
                break;
            case 1:
                frag = new TodayFragment();
                break;
            case 2:
                frag = new TodayFragment();
                break;
           /* case 3:
                frag = new TodayFragment();
                break;
*/
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = " ";
        switch (position) {
            case 0:
                title = "Day";
                break;
            case 1:
                title = "Week";
                break;
            case 2:
                title = "Month";

                break;
          /*  case 3:
                title = "More";

                break;*/

        }

        return title;
    }
}
