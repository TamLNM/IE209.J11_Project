package com.example.lenguyenminhtam.ie209j1_project;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class HocSinhAdapter extends RecyclerView.Adapter<HocSinhAdapter.MyViewHolder>{
    Context mContext;
    List<HocSinh> mData;
    Dialog myDialog;

    public HocSinhAdapter(Context mContext, List<HocSinh> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        myDialog=new Dialog(mContext);
        myDialog.setContentView(R.layout.fragment_data_student);
        //myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.R.color.transparent));

        view=LayoutInflater.from(mContext).inflate(R.layout.item_dshs,viewGroup,false);
        final MyViewHolder viewHolder = new MyViewHolder(view);




        viewHolder.item_dshs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView img_hs1=(ImageView)myDialog.findViewById(R.id.img_hs1);
                TextView txt_hoten1=(TextView)myDialog.findViewById(R.id.txt_tenhs1);
                TextView txt_lop=(TextView) myDialog.findViewById(R.id.txt_lop);
                TextView txt_ngaysinh=(TextView) myDialog.findViewById(R.id.txt_ngaysinh);
                TextView txt_gioitinh=(TextView) myDialog.findViewById(R.id.txt_gioitinh);
                TextView txt_diachi=(TextView) myDialog.findViewById(R.id.txt_diachi);
                TextView txt_email=(TextView) myDialog.findViewById(R.id.txt_email);
                Button btn_xembangdiem=(Button)myDialog.findViewById(R.id.btn_xembangdiem);

                //img_hs1.setImageResource(mData.get(viewHolder.getAdapterPosition()).getAvatar());
                txt_hoten1.setText(mData.get(viewHolder.getAdapterPosition()).getHoten());
                txt_lop.setText(mData.get(viewHolder.getAdapterPosition()).getLop());
                txt_gioitinh.setText(mData.get(viewHolder.getAdapterPosition()).getGioitinh());
                txt_diachi.setText(mData.get(viewHolder.getAdapterPosition()).getDiachi());
                txt_email.setText(mData.get(viewHolder.getAdapterPosition()).getEmail());
                txt_ngaysinh.setText(mData.get(viewHolder.getAdapterPosition()).getNgaysinh());
                myDialog.show();
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.tv_mshs.setText(mData.get(i).getMshs());
        myViewHolder.tv_hoten.setText(mData.get(i).getHoten());
        myViewHolder.tv_ngaysinh.setText(mData.get(i).getNgaysinh());
        myViewHolder.tv_gioitinh.setText(mData.get(i).getGioitinh());
        myViewHolder.tv_diachi.setText(mData.get(i).getDiachi());

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
        return mData.size();
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

            item_dshs=(RelativeLayout)itemView.findViewById(R.id.item_dshs);
            tv_mshs=(TextView)itemView.findViewById(R.id.txt_mshs);
            tv_hoten=(TextView)itemView.findViewById(R.id.txt_tenhs);
            tv_diachi=(TextView)itemView.findViewById(R.id.txt_diachi);
            tv_gioitinh=(TextView)itemView.findViewById(R.id.txt_gioitinh);
            tv_ngaysinh=(TextView)itemView.findViewById(R.id.txt_ngaysinh);
            iv_avatar=(ImageView)itemView.findViewById(R.id.img_hs);
            iv_gioitinh=(ImageView)itemView.findViewById(R.id.img_gioitinh);


        }
    }
}
