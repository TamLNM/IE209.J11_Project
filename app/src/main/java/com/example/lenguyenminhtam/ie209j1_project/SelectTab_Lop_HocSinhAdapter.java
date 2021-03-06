package com.example.lenguyenminhtam.ie209j1_project;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentManager;

import java.util.ArrayList;
import java.util.List;


public class SelectTab_Lop_HocSinhAdapter extends FragmentStatePagerAdapter {
    private String              listTab[] = {"LỚP", "HỌC SINH"};
    private Fragment_Lop        mFragmentLop;
    private Fragment_HocSinh    mFragmentHocSinh;
    
    public SelectTab_Lop_HocSinhAdapter(FragmentManager fm)
    {
        super(fm);
        mFragmentLop = new Fragment_Lop();
        mFragmentHocSinh = new Fragment_HocSinh();
    }

    public Fragment getItem(int pos)
    {
        if (pos == 0)
        {
            return mFragmentLop;
        }
        else if (pos == 1)
        {
            return mFragmentHocSinh;
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
