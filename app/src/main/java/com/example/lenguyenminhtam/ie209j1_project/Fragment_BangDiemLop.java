package com.example.lenguyenminhtam.ie209j1_project;

import android.content.Intent;
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

public class Fragment_BangDiemLop extends Fragment {
    private View mRootView;


    public ArrayAdapter<ketquahoctap> mListFace;
    public RecyclerView mRrvFace;
    public BangDiemLopAdapter mAdapter;
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_bangdiemlop, container, false);

        DatabaseHocSinhHelper db=new DatabaseHocSinhHelper(getActivity());
        Intent intent=new Intent();

        mRrvFace=mRootView.findViewById(R.id.rv_DanhSachBangDiemLop);
        mRrvFace.setHasFixedSize(true);
        mRrvFace.setLayoutManager(new LinearLayoutManager(getActivity()));

        String malop = intent.getStringExtra("malop1");

        mListFace = new ArrayAdapter<ketquahoctap>(getActivity(), R.layout.item_danhsachdiem, db.retrieveKetquahoctap("SELECT MSHS FROM hocsinh WHERE MaLop='10A'"));

        mAdapter = new BangDiemLopAdapter(getContext(),mListFace);
        mRrvFace.setAdapter(mAdapter);
        return mRootView;

    }
}
