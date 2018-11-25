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
    List<FaceThem> mListFace;

    Dialog myClassInfoDialog;

    // Constructer
    public ThemHsAdapter() {

    }

    public ThemHsAdapter(List<FaceThem> listFace, Context context) {
        this.mListFace = listFace;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.item_chonlop, viewGroup, false);//null);
        //myClassInfoDialog=new Dialog(context);
        // myClassInfoDialog.setContentView(R.layout.fragment_xacnhanlop);

        final ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }






    @Override
    public void onBindViewHolder(@NonNull final ThemHsAdapter.ViewHolder viewHolder, int i) {
        // Face face = mListFace.get(i);

        // viewHolder.tvTenLop.setText(mListFace.get(i).getTenLop());
        //viewHolder.tvSiSo.setText(mListFace.get(i).getSiSo());
        //viewHolder.tvSiSoHienTai.setText(mListFace.get(i).getSiSoHienTai());

//            viewHolder.item_chonlop.setOnClickListener(new View.OnClickListener(){
//        @Override
//        public void onClick(View view) {
//
//            // LinearLayout item_chonlop = myClassInfoDialog.findViewById(R.id.item_chonlop);
//            TextView tvTenLop    = myClassInfoDialog.findViewById(R.id.tv_tenlop);
//            TextView tvSiSoHienTai      = myClassInfoDialog.findViewById(R.id.tv_sisohientai);
//            TextView tvSiSo   = myClassInfoDialog.findViewById(R.id.tv_siso);
//
//            tvTenLop.setText(mListFace.get(viewHolder.getAdapterPosition()).getTenLop());
//            tvSiSo.setText(mListFace.get(viewHolder.getAdapterPosition()).getSiSo());
//            tvSiSoHienTai.setText(mListFace.get(viewHolder.getAdapterPosition()).getSiSoHienTai());
//
//            myClassInfoDialog.show();
//        }
//    });

        viewHolder.tv_tenlop.setText(mListFace.get(i).getTenLop());
        viewHolder.tv_siso.setText(mListFace.get(i).getSiSo());
        viewHolder.tv_sisohientai.setText(mListFace.get(i).getSiSoHienTai());

//        Drawable img;
//       if(viewHolder.tv_siso.getText().equals(viewHolder.tv_sisohientai.getText())){
//           viewHolder.tv_trangthai.setText("Sẵn sàng");
//           img = context.getResources().getDrawable( R.drawable.ic_checked);
//
//           viewHolder.tv_trangthai.setCompoundDrawables( img, null, null, null );
//
//           viewHolder.tv_trangthai.setTextColor(Color.parseColor("#56bf1e"));
//       }
//       else{
//
//       }


    }



    @Override
    public int getItemCount() {
        return mListFace.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener, View.OnLongClickListener
    {

        TextView tv_tenlop, tv_siso, tv_sisohientai, tv_trangthai;


        private ItemClickListener itemClickListener;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_tenlop = itemView.findViewById(R.id.tv_tenlop);
            tv_siso = itemView.findViewById(R.id.tv_siso);
            tv_sisohientai = itemView.findViewById(R.id.tv_sisohientai);
            tv_trangthai=itemView.findViewWithTag(R.id.tv_trangthai);
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
