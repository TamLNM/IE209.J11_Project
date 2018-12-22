package com.example.lenguyenminhtam.ie209j1_project;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ThemHsAdapter extends RecyclerView.Adapter<ThemHsAdapter.ViewHolder> {
    Context context;
    ArrayAdapter<FaceThem> mListFace1;

    Dialog myClassInfoDialog;

    // Constructer
    public ThemHsAdapter() {

    }

    public ThemHsAdapter(ArrayAdapter<FaceThem> listFace, Context context) {
        this.mListFace1 = listFace;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView;


        itemView=LayoutInflater.from(context).inflate(R.layout.item_chonlop, viewGroup, false);
        final ViewHolder viewHolder = new ViewHolder(itemView);

       viewHolder.item_chonlop.setOnClickListener(new View.OnClickListener(){
  @Override
     public void onClick(View view) {
//            LinearLayout item_chonlop = myClassInfoDialog.findViewById(R.id.item_chonlop);
            DatabaseHocSinhHelper db=new DatabaseHocSinhHelper(context);
            myClassInfoDialog=new Dialog(context);
            myClassInfoDialog.setContentView(R.layout.fragment_xacnhanlop);
            TextView tv_tenlop_detailscreen    = myClassInfoDialog.findViewById(R.id.tv_tenlop_xacnhan);
            TextView tv_siso_detailscreen      = myClassInfoDialog.findViewById(R.id.tv_siso_detailscreen);
            TextView tv_sisonam_detailscreen   = myClassInfoDialog.findViewById(R.id.tv_sisonam_detailscreen);
            TextView tv_sisonu_detailscreen    = myClassInfoDialog.findViewById(R.id.tv_sisonu_detailscreen);
            Button btn_dongy=myClassInfoDialog.findViewById(R.id.btn_danhsachlop);

            tv_tenlop_detailscreen.setText(mListFace1.getItem(viewHolder.getAdapterPosition()).getTenLop());
            tv_siso_detailscreen.setText("Sỉ số: "+String.valueOf(mListFace1.getItem(viewHolder.getAdapterPosition()).getSiSo()));
            int sisonam=db.getSiSoNam(viewHolder.tv_tenlop.getText().toString());
            int sisonu=db.getSiSoNu(viewHolder.tv_tenlop.getText().toString());
            tv_sisonam_detailscreen.setText("Nam: "+String.valueOf(sisonam));
            tv_sisonu_detailscreen.setText("Nữ: "+String.valueOf(sisonu));
            btn_dongy.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                myClassInfoDialog.dismiss();
               }
           });
            myClassInfoDialog.show();
       }
   });


        return viewHolder;
    }






    @Override
    public void onBindViewHolder(@NonNull final ThemHsAdapter.ViewHolder viewHolder, int i) {
        // Face face = mListFace.get(i);
        DatabaseHocSinhHelper db=new DatabaseHocSinhHelper(context);
        viewHolder.tv_tenlop.setText(mListFace1.getItem(i).getTenLop());
        viewHolder.tv_siso.setText(mListFace1.getItem(i).getSiSo());
        int sisohientai=db.getSiSoHienTai(viewHolder.tv_tenlop.getText().toString());
        viewHolder.tv_sisohientai.setText(String.valueOf(sisohientai));

        Drawable img;
        if(viewHolder.tv_siso.getText().toString().equals(viewHolder.tv_sisohientai.getText().toString())){
       viewHolder.tv_trangthai.setText(context.getResources().getString(R.string.daday));
            //img = context.getResources().getDrawable( R.drawable.ic_checked);
//viewHolder.tv_trangthai.setText("Sẵn sàng");
            //viewHolder.tv_trangthai.setCompoundDrawables( img, null, null, null );
            viewHolder.img_trangthai.setImageResource(R.drawable.ic_multiply);
           viewHolder.tv_trangthai.setTextColor(Color.parseColor("#f21d1d"));
        }
        else{
            viewHolder.img_trangthai.setImageResource(R.drawable.ic_checked);
//viewHolder.tv_trangthai.setText("Đã đầy");

        viewHolder.tv_trangthai.setText(context.getResources().getString(R.string.sansang));
            //img = context.getResources().getDrawable( R.drawable.ic_multiply);

            //viewHolder.tv_trangthai.setCompoundDrawables( img, null, null, null );

           viewHolder.tv_trangthai.setTextColor(Color.parseColor("#56bf1e"));
        }
    }

    @Override
    public int getItemCount() {
        return mListFace1.getCount();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener, View.OnLongClickListener
    {

        TextView tv_tenlop, tv_siso, tv_sisohientai, tv_trangthai;
LinearLayout item_chonlop;
ImageView img_trangthai;
        private ItemClickListener itemClickListener;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            item_chonlop=itemView.findViewById(R.id.item_chonlop);
            tv_tenlop = itemView.findViewById(R.id.tv_tenlop);
            tv_siso = itemView.findViewById(R.id.tv_siso);
            tv_sisohientai = itemView.findViewById(R.id.tv_sisohientai);
            tv_trangthai=itemView.findViewById(R.id.tv_trangthai);
            img_trangthai=itemView.findViewById(R.id.img_trangthai);
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
