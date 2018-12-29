package com.example.lenguyenminhtam.ie209j1_project;

import android.app.DatePickerDialog;
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
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class ThemHocSinhActivity extends AppCompatActivity {
    EditText txt_nhaphoten;
    //private ImageView imageView;
    //private ViewPager vp;
    RadioGroup rdo_gioitinh;
    RadioButton rdo_nam;
    RadioButton rdo_nu;
    EditText txt_nhapngaysinh;

    EditText txt_nhapemail;
    EditText txt_nhapdiachi;
    Calendar c;
    DatePickerDialog dpd_ngaysinh;
    Button btn_themhs;
    //Context context;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themhocsinh);


        ////DO add somthing.....

        txt_nhaphoten = findViewById(R.id.txt_nhaphoten);
        txt_nhapngaysinh = findViewById(R.id.txt_nhapngaysinh);
        rdo_gioitinh=findViewById(R.id.rdo_gioitinh);
        rdo_nam=findViewById(R.id.rdo_nam);
        rdo_nu=findViewById(R.id.rdo_nu);
        txt_nhapemail = findViewById(R.id.txt_nhapemail);
        txt_nhapdiachi = findViewById(R.id.txt_nhapdiachi);


        btn_themhs =  findViewById(R.id.btn_themhs);
        btn_themhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txt_nhaphoten.getText().toString() !="" && txt_nhapdiachi.getText().toString()!="" && txt_nhapemail.getText().toString()!="" && txt_nhapngaysinh.getText().toString()!="")
                navigateToChonLop();
               // else Toast.makeText(context,"Bạn phải điền đầy đủ", Toast.LENGTH_LONG);
            }
        });
        txt_nhapngaysinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                c = Calendar.getInstance();
                int day = c.get(Calendar.DAY_OF_MONTH);
                int month = c.get(Calendar.MONTH);
                int year = c.get(Calendar.YEAR);
                dpd_ngaysinh = new DatePickerDialog(ThemHocSinhActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int mYear, int mMonth, int mDay) {
                        txt_nhapngaysinh.setText(mDay + "/" + (mMonth+1) + "/" + mYear );
                    }
                }, day, month, year);
                dpd_ngaysinh.getDatePicker().setMinDate(2200);
                dpd_ngaysinh.show();
            }
        });

        ////BottomNav
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
                        Intent intent0 = new Intent(ThemHocSinhActivity.this, MH_DanhSachLop.class);
                        startActivity(intent0);
                        break;

                    case R.id.nav_themsv:


                        break;

                    case R.id.nav_nhapdiem:
                        Intent intent2 = new Intent(ThemHocSinhActivity.this, NhapDiemActivity.class);
                        startActivity(intent2);
                        break;

                    case R.id.nav_baocao:
                        Intent intent3 = new Intent(ThemHocSinhActivity.this, BaoCaoActivity.class);
                        startActivity(intent3);
                        break;

                    case R.id.nav_setting:
                        Intent intent4 = new Intent(ThemHocSinhActivity.this, SettingActivity.class);
                        startActivity(intent4);
                        break;
                }

                return false;
            }
        });
    }
    public void navigateToChonLop(){
        String txt_gioitinh="";
        String txt_hoten=txt_nhaphoten.getText().toString();
        String txt_ngaysinh=txt_nhapngaysinh.getText().toString();
        String txt_email=txt_nhapemail.getText().toString();
        String txt_diachi=txt_nhapdiachi.getText().toString();


        if (rdo_gioitinh.isSelected()==true){
            if (rdo_gioitinh.getCheckedRadioButtonId()==R.id.rdo_nam){
                txt_gioitinh="Nam";
            }
            else txt_gioitinh="Nữ";
        }
        Intent intent = new Intent(ThemHocSinhActivity.this, MH_ChonLop.class);
        intent.putExtra("txt_themhs_hoten",txt_hoten);
        intent.putExtra("txt_themhs_ngaysinh",txt_ngaysinh);
        intent.putExtra("txt_themhs_email",txt_email);
        intent.putExtra("txt_themhs_diachi",txt_diachi);
        intent.putExtra("txt_themhs_gioitinh",txt_gioitinh);
        ThemHocSinhActivity.this.startActivity(intent);

    }

}
