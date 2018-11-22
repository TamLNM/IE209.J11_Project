package com.example.lenguyenminhtam.ie209j1_project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MH_ThayDoiThongTinMonHoc extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mh_thaydoithongtinmonhoc);

        // Load fragment
        Fragment_MonHoc fm_monhoc = new Fragment_MonHoc();
        loadFragment(fm_monhoc);
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
