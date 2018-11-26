package com.example.lenguyenminhtam.ie209j1_project;
import android.content.Context;
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
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class Fragment_ChonLop extends Fragment {
    private View mRootView;

private ThemHsAdapter mAdapter;
    public List<FaceThem> mListFace;
    public RecyclerView mRrvFace;

    public View onCreateView (@NonNull LayoutInflater inflater,@Nullable ViewGroup container,@Nullable Bundle savedInstanceState)  {

        mRootView = inflater.inflate(R.layout.fragment_chonlop, container, false);

        mRrvFace=mRootView.findViewById(R.id.rv_ChonLop);
        mRrvFace.setHasFixedSize(true);
        mRrvFace.setLayoutManager(new LinearLayoutManager(getActivity()));

        mListFace=new ArrayList<>();
        mListFace.add(new FaceThem("10A1", 100, 20, 75,95 ));
        mListFace.add(new FaceThem("10A2", 100, 80, 20,100));

        mAdapter = new ThemHsAdapter(mListFace, getContext());
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
