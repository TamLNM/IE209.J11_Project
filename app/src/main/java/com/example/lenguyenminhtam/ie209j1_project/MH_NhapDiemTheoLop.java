package com.example.lenguyenminhtam.ie209j1_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MH_NhapDiemTheoLop extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mh_nhapdiemtheolop);

        // Load Fragment_HocSinh_MHNhapDiemTheoLop
        Fragment_HocSinh_MHNhapDiemTheoLop fm_hs = new Fragment_HocSinh_MHNhapDiemTheoLop();
        loadFragmentL(fm_hs);

        // Get class name value
        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            String tenlop       = bundle.getString("txttenlop");
            String hocky_namhoc = bundle.getString("txthocky") + " - Năm học: " + bundle.getString("txtnamhoc");
            String monhoc       = "MÔN HỌC: " + bundle.getString("txtmonhoc");
            String loaidiem     = "LOẠI ĐIỂM: " + bundle.getString("txtloaidiem");

            TextView tvTitleNhapDiem = (TextView) findViewById(R.id.tv_TitleNhapDiem);
            tvTitleNhapDiem.setText("NHẬP ĐIỂM LỚP " + tenlop);

            TextView tvHocKy_NamHoc = (TextView) findViewById(R.id.tv_HocKyNamHoc);
            tvHocKy_NamHoc.setText(hocky_namhoc);

            TextView tvMonHoc = (TextView) findViewById(R.id.tv_MonHoc);
            tvMonHoc.setText(monhoc);

            TextView tvLoaiDiem = (TextView) findViewById(R.id.tv_LoaiDiem);
            tvLoaiDiem.setText(loaidiem);
        }

        // Add bottom navigation bar
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_home:
                        break;

                    case R.id.nav_themsv:
                        Intent intent1 = new Intent(MH_NhapDiemTheoLop.this,  ThemHocSinhActivity.class);
                        startActivity(intent1);
                        break;

                    case R.id.nav_nhapdiem:
                        Intent intent2 = new Intent(MH_NhapDiemTheoLop.this, NhapDiemActivity.class);
                        startActivity(intent2);
                        break;

                    case R.id.nav_baocao:
                        Intent intent3 = new Intent(MH_NhapDiemTheoLop.this, BaoCaoActivity.class);
                        startActivity(intent3);
                        break;

                    case R.id.nav_setting:
                        Intent intent4 = new Intent(MH_NhapDiemTheoLop.this, SettingActivity.class);
                        startActivity(intent4);
                        break;
                }

                return false;
            }
        });

    }

    private boolean loadFragmentL(Fragment_HocSinh_MHNhapDiemTheoLop fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fm_dshocsinh_mhnhapdiem, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}
