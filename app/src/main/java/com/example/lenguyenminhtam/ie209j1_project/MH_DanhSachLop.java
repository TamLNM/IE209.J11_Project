package com.example.lenguyenminhtam.ie209j1_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MH_DanhSachLop extends  AppCompatActivity {
    private static final String TAG = "MH_DanhSachLop";
    private ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mh_danhsachlop);
        initView();


        ////bottom
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_home:
                        break;

                    case R.id.nav_themsv:
                        Intent intent1 = new Intent(MH_DanhSachLop.this,  ThemHocSinhActivity.class);
                        startActivity(intent1);
                        break;

                    case R.id.nav_nhapdiem:
                        Intent intent2 = new Intent(MH_DanhSachLop.this, NhapDiemActivity.class);
                        startActivity(intent2);
                        break;

                    case R.id.nav_baocao:
                        Intent intent3 = new Intent(MH_DanhSachLop.this, BaoCaoActivity.class);
                        startActivity(intent3);
                        break;

                    case R.id.nav_setting:
                        Intent intent4 = new Intent(MH_DanhSachLop.this, SettingActivity.class);
                        startActivity(intent4);
                        break;
                }

                return false;
            }
        });


    }

    private void initView ()
   {
       vp = (ViewPager) findViewById(R.id.vp_lop_hocsinh);
       vp.setAdapter(new SelectTab_Lop_HocSinhAdapter(getSupportFragmentManager()));
       TabLayout tabLayout = (TabLayout) findViewById(R.id.tl_lop_hocsinh);
       tabLayout.setupWithViewPager(vp);
   }



}



