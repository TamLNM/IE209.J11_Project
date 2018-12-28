package com.example.lenguyenminhtam.ie209j1_project;

import android.app.Activity;
import android.app.Dialog;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.Fragment;

import org.w3c.dom.Text;

import java.util.List;

import static android.icu.lang.UScript.COMMON;

public class FaceAdapter extends RecyclerView.Adapter<FaceAdapter.ViewHolder>
{
    private ArrayAdapter<FaceThem> mListFace;
    private Context    context;

    Dialog myClassInfoDialog;
Activity activity;
    // Constructer
    public FaceAdapter() {

    }

    public FaceAdapter(ArrayAdapter<FaceThem> listFace, Context context) {
        this.mListFace = listFace;
        this.context = context;
    }
    public void onAttach(Activity activity){
        this.activity = activity;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_lop, viewGroup, false);//null);

        final FaceAdapter.ViewHolder viewHolder = new FaceAdapter.ViewHolder(itemView);



        // Set event reclycler view onClick()
        viewHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                DatabaseHocSinhHelper db=new DatabaseHocSinhHelper(context);
                myClassInfoDialog = new Dialog(context);
                myClassInfoDialog.setContentView(R.layout.item_class_detail);
                final TextView tv_tenlop_detailscreen  = myClassInfoDialog.findViewById(R.id.tv_tenlop_detailscreen);
                TextView tv_siso_detailscreen    = myClassInfoDialog.findViewById(R.id.tv_siso_detailscreen);
                TextView tv_sisonam_detailscreen = myClassInfoDialog.findViewById(R.id.tv_sisonam_detailscreen);
                TextView tv_sisonu_detailscreen  = myClassInfoDialog.findViewById(R.id.tv_sisonu_detailscreen);
                tv_tenlop_detailscreen.setText(mListFace.getItem(viewHolder.getAdapterPosition()).getTenLop());
                tv_siso_detailscreen.setText("Sỉ số: "+ mListFace.getItem(viewHolder.getAdapterPosition()).getSiSo());
                int sisonam=db.getSiSoNam(viewHolder.tvTenLop.getText().toString());
                int sisonu=db.getSiSoNu(viewHolder.tvTenLop.getText().toString());
                tv_sisonam_detailscreen.setText("Nam: "+ String.valueOf(sisonam));
                tv_sisonu_detailscreen.setText("Nữ: "+ String.valueOf(sisonu));
                myClassInfoDialog.show();

                final String malop=mListFace.getItem(viewHolder.getAdapterPosition()).getMaLop();
                Button btn_xemdanhsachlop = myClassInfoDialog.findViewById(R.id.btn_xemdanhsachlop);
                Button btn_xembangdiemlop = myClassInfoDialog.findViewById(R.id.btn_xembangdiemlop);
                btn_xemdanhsachlop.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(context,XemDanhSachLopActivity.class);
                        //String key_lop=tv_tenlop_detailscreen.getText().toString();
                        Bundle bundle = intent.getExtras();
                       // Fragment f= new Fragment_DanhSachLop();
                        //f.setArguments(bundle);
                        //bundle.putString("tenlop",tv_tenlop_detailscreen.getText().toString());
                        if (bundle !=null)
                        {//String malop=mListFace.getItem(viewHolder.getAdapterPosition()).getMaLop();
                            intent.putExtra("malop", malop);}


                        context.startActivity(intent);
                    }
                });
                btn_xembangdiemlop.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(context,XemBangDiemLopActivity.class);
                        Bundle bundle = intent.getExtras();
                        if (bundle !=null)
                        {String malop1=mListFace.getItem(viewHolder.getAdapterPosition()).getMaLop();
                            intent.putExtra("malop1", malop1);}
                        context.startActivity(intent);
                        //myClassInfoDialog.dismiss();
                    }
                });

            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int i) {
        //FaceThem face = mListFace.getItem(i);
        DatabaseHocSinhHelper db=new DatabaseHocSinhHelper(context);

        viewHolder.tvTenLop.setText(mListFace.getItem(viewHolder.getAdapterPosition()).getTenLop());
        int sisonam=db.getSiSoNam(viewHolder.tvTenLop.getText().toString());
        int sisonu=db.getSiSoNu(viewHolder.tvTenLop.getText().toString());
        viewHolder.tvSiSo.setText("" + mListFace.getItem(viewHolder.getAdapterPosition()).getSiSo());
        viewHolder.tvSiSoNam.setText("" + String.valueOf(sisonam));
        viewHolder.tvSiSoNu.setText("" + String.valueOf(sisonu));

        // Init child dialog (detail class info)

    }


    @Override
    public int getItemCount() {
        return mListFace.getCount();
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
