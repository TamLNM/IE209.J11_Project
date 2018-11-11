package com.example.lenguyenminhtam.ie209j1_project;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class FaceAdapter extends RecyclerView.Adapter<FaceAdapter.ViewHolder> {
    private List<Face> mListFace;

    public FaceAdapter() {}

    public FaceAdapter(List<Face> listFace) {
        this.mListFace = listFace;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_lop, viewGroup, false);//null);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Face face = mListFace.get(i);
        viewHolder.tvTenLop.setText(face.getTenLop());
        viewHolder.tvSiSo.setText("" + face.getSiSo());
        viewHolder.tvSiSoNam.setText("" + face.getSiSoNam());
        viewHolder.tvSiSoNu.setText(""+ face.getSiSoNu());
    }

    @Override
    public int getItemCount() {
        return mListFace.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvTenLop, tvSiSo  , tvSiSoNam, tvSiSoNu;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTenLop    = itemView.findViewById(R.id.tv_tenlop);
            tvSiSo      = itemView.findViewById(R.id.tv_siso);
            tvSiSoNam   = itemView.findViewById(R.id.tv_sisonam);
            tvSiSoNu    = itemView.findViewById(R.id.tv_sisonu);
        }
    }
}
