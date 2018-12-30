package com.example.lenguyenminhtam.ie209j1_project;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class Fragment_MonHoc extends Fragment {
    private View mRootView;

    public MyMHAdapter  mAdapter;
    public ArrayAdapter<FaceMonHoc> mListFace;
    public RecyclerView mRrvFace;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_monhoc_setting, container, false);
DatabaseHocSinhHelper db= new DatabaseHocSinhHelper(getActivity());
        // Create recycler view
        mRrvFace = (RecyclerView) mRootView.findViewById(R.id.rv_DanhSachMonHoc);
        mRrvFace.setHasFixedSize(true);
        mRrvFace.setLayoutManager(new LinearLayoutManager(getActivity()));

        // Add data to recyclerView
        mListFace = new ArrayAdapter<FaceMonHoc>(getActivity(),R.layout.fragment_monhoc_setting,db.retrieveMonHoc());
//        mListFace.add(new FaceMonHoc("TOÁN"));
//        mListFace.add(new FaceMonHoc("LÝ"));

        // Create adapter
        mAdapter = new MyMHAdapter(mListFace, getContext());
        mRrvFace.setAdapter(mAdapter);
        //mRrvFace.setItemAnimator(new DefaultItemAnimator());

        return mRootView;//super.onCreateView(inflater, container, savedInstanceState); //
    }
}
