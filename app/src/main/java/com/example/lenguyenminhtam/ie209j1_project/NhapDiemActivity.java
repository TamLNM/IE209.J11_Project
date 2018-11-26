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
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class NhapDiemActivity extends AppCompatActivity
                              implements AdapterView.OnItemSelectedListener
{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhapdiem);

        // Add content of spinner Lop
        Spinner spnLop = findViewById(R.id.spn_Lop);
        ArrayAdapter<CharSequence> adapterLop = ArrayAdapter.createFromResource(this, R.array.DSLop, android.R.layout.simple_spinner_dropdown_item);
        adapterLop.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnLop.setAdapter(adapterLop);
        spnLop.setOnItemSelectedListener(this);

        // Add content of spinner Mon
        Spinner spnMonHoc = findViewById(R.id.spn_MonHoc);
        ArrayAdapter<CharSequence> adapterMonHoc = ArrayAdapter.createFromResource(this, R.array.DSMonHoc, android.R.layout.simple_spinner_dropdown_item);
        adapterLop.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnMonHoc.setAdapter(adapterMonHoc);

        // Add content of spinner Hoc Ky
        Spinner spnHocKy = findViewById(R.id.spn_HocKy);
        ArrayAdapter<CharSequence> adapterHocKy = ArrayAdapter.createFromResource(this, R.array.DSHocKy, android.R.layout.simple_spinner_dropdown_item);
        adapterLop.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnHocKy.setAdapter(adapterHocKy);

        // Add content of spinner Nam Hoc
        Spinner spnNamHoc = findViewById(R.id.spn_NamHoc);
        ArrayAdapter<CharSequence> adapterNamHoc = ArrayAdapter.createFromResource(this, R.array.DSNamHoc, android.R.layout.simple_spinner_dropdown_item);
        adapterNamHoc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnNamHoc.setAdapter(adapterNamHoc);

        // Add content of spinner Loai Diem
        Spinner spnLoaiDiem = findViewById(R.id.spn_LoaiDiem);
        ArrayAdapter<CharSequence> adapterLoaiDiem = ArrayAdapter.createFromResource(this, R.array.DSLoaiDiem, android.R.layout.simple_spinner_dropdown_item);
        adapterLoaiDiem.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnLoaiDiem.setAdapter(adapterLoaiDiem);

        // Add button btn_TiepTuc click
        Button btnTieptuc = (Button) findViewById(R.id.btn_TiepTuc);
        btnTieptuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initViewNhapDiemTheoLop();
            }
        });

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
                        Intent intent0 = new Intent(NhapDiemActivity.this, MH_DanhSachLop.class);
                        startActivity(intent0);
                        break;

                    case R.id.nav_themsv:
                        Intent intent1 = new Intent(NhapDiemActivity.this, ThemHocSinhActivity.class);
                        startActivity(intent1);
                        break;

                    case R.id.nav_nhapdiem:

                        break;

                    case R.id.nav_baocao:
                        Intent intent3 = new Intent(NhapDiemActivity.this, BaoCaoActivity.class);
                        startActivity(intent3);
                        break;

                    case R.id.nav_setting:
                        Intent intent4 = new Intent(NhapDiemActivity.this, SettingActivity.class);
                        startActivity(intent4);
                        break;
                }

                return false;
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    void initViewNhapDiemTheoLop(){
        Spinner spnLop      = (Spinner) findViewById(R.id.spn_Lop);
        Spinner spnMonHoc   = (Spinner) findViewById(R.id.spn_MonHoc);
        Spinner spnHocKy    = (Spinner) findViewById(R.id.spn_HocKy);
        Spinner spnNamHoc   = (Spinner) findViewById(R.id.spn_NamHoc);
        Spinner spnLoaiDiem = (Spinner) findViewById(R.id.spn_LoaiDiem);


        String tenlop       = String.valueOf(spnLop.getSelectedItem());
        String tenmonhoc    = String.valueOf(spnMonHoc.getSelectedItem());
        String hocky        = String.valueOf(spnHocKy.getSelectedItem());
        String namhoc       = String.valueOf(spnNamHoc.getSelectedItem());
        String loaidiem       = String.valueOf(spnLoaiDiem.getSelectedItem());

        // Pass tenlop variable to MH_NhapDiemTheoLop
        Intent intent = new Intent(NhapDiemActivity.this, MH_NhapDiemTheoLop.class);
        intent.putExtra("txttenlop", tenlop);
        intent.putExtra("txtmonhoc", tenmonhoc);
        intent.putExtra("txthocky", hocky);
        intent.putExtra("txtnamhoc", namhoc);
        intent.putExtra("txtloaidiem", loaidiem);
        startActivity(intent);

        //Toast.makeText(this, tenlop + " " + tenmonhoc, Toast.LENGTH_SHORT).show();
    }
}