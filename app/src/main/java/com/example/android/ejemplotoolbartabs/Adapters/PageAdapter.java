package com.example.android.ejemplotoolbartabs.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.android.ejemplotoolbartabs.Fragments.PrimerFragment;
import com.example.android.ejemplotoolbartabs.Fragments.SegundoFragment;
import com.example.android.ejemplotoolbartabs.Fragments.TercerFragment;

public class PageAdapter extends FragmentStatePagerAdapter {
    private int numeroTabs;
    public PageAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.numeroTabs=tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new PrimerFragment();
            case 1:
                return new SegundoFragment();
            case 2:
                return new TercerFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numeroTabs;
    }
}
