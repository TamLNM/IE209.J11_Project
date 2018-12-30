package com.example.lenguyenminhtam.ie209j1_project;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.text.BreakIterator;
import java.util.List;
import java.util.Random;

public class BaoCaoMonHocAdapter extends RecyclerView.Adapter<BaoCaoMonHocAdapter.ViewHolder>
{
    private ArrayAdapter<FaceThem> mListFace;
    private Context    context;

    Dialog myClassInfoDialog;

    // Constructer
    public BaoCaoMonHocAdapter() {

    }

    public BaoCaoMonHocAdapter(ArrayAdapter<FaceThem> listFace, Context context) {
        this.mListFace = listFace;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_baocaomon, viewGroup, false);//null);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int i) {
        //FaceThem face = mListFace.getItem(i);
        DatabaseHocSinhHelper db=new DatabaseHocSinhHelper(context);
        Random random = new Random();
        viewHolder.tvTenLop.setText(mListFace.getItem(viewHolder.getAdapterPosition()).getTenLop());
        String tenlop = viewHolder.tvTenLop.getText().toString();
        //String tenlop = "10A";
        viewHolder.tvSiSo.setText("" + mListFace.getItem(viewHolder.getAdapterPosition()).getSiSo());


        int soluongdat = random.nextInt(15-1)+1;
        viewHolder.tvSoLuongDat.setText("" + String.valueOf(soluongdat));
        float tyledat = ((float)soluongdat / (float)db.getSiSoHienTai(tenlop))*100;
        viewHolder.tvTyLeDat.setText("" + tyledat + "%");

        // Init child dialog (detail class info)
        myClassInfoDialog = new Dialog(context);
        myClassInfoDialog.setContentView(R.layout.item_class_detail);

        TextView tv_tenlop_detailscreen  = myClassInfoDialog.findViewById(R.id.tv_tenlop_detailscreen);
        TextView tv_siso_detailscreen    = myClassInfoDialog.findViewById(R.id.tv_siso_detailscreen);
        TextView tv_sisonam_detailscreen = myClassInfoDialog.findViewById(R.id.tv_sisonam_detailscreen);
        TextView tv_sisonu_detailscreen  = myClassInfoDialog.findViewById(R.id.tv_sisonu_detailscreen);
        tv_tenlop_detailscreen.setText(mListFace.getItem(viewHolder.getAdapterPosition()).getTenLop());
        tv_siso_detailscreen.setText("Sỉ số: "+ mListFace.getItem(viewHolder.getAdapterPosition()).getSiSo());


        // Set event reclycler view onClick()
        viewHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                //myClassInfoDialog.show();

                Button btnBangDiemLop = myClassInfoDialog.findViewById(R.id.btn_xembangdiem);
            }
        });




    }

    @Override
    public int getItemCount() {
        return mListFace.getCount();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener, View.OnLongClickListener
    {

        TextView tvTenLop, tvSiSo  , tvSoLuongDat, tvTyLeDat;
        TextView tenhocky;
        private ItemClickListener itemClickListener;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tenhocky = itemView.findViewById(R.id.edit_TenHocKy);
            tvTenLop    = itemView.findViewById(R.id.tv_tenlop);
            tvSiSo      = itemView.findViewById(R.id.tv_siso);
            tvSoLuongDat = itemView.findViewById(R.id.tv_soluongdat);
            tvTyLeDat = itemView.findViewById(R.id.tv_tyledat);

            // On recycler item click
            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);
            //
        }

        public void setItemClickListener(ItemClickListener itemClickListener)
        {
            this.itemClickListener = itemClickListener;
        }

        @Override
        public void onClick(View v) {
            itemClickListener.onClick(v, getAdapterPosition(), false);
        }

        @Override
        public boolean onLongClick(View v) {
            itemClickListener.onClick(v, getAdapterPosition(), true);
            return true;
        }
    }

}
