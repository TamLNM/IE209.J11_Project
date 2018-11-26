package com.example.lenguyenminhtam.ie209j1_project;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public class MyLAdapter  extends RecyclerView.Adapter<MyLAdapter.ViewHolder>  {
    private List<FaceLop> mListFaceL;
    private Context context;

    public MyLAdapter(){}

    public MyLAdapter(List<FaceLop> mListFaceL, Context context) {
        this.mListFaceL = mListFaceL;
        this.context = context;
    }

    @NonNull
    @Override
    public MyLAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_lop_setting, viewGroup, false);//null);
        return new MyLAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyLAdapter.ViewHolder viewHolder, int i) {
        FaceLop faceLop = mListFaceL.get(i);
        viewHolder.tvLopSetting.setText("" + faceLop.getTenLop());
    }

    @Override
    public int getItemCount() {
        return mListFaceL.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView tvLopSetting;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvLopSetting = itemView.findViewById(R.id.tv_Lop_Setting);
        }
    }
}
