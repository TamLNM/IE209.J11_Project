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

import java.util.ArrayList;
import java.util.List;

public class Fragment_Lop_Setting extends Fragment {
    private View mRootView;

    public MyLAdapter  mAdapter;
    public List<FaceLop> mListFace;
    public RecyclerView mRrvFace;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_lop_setting, container, false);

        // Create recycler view
        mRrvFace = (RecyclerView) mRootView.findViewById(R.id.rv_DanhSachLop_Setting);
        mRrvFace.setHasFixedSize(true);
        mRrvFace.setLayoutManager(new LinearLayoutManager(getActivity()));

        // Add data to recyclerView
        mListFace = new ArrayList<>();
        mListFace.add(new FaceLop("10A1"));
        mListFace.add(new FaceLop("10A2"));

        // Create adapter
        mAdapter = new MyLAdapter(mListFace, getContext());
        mRrvFace.setAdapter(mAdapter);
        //mRrvFace.setItemAnimator(new DefaultItemAnimator());

        return mRootView;//super.onCreateView(inflater, container, savedInstanceState); //
    }
}