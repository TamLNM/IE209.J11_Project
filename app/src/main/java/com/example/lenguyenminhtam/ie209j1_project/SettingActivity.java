package com.example.lenguyenminhtam.ie209j1_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class SettingActivity  extends AppCompatActivity {

    TextView tvThayDoiQuyDinh;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        // Bottom navigation
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
                        Intent intent0 = new Intent(SettingActivity.this, MH_DanhSachLop.class);
                        startActivity(intent0);
                        break;

                    case R.id.nav_themsv:
                        Intent intent1 = new Intent(SettingActivity.this, ThemHocSinhActivity.class);
                        startActivity(intent1);
                        break;

                    case R.id.nav_nhapdiem:
                        Intent intent2 = new Intent(SettingActivity.this, NhapDiemActivity.class);
                        startActivity(intent2);
                        break;

                    case R.id.nav_baocao:
                        Intent intent3 = new Intent(SettingActivity.this, BaoCaoActivity.class);
                        startActivity(intent3);
                        break;

                    case R.id.nav_setting:

                        break;
                }

                return false;
            }
        });

        // Navigate to MH_ThayDoiQuyDinh
        tvThayDoiQuyDinh = findViewById(R.id.tv_ThayDoiQuyDinh);
        tvThayDoiQuyDinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initView();
            }
        });
    }

    void initView(){
        Intent intent = new Intent(this, MH_ThayDoiQuyDinh.class);
        startActivity(intent);
    }

}
