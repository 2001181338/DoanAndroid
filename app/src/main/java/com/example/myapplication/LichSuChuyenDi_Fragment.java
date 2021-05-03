package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LichSuChuyenDi_Fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.lich_su_chuyen_di_fragment, null);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        ArrayList<LichSuChuyenDi> lstLichSuChuyenDi = new ArrayList<>();
        lstLichSuChuyenDi.add(new LichSuChuyenDi("Gò Vấp", "Tân Bình", "Nguyễn Văn A", "15phút", 5, 15000));
        lstLichSuChuyenDi.add(new LichSuChuyenDi("Tân Bình", "Bình Thạnh", "Nguyễn Văn A", "15phút", 5, 15000));
        lstLichSuChuyenDi.add(new LichSuChuyenDi("Tân Phú", "Tân Bình", "Nguyễn Văn A", "15phút", 5, 15000));
        lstLichSuChuyenDi.add(new LichSuChuyenDi("Quận 1", "Quận 2", "Nguyễn Văn A", "15phút", 5, 15000));
        lstLichSuChuyenDi.add(new LichSuChuyenDi("Quận 2", "Quận 3", "Nguyễn Văn A", "15phút", 5, 15000));

        LichSuChuyenDiRecycleView lichSuChuyenDiRecycleView = new LichSuChuyenDiRecycleView(getContext(), lstLichSuChuyenDi);

        RecyclerView recyclerView = view.findViewById(R.id.lichSuRecycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(lichSuChuyenDiRecycleView);


    }
}
