package com.example.lenguyenminhtam.ie209j1_project;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyMHAdapter  extends RecyclerView.Adapter<MyMHAdapter.ViewHolder> {

    private List<FaceMonHoc> mListFaceMH;
    private Context context;


    ///Add Diaglog

    ListView lvMonHoc;
    ArrayList<FaceMonHoc> arrEmployee=new ArrayList<FaceMonHoc>();
    ArrayAdapter<FaceMonHoc> adapter=null;
    //Khai báo 1 FaceMonHoc object
    FaceMonHoc monhoc=null;




    ///end diaglog

    ///End Dialog

    public MyMHAdapter() {}

    public MyMHAdapter(List<FaceMonHoc> mListFaceMH, Context context) {
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
    public void onBindViewHolder(@NonNull MyMHAdapter.ViewHolder viewHolder, int i) {
        FaceMonHoc face_monHoc = mListFaceMH.get(i);
        viewHolder.tvMonHoc.setText("" + face_monHoc.getTenMonHoc());
    }

    @Override
    public int getItemCount() {
        return mListFaceMH.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView tvMonHoc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMonHoc = itemView.findViewById(R.id.tv_MonHoc);
        }
    }
}
