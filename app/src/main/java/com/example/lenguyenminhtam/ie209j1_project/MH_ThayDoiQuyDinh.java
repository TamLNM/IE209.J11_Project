package com.example.lenguyenminhtam.ie209j1_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.lenguyenminhtam.ie209j1_project.R;

public class MH_ThayDoiQuyDinh extends AppCompatActivity
{
    Button btn_ThayDoiThongTinMonHoc;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mh_thaydoiquydinh);

        btn_ThayDoiThongTinMonHoc = findViewById(R.id.btn_ThayDoiThongTinMonHoc);
        btn_ThayDoiThongTinMonHoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initView();
            }
        });
    }

    protected void initView() {
        Intent intent = new Intent(this, MH_ThayDoiThongTinMonHoc.class);
        startActivity(intent);
    }
}
