package com.example.lenguyenminhtam.ie209j1_project;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.text.BreakIterator;
import java.util.List;

public class FaceBaoCaoAdapter extends RecyclerView.Adapter<FaceBaoCaoAdapter.ViewHolder>
{
    private List<FaceBaoCao> mListFace;
    private Context    context;

    Dialog myClassInfoDialog;

    // Constructer
    public FaceBaoCaoAdapter() {

    }

    public FaceBaoCaoAdapter(List<FaceBaoCao> listFace, Context context) {
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
        FaceBaoCao face = mListFace.get(i);
        viewHolder.tvTenLop.setText(face.getTenLop());
        viewHolder.tvSiSo.setText("" + face.getSiSo());
        viewHolder.tvSoLuongDat.setText("" + face.getSoLuongDat());
        face.TinhTyLe(face.getSiSo(),face.getSoLuongDat());
        viewHolder.tvTyLeDat.setText("" + face.getTyLeDat()+ "%");






    }

    @Override
    public int getItemCount() {
        return mListFace.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
                            implements View.OnClickListener, View.OnLongClickListener
    {

        TextView tvTenLop, tvSiSo  , tvSoLuongDat, tvTyLeDat;
        private ItemClickListener itemClickListener;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
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
