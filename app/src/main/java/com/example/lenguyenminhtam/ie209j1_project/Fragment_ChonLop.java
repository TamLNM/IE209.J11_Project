package com.example.lenguyenminhtam.ie209j1_project;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Fragment_ChonLop extends AppCompatActivity {
    private View mRootView;

    public ArrayList<FaceThem> mListFace;
    public RecyclerView mRrvFace;

    public void onCreate (@NonNull LayoutInflater inflater,@Nullable ViewGroup container,@Nullable Bundle savedInstanceState)  {
        Intent intent = getIntent();
        super.onCreate(savedInstanceState);
        mRootView = inflater.inflate(R.layout.fragment_chonlop, container, false);
        setContentView(mRootView);
        mListFace=new ArrayList<>();
        mListFace.add(new FaceThem("10A1", 100, 20, 75,95 ));
        mListFace.add(new FaceThem("10A2", 100, 80, 20,100));
        mrvface();

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_home:
                        Intent intent0 = new Intent(Fragment_ChonLop.this, MH_DanhSachLop.class);
                        startActivity(intent0);
                        break;

                    case R.id.nav_themsv:


                        break;

                    case R.id.nav_nhapdiem:
                        Intent intent2 = new Intent(Fragment_ChonLop.this, NhapDiemActivity.class);
                        startActivity(intent2);
                        break;

                    case R.id.nav_baocao:
                        Intent intent3 = new Intent(Fragment_ChonLop.this, BaoCaoActivity.class);
                        startActivity(intent3);
                        break;

                    case R.id.nav_setting:
                        Intent intent4 = new Intent(Fragment_ChonLop.this, SettingActivity.class);
                        startActivity(intent4);
                        break;
                }

                return false;
            }
        });
    }
    public Fragment_ChonLop(){}
public void mrvface(){
    mRrvFace = mRootView.findViewById(R.id.rv_ChonLop);
    mRrvFace.setHasFixedSize(true);
    ThemHsAdapter mAdapter = new ThemHsAdapter(mListFace, this);

    mRrvFace.setAdapter(mAdapter);
    mRrvFace.setLayoutManager(new LinearLayoutManager(this));
}
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
            View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_chonlop, viewGroup, false);//null);
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
            viewHolder.tv_siso.setText(String.valueOf(mListFace.get(i).getSiSo()));
            viewHolder.tv_sisohientai.setText(String.valueOf(mListFace.get(i).getSiSoHienTai()));

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
            LinearLayout item_chonlop;

            private ItemClickListener itemClickListener;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                item_chonlop=itemView.findViewById(R.id.item_chonlop);
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

//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        mRootView = inflater.inflate(R.layout.fragment_chonlop, container, false);
//
//        // Create recycler view
//        mRrvFace = mRootView.findViewById(R.id.rv_ChonLop);
//        //item_chonlop=(LinearLayout)mRootView.findViewById(R.id.item_chonlop);
//       //mRrvFace.setHasFixedSize(true);
//
//
//        // Add data to recyclerView
//
//
//
//
//        // Create adapter
//
//        //mRrvFace.setItemAnimator(new DefaultItemAnimator());
//        return mRootView;//super.onCreateView(inflater, container, savedInstanceState); //
//    }

}
