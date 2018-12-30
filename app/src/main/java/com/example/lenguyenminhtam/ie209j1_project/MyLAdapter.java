package com.example.lenguyenminhtam.ie209j1_project;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Button;
import java.util.List;

public class MyLAdapter  extends RecyclerView.Adapter<MyLAdapter.ViewHolder>  {
    private ArrayAdapter<FaceThem> mListFaceL;
    private Context context;

    public MyLAdapter(){}

    public MyLAdapter(ArrayAdapter<FaceThem> mListFaceL, Context context) {
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
    public void onBindViewHolder(@NonNull final MyLAdapter.ViewHolder viewHolder, int i) {
        //FaceLop faceLop = mListFaceL.get(i);
        viewHolder.tvLopSetting.setText("" + mListFaceL.getItem(viewHolder.getAdapterPosition()).getTenLop());
        viewHolder.img_btn_renamelop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dlg_doitenlop = new Dialog(view.getContext());
                dlg_doitenlop.setContentView(R.layout.dialog_doitenlop);
                Button btn_doitenlop = dlg_doitenlop.findViewById(R.id.btnDoiTenLop);
                EditText edt_tenlopmoi = dlg_doitenlop.findViewById(R.id.edt_TenLopMoi);
                btn_doitenlop.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        viewHolder.tvLopSetting.setText("10A Siêu nhân");
                    }
                });
                dlg_doitenlop.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mListFaceL.getCount();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView tvLopSetting;
        Button img_btn_renamelop;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvLopSetting = itemView.findViewById(R.id.tv_Lop_Setting);
            img_btn_renamelop = itemView.findViewById(R.id.img_btn_renamelop);
        }
    }
}
