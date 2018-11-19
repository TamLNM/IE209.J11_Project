package com.example.lenguyenminhtam.ie209j1_project;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import com.vincent.bottomnavigationbar.BottomItem;
import com.vincent.bottomnavigationbar.BottomNavigationBar;

import java.util.ArrayList;
import java.util.List;

public class MH_DanhSachLop extends  AppCompatActivity {
    private ViewPager vp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mh_danhsachlop);
        initView();
    }

    private void initView ()
   {
       vp = (ViewPager) findViewById(R.id.vp_lop_hocsinh);
       vp.setAdapter(new MyAdapter(getSupportFragmentManager()));
       TabLayout tabLayout = (TabLayout) findViewById(R.id.tl_lop_hocsinh);
       tabLayout.setupWithViewPager(vp);
   }


    ///Bottom_Navigation
    private String mPackageName;
    private android.support.design.widget.TabLayout tabLayout;
    private android.support.v4.view.ViewPager viewPager;
    private List<BottomItem> mBnbDefaultList;
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mPackageName = getApplicationInfo().packageName;
        initBnbDefault();
    }

    private void initBnbDefault() {
        mBnbDefaultList = new ArrayList<>();

        //tabLayout = (android.support.design.widget.TabLayout) findViewById(R.id.tl_lop_hocsinh);
        //viewPager = (android.support.v4.view.ViewPager) findViewById(R.id.vp_lop_hocsinh);

       BottomNavigationBar mBnbDefault = (BottomNavigationBar) findViewById(R.id.bottom_navigation);
       mBnbDefault.addOnSelectedListener(new BottomNavigationBar.OnSelectedListener() {
          @Override
           public void OnSelected(int oldPosition, int newPosition) {
               // Xử lý sự kiện click
          }
        }
        );

       ////Thêm item vào navigation;
        BottomItem item1 = new BottomItem();
        item1.setText("Trang chủ");
        item1.setIconResID(getResources().getIdentifier("ic_home", "drawable", mPackageName));
        item1.setActiveBgResID(R.drawable.bg_bottom_navi_selected);
        item1.setInactiveBgResID(R.drawable.bg_bottom_navi_normal);

        mBnbDefault.addItem(item1);
        mBnbDefaultList.add(item1);

        BottomItem item2 = new BottomItem();
        item2.setText("Thêm mới");
        item2.setIconResID(getResources().getIdentifier("ic_person_add", "drawable", mPackageName));
        item2.setActiveBgResID(R.drawable.bg_bottom_navi_selected);
        item2.setInactiveBgResID(R.drawable.bg_bottom_navi_normal);
        mBnbDefault.addItem(item2);
        mBnbDefaultList.add(item2);

        BottomItem item3 = new BottomItem();
        item3.setText("Nhập điểm");
        item3.setIconResID(getResources().getIdentifier("ic_library_books", "drawable", mPackageName));
        item3.setActiveBgResID(R.drawable.bg_bottom_navi_selected);
        item3.setInactiveBgResID(R.drawable.bg_bottom_navi_normal);
        mBnbDefault.addItem(item3);
        mBnbDefaultList.add(item3);

        BottomItem item4 = new BottomItem();
        item4.setText("Báo cáo");
        item4.setIconResID(getResources().getIdentifier("ic_assessment", "drawable", mPackageName));
        item4.setActiveBgResID(R.drawable.bg_bottom_navi_selected);
        item4.setInactiveBgResID(R.drawable.bg_bottom_navi_normal);
        mBnbDefault.addItem(item4);
        mBnbDefaultList.add(item4);

        BottomItem item5 = new BottomItem();
        item5.setText("Cài đặt");
        item5.setIconResID(getResources().getIdentifier("ic_settings", "drawable", mPackageName));
        item5.setActiveBgResID(R.drawable.bg_bottom_navi_selected);
        item5.setInactiveBgResID(R.drawable.bg_bottom_navi_normal);
        mBnbDefault.addItem(item5);
        mBnbDefaultList.add(item5);

        mBnbDefault.setSelectedPosition(0); //Set default selected item
        ////add code  Xử lý sự kiện click....
        mBnbDefault.initialize();
    }

}



