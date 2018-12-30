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
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HocKy_Fragment extends Fragment{
    private View mRootView;

    public FaceBaoCaoAdapter mAdapter;
    public ArrayAdapter<FaceThem> mListFace;
    public RecyclerView mRrvFace;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_hocky, container, false);
DatabaseHocSinhHelper db = new DatabaseHocSinhHelper(getActivity());
        // Create recycler view
        mRrvFace = (RecyclerView) mRootView.findViewById(R.id.rv_BaoCaoTheoKy);
        mRrvFace.setHasFixedSize(true);
        mRrvFace.setLayoutManager(new LinearLayoutManager(getActivity()));
        TextView txt_hocky = mRootView.findViewById(R.id.edit_TenHocKy);
        txt_hocky.setText("Học kỳ 1");
        // Add data to recyclerView
        mListFace = new ArrayAdapter<FaceThem>(getActivity(),R.layout.fragment_hocky, db.retrieveLop());
//        mListFace.add(new FaceBaoCao("10A2", 100, 70));
//        mListFace.add(new FaceBaoCao("10A3", 38, 24));


        // Create adapter
        mAdapter = new FaceBaoCaoAdapter(mListFace, getContext());
        mRrvFace.setAdapter(mAdapter);
        //mRrvFace.setItemAnimator(new DefaultItemAnimator());

        return mRootView;//super.onCreateView(inflater, container, savedInstanceState); //
    }
}
