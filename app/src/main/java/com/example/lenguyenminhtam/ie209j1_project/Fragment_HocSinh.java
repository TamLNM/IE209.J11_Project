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

import com.example.lenguyenminhtam.ie209j1_project.R;

import java.util.ArrayList;
import java.util.List;

public class Fragment_HocSinh extends Fragment{
    private View mRootView;
    private RecyclerView rv_DanhSachHocSinh;
private ArrayAdapter<HocSinh> lsthocsinh;
    @Nullable
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DatabaseHocSinhHelper db=new DatabaseHocSinhHelper(getActivity());
        lsthocsinh = new ArrayAdapter<HocSinh>(getActivity(),R.layout.item_dshs,db.retrieveHocSinh("SELECT MaLop FROM lop"));

        //lsthocsinh.add(new hocsinh("","","","","","","",0,0,0,0));
//        lsthocsinh.add(new HocSinh("10001","Phạm Thành An","10A1","Nam","P.Linh Đông, Q.Thủ Đức, TPHCM", "12-03-1997","anpt@gmai.com"));
//        lsthocsinh.add(new HocSinh("10002","Lại Văn Cử","10A1","Nam","P.Linh Trung, Q.Thủ Đức, TPHCM", "20-03-1997","laivancu@gmail.com"));
//        lsthocsinh.add(new HocSinh("10003","Nguyễn Ngọc Đào","10A2","Nữ","P.Bình Chiểu, Q.Thủ Đức, TPHCM", "12-09-1997","daonn@gmai.com"));
//        lsthocsinh.add(new HocSinh("10004","Nguyễn Minh Hậu","10A1","Nam","P.Linh Đông, Q.Thủ Đức, TPHCM", "12-03-1997","haunm@gmai.com"));
//        lsthocsinh.add(new HocSinh("10005","Trần Văn Minh","10a2","Nam","P.Linh Trung, Q.Thủ Đức, TPHCM", "20-03-1997","minhtv@gmail.com"));
//        lsthocsinh.add(new HocSinh("10006","Nguyễn Thị Phụng","10a1","Nữ","P.Bình Chiểu, Q.Thủ Đức, TPHCM", "12-09-1997","phungnt@gmail.com"));
//

    }

    public Fragment_HocSinh() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {




        mRootView = inflater.inflate(R.layout.fragment_hocsinh, container, false);
        rv_DanhSachHocSinh = (RecyclerView)mRootView.findViewById(R.id.rv_DanhSachHocSinh);
        HocSinhAdapter recyclerViewAdapter =  new HocSinhAdapter(getContext(),lsthocsinh);
        rv_DanhSachHocSinh.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv_DanhSachHocSinh.setAdapter(recyclerViewAdapter);
        return mRootView;//super.onCreateView(inflater, container, savedInstanceState);
        }
}
