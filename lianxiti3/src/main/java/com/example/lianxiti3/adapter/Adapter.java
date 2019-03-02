package com.example.lianxiti3.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.lianxiti3.fragment.HomeFragment;
import com.example.lianxiti3.fragment.HomeThreeFragment;
import com.example.lianxiti3.fragment.HomeTwoFragment;

public class Adapter extends FragmentPagerAdapter {

    public Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                return new HomeFragment();
            case 1:
                return new HomeTwoFragment();
            case 2:
                return new HomeThreeFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
