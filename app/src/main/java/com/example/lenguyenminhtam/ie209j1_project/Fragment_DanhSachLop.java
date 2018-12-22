package com.example.lenguyenminhtam.ie209j1_project;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Fragment_DanhSachLop extends Fragment {

    private View mRootView;
    Intent intent;
    private DanhSachLopAdapter mAdapter;
    public ArrayAdapter<HocSinh> mListFace;
    public RecyclerView mRrvFace;

    public View onCreateView (@NonNull LayoutInflater inflater,@Nullable ViewGroup container,@Nullable Bundle savedInstanceState)  {
        DatabaseHocSinhHelper db=new DatabaseHocSinhHelper(getActivity());
        mRootView = inflater.inflate(R.layout.fragment_danhsachlop, container, false);

        mRrvFace=mRootView.findViewById(R.id.rv_DanhSachHocSinhLop);
        mRrvFace.setHasFixedSize(true);
        mRrvFace.setLayoutManager(new LinearLayoutManager(getActivity()));
//        Bundle bundle = this.intent.getExtras();


//        String tenlop=bundle.getString("tenlop");
//        if (tenlop=="10A")
            mListFace=new ArrayAdapter<HocSinh>(getActivity(),R.layout.item_danhsachlop,db.retrieveHocSinh("SELECT MaLop FROM lop WHERE TenLop ='10A'"));
//        if (tenlop=="10B")
//            mListFace=new ArrayAdapter<HocSinh>(getActivity(),R.layout.item_danhsachlop,db.retrieveHocSinh("SELECT MaLop FROM lop WHERE TenLop ='10B'"));
//        if (tenlop=="11A")
//            mListFace=new ArrayAdapter<HocSinh>(getActivity(),R.layout.item_danhsachlop,db.retrieveHocSinh("SELECT MaLop FROM lop WHERE TenLop ='11A'"));
//        if (tenlop=="11B")
//            mListFace=new ArrayAdapter<HocSinh>(getActivity(),R.layout.item_danhsachlop,db.retrieveHocSinh("SELECT MaLop FROM lop WHERE TenLop ='11B'"));
//        if (tenlop=="12A")
//            mListFace=new ArrayAdapter<HocSinh>(getActivity(),R.layout.item_danhsachlop,db.retrieveHocSinh("SELECT MaLop FROM lop WHERE TenLop ='12A'"));
//        if (tenlop=="12B")
//            mListFace=new ArrayAdapter<HocSinh>(getActivity(),R.layout.item_danhsachlop,db.retrieveHocSinh("SELECT MaLop FROM lop WHERE TenLop ='12B'"));

        //mListFace.add(new FaceThem("10A1", 100, 20, 75,95 ));
        //mListFace.add(new FaceThem("10A2", 100, 80, 20,100));

        mAdapter = new DanhSachLopAdapter(getContext(),mListFace);
        mRrvFace.setAdapter(mAdapter);
        return mRootView;
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
