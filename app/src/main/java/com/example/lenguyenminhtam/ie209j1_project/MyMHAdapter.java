package com.example.lenguyenminhtam.ie209j1_project;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyMHAdapter  extends RecyclerView.Adapter<MyMHAdapter.ViewHolder> {

    private ArrayAdapter<FaceMonHoc> mListFaceMH;
    private Context context;


    ///Add Diaglog

    //ListView lvMonHoc;
    //ArrayList<FaceMonHoc> arrEmployee=new ArrayList<FaceMonHoc>();
    //ArrayAdapter<FaceMonHoc> adapter=null;
    //Khai báo 1 FaceMonHoc object
    FaceMonHoc monhoc=null;




    ///end diaglog

    ///End Dialog

    public MyMHAdapter() {}

    public MyMHAdapter(ArrayAdapter<FaceMonHoc> mListFaceMH, Context context) {
        this.mListFaceMH = mListFaceMH;
        this.context = context;
    }


    @NonNull
    @Override
    public MyMHAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_monhoc_setting, viewGroup, false);//null);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyMHAdapter.ViewHolder viewHolder, int i) {
        //FaceMonHoc face_monHoc = mListFaceMH.get(i);
        viewHolder.tvMonHoc.setText("" + mListFaceMH.getItem(viewHolder.getAdapterPosition()).getTenMonHoc());
        viewHolder.imgbtn_doitenmh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dlg_doitenmh = new Dialog(view.getContext());
                dlg_doitenmh.setContentView(R.layout.dialog_doitenmh);
                Button btn_doitenlop = dlg_doitenmh.findViewById(R.id.btnDoiTenMH);
                EditText edt_tenlopmoi = dlg_doitenmh.findViewById(R.id.edt_TenMHMoi);
                btn_doitenlop.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        viewHolder.tvMonHoc.setText("Toán học");
                    }
                });
                dlg_doitenmh.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mListFaceMH.getCount();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView tvMonHoc;
        Button imgbtn_doitenmh;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMonHoc = itemView.findViewById(R.id.tv_MonHoc);
            imgbtn_doitenmh = itemView.findViewById(R.id.img_btn_doitenmh);
        }
    }
}
