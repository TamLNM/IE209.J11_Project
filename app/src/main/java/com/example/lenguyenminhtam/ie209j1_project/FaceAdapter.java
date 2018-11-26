package com.example.lenguyenminhtam.ie209j1_project;

import android.app.Dialog;
import android.content.ClipData;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

public class FaceAdapter extends RecyclerView.Adapter<FaceAdapter.ViewHolder>
{
    private List<Face> mListFace;
    private Context    context;

    Dialog myClassInfoDialog;

    // Constructer
    public FaceAdapter() {

    }

    public FaceAdapter(List<Face> listFace, Context context) {
        this.mListFace = listFace;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_lop, viewGroup, false);//null);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int i) {
        Face face = mListFace.get(i);
        viewHolder.tvTenLop.setText(face.getTenLop());
        viewHolder.tvSiSo.setText("" + face.getSiSo());
        viewHolder.tvSiSoNam.setText("" + face.getSiSoNam());
        viewHolder.tvSiSoNu.setText("" + face.getSiSoNu());

        // Init child dialog (detail class info)
        myClassInfoDialog = new Dialog(context);
        myClassInfoDialog.setContentView(R.layout.item_class_detail);

        TextView tv_tenlop_detailscreen  = myClassInfoDialog.findViewById(R.id.tv_tenlop_detailscreen);
        TextView tv_siso_detailscreen    = myClassInfoDialog.findViewById(R.id.tv_siso_detailscreen);
        TextView tv_sisonam_detailscreen = myClassInfoDialog.findViewById(R.id.tv_sisonam_detailscreen);
        TextView tv_sisonu_detailscreen  = myClassInfoDialog.findViewById(R.id.tv_sisonu_detailscreen);
        tv_tenlop_detailscreen.setText(face.getTenLop());
        tv_siso_detailscreen.setText("Sỉ số: "+ face.getSiSo());
        tv_sisonam_detailscreen.setText("Nam: "+ face.getSiSoNam());
        tv_sisonu_detailscreen.setText("Nữ: "+ face.getSiSoNu());

        // Set event reclycler view onClick()
        viewHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                myClassInfoDialog.show();

                Button btnOK = myClassInfoDialog.findViewById(R.id.btn_xembangdiem);

            }
        });
    }

    @Override
    public int getItemCount() {
        return mListFace.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
                            implements View.OnClickListener, View.OnLongClickListener
    {
        TextView tvTenLop, tvSiSo  , tvSiSoNam, tvSiSoNu;
        private ItemClickListener itemClickListener;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTenLop    = itemView.findViewById(R.id.tv_tenlop);
            tvSiSo      = itemView.findViewById(R.id.tv_siso);
            tvSiSoNam   = itemView.findViewById(R.id.tv_sisonam);
            tvSiSoNu    = itemView.findViewById(R.id.tv_sisonu);

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
