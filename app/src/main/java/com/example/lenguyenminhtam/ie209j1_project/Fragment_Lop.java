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

public class Fragment_Lop extends Fragment{
    private View mRootView;

    public FaceAdapter  mAdapter;
    public List<Face>   mListFace;
    public RecyclerView mRrvFace;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_lop, container, false);

        // Create recycler view
        mRrvFace = (RecyclerView) mRootView.findViewById(R.id.rv_DanhSachLop);
        mRrvFace.setHasFixedSize(true);
        mRrvFace.setLayoutManager(new LinearLayoutManager(getActivity()));

        // Add data to recyclerView
        mListFace = new ArrayList<>();
        mListFace.add(new Face("10A1", 100, 80,20));
        mListFace.add(new Face("10A2", 80, 40,40));

        // Create adapter
        mAdapter = new FaceAdapter(mListFace, getContext());
        mRrvFace.setAdapter(mAdapter);
        //mRrvFace.setItemAnimator(new DefaultItemAnimator());

        return mRootView;//super.onCreateView(inflater, container, savedInstanceState); //
    }
}
