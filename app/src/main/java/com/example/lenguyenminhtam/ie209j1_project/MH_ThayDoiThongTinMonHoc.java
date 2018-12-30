package com.example.lenguyenminhtam.ie209j1_project;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MH_ThayDoiThongTinMonHoc extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mh_thaydoithongtinmonhoc);

        // Load fragment
        Fragment_MonHoc fm_monhoc = new Fragment_MonHoc();
        loadFragment(fm_monhoc);

        // Add tv_ThemMonHoc.onClick event
        ImageView imv_ThemMonHoc = (ImageView) findViewById(R.id.imv_ThemMonHoc);
        imv_ThemMonHoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dlg_themmonhoc = new Dialog(v.getContext());
                dlg_themmonhoc.setContentView(R.layout.fragment_themmonhoc);
                Button btn_themmhmoi = dlg_themmonhoc.findViewById(R.id.btnThemMoiMonHoc);
                btn_themmhmoi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        DatabaseHocSinhHelper db= new DatabaseHocSinhHelper(getBaseContext());
                        db.insertMonHoc("506","Lịch sử");
                    }
                });
                dlg_themmonhoc.show();
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
                        Intent intent0 = new Intent(MH_ThayDoiThongTinMonHoc.this, MH_DanhSachLop.class);
                        startActivity(intent0);
                        break;

                    case R.id.nav_themsv:
                        Intent intent1 = new Intent(MH_ThayDoiThongTinMonHoc.this, ThemHocSinhActivity.class);
                        startActivity(intent1);
                        break;

                    case R.id.nav_nhapdiem:
                        Intent intent2 = new Intent(MH_ThayDoiThongTinMonHoc.this, NhapDiemActivity.class);
                        startActivity(intent2);
                        break;

                    case R.id.nav_baocao:
                        Intent intent3 = new Intent(MH_ThayDoiThongTinMonHoc.this, BaoCaoActivity.class);
                        startActivity(intent3);
                        break;

                    case R.id.nav_setting:

                        break;
                }

                return false;
            }
        });
    }

    private boolean loadFragment(Fragment_MonHoc fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fm_dsmonhoc, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}
