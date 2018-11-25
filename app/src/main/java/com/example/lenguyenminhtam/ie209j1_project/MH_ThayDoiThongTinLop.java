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

public class MH_ThayDoiThongTinLop extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mh_thaydoithongtinlop);

        // Load fragment
        Fragment_Lop_Setting fm_lop = new Fragment_Lop_Setting();
        loadFragmentL(fm_lop);

        // Add imv_ThemLop.onClick event
        ImageView imv_ThemLop = (ImageView) findViewById(R.id.imv_ThemLop);
        imv_ThemLop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dlg_themlop = new Dialog(v.getContext());
                dlg_themlop.setContentView(R.layout.fragment_themlop);
                dlg_themlop.show();
            }
        });

        // Add bottom navigation bar
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(4);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_home:
                        Intent intent0 = new Intent(MH_ThayDoiThongTinLop.this, MH_DanhSachLop.class);
                        startActivity(intent0);
                        break;

                    case R.id.nav_themsv:
                        Intent intent1 = new Intent(MH_ThayDoiThongTinLop.this, ThemHocSinhActivity.class);
                        startActivity(intent1);
                        break;

                    case R.id.nav_nhapdiem:
                        Intent intent2 = new Intent(MH_ThayDoiThongTinLop.this, NhapDiemActivity.class);
                        startActivity(intent2);
                        break;

                    case R.id.nav_baocao:
                        Intent intent3 = new Intent(MH_ThayDoiThongTinLop.this, BaoCaoActivity.class);
                        startActivity(intent3);
                        break;

                    case R.id.nav_setting:

                        break;
                }

                return false;
            }
        });
    }

    private boolean loadFragmentL(Fragment_Lop_Setting fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fm_dslop, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}
