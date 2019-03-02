package com.example.lianxiti3.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.lianxiti3.fragment.HomeFragment;
import com.example.lianxiti3.fragment.HomeThreeFragment;
import com.example.lianxiti3.fragment.HomeTwoFragment;
import com.example.lianxiti3.fragment.tabfragment.TabOneFragment;
import com.example.lianxiti3.fragment.tabfragment.TabTwoFragment;

public class TabAdapter extends FragmentPagerAdapter {
    String[] strings = new String[]{"全部订单","代付款"};
    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                return new TabOneFragment();
            case 1:
                return new TabTwoFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return strings[position];
    }
}
