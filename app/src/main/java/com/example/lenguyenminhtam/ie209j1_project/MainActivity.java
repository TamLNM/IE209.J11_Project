package com.example.lenguyenminhtam.ie209j1_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btn_DangNhap);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToDanhSachLop();
            }
        });

    }

    public void navigateToDanhSachLop(){
        Intent intent = new Intent(this, MH_DanhSachLop.class);
        startActivity(intent);
    }
}
