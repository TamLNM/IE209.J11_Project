package com.example.lenguyenminhtam.ie209j1_project;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class SelectTab_MonHoc_HocKyAdapter extends FragmentStatePagerAdapter {
    private String              listTab[] = {"THEO MÔN HỌC ", "THEO HỌC KỲ"};
    private MonHoc_Fragment   mMonHocFragment;
    private HocKy_Fragment    mHocKyFragment;

    public SelectTab_MonHoc_HocKyAdapter(FragmentManager fm)
    {
        super(fm);
        mMonHocFragment = new MonHoc_Fragment();
        mHocKyFragment = new HocKy_Fragment();
    }

    public Fragment getItem(int pos)
    {
        if (pos == 0)
        {
            return mMonHocFragment;
        }
        else if (pos == 1)
        {
            return mHocKyFragment;
        }
        else
        {
            // Do nothing
        }
        return null;
    }

    public int getCount()
    {
        return listTab.length;
    }

    public CharSequence getPageTitle(int pos)
    {
        return listTab[pos];
    }
}
