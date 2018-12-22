package com.example.lenguyenminhtam.ie209j1_project;

import android.app.Dialog;
import android.content.Context;
import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class DanhSachLopAdapter extends RecyclerView.Adapter<DanhSachLopAdapter.MyViewHolder>{
    Context mContext;
    ArrayAdapter<HocSinh> mData;
    Dialog myDialog;
    Cursor hscursor;
    public DanhSachLopAdapter(Context mContext, ArrayAdapter<HocSinh> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }
    public DanhSachLopAdapter(Context mContext, Cursor mCursor){
        this.mContext=mContext;
        this.hscursor=mCursor;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        //myDialog=new Dialog(mContext);
        //myDialog.setContentView(R.layout.fragment_data_student);
        //myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.R.color.transparent));

        view=LayoutInflater.from(mContext).inflate(R.layout.item_danhsachlop,viewGroup,false);
        final MyViewHolder viewHolder = new MyViewHolder(view);





        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {


        myViewHolder.tv_mshs.setText(mData.getItem(i).getMshs());
        myViewHolder.tv_hoten.setText(mData.getItem(i).getHoten());
        myViewHolder.tv_ngaysinh.setText(mData.getItem(i).getNgaysinh());
        myViewHolder.tv_gioitinh.setText(mData.getItem(i).getGioitinh());
        myViewHolder.tv_diachi.setText(mData.getItem(i).getDiachi());

        //myViewHolder.iv_avatar.setImageResource(mData.get(i).getAvatar());
        if (myViewHolder.tv_gioitinh.getText().toString().equals("Nam")){
            myViewHolder.iv_gioitinh.setImageResource(R.drawable.ic_masculine);
            myViewHolder.iv_avatar.setImageResource(R.drawable.if_male3_403019);
        }
        if (myViewHolder.tv_gioitinh.getText().toString().equals("Nữ")){
            myViewHolder.iv_gioitinh.setImageResource(R.drawable.ic_femenine);
            myViewHolder.iv_avatar.setImageResource(R.drawable.if_female1_403023);
        }

    }

    @Override
    public int getItemCount() {
        return mData.getCount();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_mshs;
        private TextView tv_hoten;
        private TextView tv_gioitinh;
        private TextView tv_diachi;
        private TextView tv_ngaysinh;


        private ImageView iv_avatar;
        private ImageView iv_gioitinh;

        private RelativeLayout item_dshs;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            item_dshs=(RelativeLayout)itemView.findViewById(R.id.item_danhsachlop);
            tv_mshs=(TextView)itemView.findViewById(R.id.txt_mshs_ds);
            tv_hoten=(TextView)itemView.findViewById(R.id.txt_tenhs_ds);
            tv_diachi=(TextView)itemView.findViewById(R.id.txt_diachi_ds);
            tv_gioitinh=(TextView)itemView.findViewById(R.id.txt_gioitinh_ds);
            tv_ngaysinh=(TextView)itemView.findViewById(R.id.txt_ngaysinh_ds);
            iv_avatar=(ImageView)itemView.findViewById(R.id.img_hs_ds);
            iv_gioitinh=(ImageView)itemView.findViewById(R.id.img_gioitinh_ds);


        }
    }
}
