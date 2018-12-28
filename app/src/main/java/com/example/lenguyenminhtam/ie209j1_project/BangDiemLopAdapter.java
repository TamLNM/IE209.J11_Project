package com.example.lenguyenminhtam.ie209j1_project;

import android.app.Dialog;
import android.content.Context;
import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
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

public class BangDiemLopAdapter extends RecyclerView.Adapter<BangDiemLopAdapter.MyViewHolder>{
    private Context mContext;
    private ArrayAdapter<ketquahoctap> mData;
    Dialog myDialog;

    public BangDiemLopAdapter(Context mContext, ArrayAdapter<ketquahoctap> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        //myDialog=new Dialog(mContext);
        //myDialog.setContentView(R.layout.fragment_data_student);
        //myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.R.color.transparent));
        view=LayoutInflater.from(mContext).inflate(R.layout.item_danhsachdiem,viewGroup,false);
        final MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.tv_bangdiem_mshs.setText(mData.getItem(i).getMSHS());
        myViewHolder.tv_bangdiem_hocky.setText(mData.getItem(i).getHocKy());
        myViewHolder.tv_bangdiem_namhoc.setText(mData.getItem(i).getNamHoc());
        myViewHolder.tv_bangdiem_tbcacmon.setText(mData.getItem(i).getTBCacMon());


        //myViewHolder.iv_avatar.setImageResource(mData.get(i).getAvatar());


    }

    @Override
    public int getItemCount() {
        //Log.d("tag", "Trying to get count on line 50 class Test");

        return mData.getCount();

    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_bangdiem_mshs;
        private TextView tv_bangdiem_hocky;
        private TextView tv_bangdiem_namhoc;
        private TextView tv_bangdiem_tbcacmon;




        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            tv_bangdiem_mshs=(TextView)itemView.findViewById(R.id.tv_bangdiem_mshs);
            tv_bangdiem_hocky=(TextView)itemView.findViewById(R.id.tv_bangdiem_hocky);
            tv_bangdiem_namhoc=(TextView)itemView.findViewById(R.id.tv_bangdiem_namhoc);
            tv_bangdiem_tbcacmon=(TextView)itemView.findViewById(R.id.tv_bangdiem_tbcacmon);



        }
    }
}
