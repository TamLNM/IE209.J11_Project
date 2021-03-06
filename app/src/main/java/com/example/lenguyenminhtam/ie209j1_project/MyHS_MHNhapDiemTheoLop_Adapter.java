package com.example.lenguyenminhtam.ie209j1_project;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MyHS_MHNhapDiemTheoLop_Adapter extends RecyclerView.Adapter<MyHS_MHNhapDiemTheoLop_Adapter.ViewHolder>  {
    private ArrayAdapter<HocSinh> mListFaceL;
    private Context context;

    public MyHS_MHNhapDiemTheoLop_Adapter(){}

    public MyHS_MHNhapDiemTheoLop_Adapter(ArrayAdapter<HocSinh> mListFaceL, Context context){
        this.mListFaceL = mListFaceL;
        this.context = context;
    }
    @NonNull
    @Override
    public MyHS_MHNhapDiemTheoLop_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_hocsinh_mhnhapdiemtheolop, viewGroup, false);//null);
        final ViewHolder viewHolder = new ViewHolder(itemView);
//        viewHolder.item_nhapdiemtheolop.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View view) {
//        DatabaseHocSinhHelper db =new DatabaseHocSinhHelper(context);
//        Intent intent = new Intent();
//
//
//            String tenlop = intent.getStringExtra("txttenlop");
//            String hocky = intent.getStringExtra("txthocky");
//            String namhoc = intent.getStringExtra("txtnamhoc");
//            String monhoc = intent.getStringExtra("txtmonhoc");
//            String loaidiem = intent.getStringExtra("txtloaidiem");
//            String diemso =  viewHolder.tvDiemSo.getText().toString();
//
//    }
//});
viewHolder.btn_luudiem.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
//        DatabaseHocSinhHelper db =new DatabaseHocSinhHelper(context);
//        Intent intent = new Intent();
//
//
//        String tenlop = intent.getStringExtra("txttenlop");
//        String hocky = intent.getStringExtra("txthocky");
//        String namhoc = intent.getStringExtra("txtnamhoc");
//        String monhoc = intent.getStringExtra("txtmonhoc");
//        String loaidiem = intent.getStringExtra("txtloaidiem");
//        String hoten= viewHolder.tvHoTenHS.getText().toString();
//        String mshs = viewHolder.tvMSHS.getText().toString();
//        String diemso =  viewHolder.tvDiemSo.getText().toString();

        Toast.makeText(context,"Thêm thành công", Toast.LENGTH_LONG).show();
        //db.insertchitietketqua();

    }
});
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHS_MHNhapDiemTheoLop_Adapter.ViewHolder viewHolder, int i) {
        //FaceThem faceHS = mListFaceL.get(i);
        viewHolder.tvMSHS.setText("" + mListFaceL.getItem(i).getMshs());
        viewHolder.tvHoTenHS.setText("" + mListFaceL.getItem(i).getHoten());
        viewHolder.tvSTT.setText(String.valueOf(i+1));

        //viewHolder.tvSTT.setText("" + faceHS.getSTT());
    }

    @Override
    public int getItemCount() {
        return mListFaceL.getCount();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView tvMSHS;
        TextView tvHoTenHS;
        TextView tvSTT;
        EditText tvDiemSo;
        Button btn_luudiem;
        RelativeLayout item_nhapdiemtheolop;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            btn_luudiem=itemView.findViewById(R.id.btn_Luu_MHNhapDiemTheoLop);

            tvSTT = itemView.findViewById(R.id.tv_STT);
            tvMSHS = itemView.findViewById(R.id.tv_MSHS);
            tvHoTenHS = itemView.findViewById(R.id.tv_HoTenHS);
            tvDiemSo=itemView.findViewById(R.id.tv_nhapdiemso);
            item_nhapdiemtheolop=itemView.findViewById(R.id.item_hocsinh_mhnhapdiemtheolop);
        }

    }
}
