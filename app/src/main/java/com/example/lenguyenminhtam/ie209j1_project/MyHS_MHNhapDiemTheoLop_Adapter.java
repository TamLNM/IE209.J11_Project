package com.example.lenguyenminhtam.ie209j1_project;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyHS_MHNhapDiemTheoLop_Adapter extends RecyclerView.Adapter<MyHS_MHNhapDiemTheoLop_Adapter.ViewHolder>  {
    private List<FaceHS_MHNhapDiemTheoLop> mListFaceL;
    private Context context;

    public MyHS_MHNhapDiemTheoLop_Adapter(){}

    public MyHS_MHNhapDiemTheoLop_Adapter(List<FaceHS_MHNhapDiemTheoLop> mListFaceL, Context context){
        this.mListFaceL = mListFaceL;
        this.context = context;
    }
    @NonNull
    @Override
    public MyHS_MHNhapDiemTheoLop_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_hocsinh_mhnhapdiemtheolop, viewGroup, false);//null);
        return new MyHS_MHNhapDiemTheoLop_Adapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHS_MHNhapDiemTheoLop_Adapter.ViewHolder viewHolder, int i) {
        FaceHS_MHNhapDiemTheoLop faceHS = mListFaceL.get(i);
        viewHolder.tvMSHS.setText("" + faceHS.getMSHS());
        viewHolder.tvHoTenHS.setText("" + faceHS.getHoTenHS());
        viewHolder.tvSTT.setText("" + faceHS.getSTT());
    }

    @Override
    public int getItemCount() {
        return mListFaceL.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView tvMSHS;
        TextView tvHoTenHS;
        TextView tvSTT;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvSTT = itemView.findViewById(R.id.tv_STT);
            tvMSHS = itemView.findViewById(R.id.tv_MSHS);
            tvHoTenHS = itemView.findViewById(R.id.tv_HoTenHS);
        }
    }
}
