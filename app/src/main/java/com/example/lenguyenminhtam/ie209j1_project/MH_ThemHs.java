package com.example.lenguyenminhtam.ie209j1_project;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.Calendar;

public class MH_ThemHs extends AppCompatActivity {
    //private LinearLayout linearLayout;
    private EditText txt_nhaphoten;
//private ImageView imageView;

    private RadioButton rdo_nam;
    private RadioButton rdo_nu;
    private EditText txt_nhapngaysinh;

    private EditText txt_nhapemail;
    private EditText txt_nhapdiachi;
    private Calendar c;
    private DatePickerDialog dpd_ngaysinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_nhaphoten = (EditText)findViewById(R.id.txt_nhaphoten);
        txt_nhapngaysinh = (EditText)findViewById(R.id.txt_nhapngaysinh);
        rdo_nam = (RadioButton)findViewById(R.id.rdo_nam);
        rdo_nu = (RadioButton)findViewById(R.id.rdo_nu);
        txt_nhapemail = (EditText)findViewById(R.id.txt_nhapemail);
        txt_nhapdiachi = (EditText)findViewById(R.id.txt_nhapdiachi);
        txt_nhapngaysinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c = Calendar.getInstance();
                int day = c.get(Calendar.DAY_OF_MONTH);
                int month = c.get(Calendar.MONTH);
                int year = c.get(Calendar.YEAR);
                dpd_ngaysinh = new DatePickerDialog(MH_ThemHs.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int mYear, int mMonth, int mDay) {
                        txt_nhapngaysinh.setText(mDay + "/" + (mMonth+1) + "/" + mYear );
                    }
                }, day, month, year);
                dpd_ngaysinh.show();
            }
        });
    }
}
