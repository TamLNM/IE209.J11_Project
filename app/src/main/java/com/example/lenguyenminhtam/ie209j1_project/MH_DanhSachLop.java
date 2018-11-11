package com.example.lenguyenminhtam.ie209j1_project;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MH_DanhSachLop extends AppCompatActivity {
    private ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mh_danhsachlop);

        // Call initView() function
        initView();
    }

    private void initView()
    {
        vp = (ViewPager) findViewById(R.id.vp_lop_hocsinh);
        vp.setAdapter(new MyAdapter(getSupportFragmentManager()));
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tl_lop_hocsinh);
        tabLayout.setupWithViewPager(vp);
    }
}


