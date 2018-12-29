package com.example.lenguyenminhtam.ie209j1_project;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MH_ChonLop extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mh_chonlop);

        // Load fragment
        Fragment_ChonLop fm_chonlop = new Fragment_ChonLop();
        loadFragment(fm_chonlop);

//        Bundle bundle = getIntent().getExtras();
//        if (bundle !=null){
//            String txt_hoten= bundle.getString("txt_themhs_hoten");
//            String txt_ngaysinh = bundle.getString("txt_themhs_ngaysinh");
//            String txt_email=bundle.getString("txt_themhs_email");
//            String txt_diachi = bundle.getString("txt_themhs_diachi");
//            String txt_gioitinh=bundle.getString("txt_themhs_gioitinh");
//        }
        // Add bottom navigation bar
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_home:
                        Intent intent0 = new Intent(MH_ChonLop.this, MH_DanhSachLop.class);
                        startActivity(intent0);
                        break;

                    case R.id.nav_themsv:

                        break;

                    case R.id.nav_nhapdiem:
                        Intent intent2 = new Intent(MH_ChonLop.this, NhapDiemActivity.class);
                        startActivity(intent2);
                        break;

                    case R.id.nav_baocao:
                        Intent intent3 = new Intent(MH_ChonLop.this, BaoCaoActivity.class);
                        startActivity(intent3);
                        break;

                    case R.id.nav_setting:
                        Intent intent4 = new Intent(MH_ChonLop.this, BaoCaoActivity.class);
                        startActivity(intent4);
                        break;
                }

                return false;
            }
        });
    }

    private boolean loadFragment(Fragment_ChonLop fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fm_dschonlop, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}

