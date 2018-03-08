package com.sipdemo.dell.sip;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;

/**
 * Created by DELL on 3/8/2018.
 */

public class PageAdapter extends FragmentStatePagerAdapter {
    int NoOfTabs;
    public PageAdapter(android.support.v4.app.FragmentManager fm , int  NumberOfTab){
        super(fm);
        this.NoOfTabs = NumberOfTab;

    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
            Dialer tab1 = new Dialer();
            return tab1;
            case 1 :
                Setting tab2 = new Setting();
                return tab2;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return NoOfTabs;
    }
}
