package com.example.lenguyenminhtam.ie209j1_project;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Calendar;

public class XemDanhSachLopActivity extends AppCompatActivity {


    Context context;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mh_danhsachhslop);



        getIntent();
        Fragment_DanhSachLop fm_danhsachlop = new Fragment_DanhSachLop();
        loadFragment(fm_danhsachlop);

        ////DO add somthing.....

        ////BottomNav
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
                        Intent intent1 = new Intent(XemDanhSachLopActivity.this, MH_DanhSachLop.class);
                        startActivity(intent1);
                        break;



                    case R.id.nav_nhapdiem:
                        Intent intent2 = new Intent(XemDanhSachLopActivity.this, NhapDiemActivity.class);
                        startActivity(intent2);
                        break;

                    case R.id.nav_baocao:
                        Intent intent3 = new Intent(XemDanhSachLopActivity.this, BaoCaoActivity.class);
                        startActivity(intent3);
                        break;

                    case R.id.nav_setting:
                        Intent intent4 = new Intent(XemDanhSachLopActivity.this, SettingActivity.class);
                        startActivity(intent4);
                        break;
                }

                return false;
            }
        });
    }
    private boolean loadFragment(Fragment_DanhSachLop fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fm_dshslop, fragment)
                    .commit();
            return true;
        }
        return false;
    }

}
