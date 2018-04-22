/*
 * Copyright (c) 2018.
 * Created by shentupenghui
 * Last modified 18-4-19 下午3:07
 */

package cn.shentupenghui.zto.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import cn.shentupenghui.zto.R;
import cn.shentupenghui.zto.adpter.ClassesAdapter;
import cn.shentupenghui.zto.beans.Classes;

/**
 * A simple {@link Fragment} subclass.
 */
public class ClassesFragment extends Fragment {

    private List<Classes> classesList = new ArrayList<>();
    public ClassesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_classes, container, false);

    }


    private void initClasses() {
            Classes classes1 = new Classes(R.drawable.game_design, "游戏程序设计", "汤颖");
            classesList.add(classes1);
            Classes classes2 = new Classes(R.drawable.android_design, "移动应用开发", "李伟");
            classesList.add(classes2);
            Classes classes3 = new Classes(R.drawable.soft_test, "软件测试", "王婷");
            classesList.add(classes3);
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initClasses();
        RecyclerView recyclerView =getActivity().findViewById(R.id.fragment_class_list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        ClassesAdapter adapter = new ClassesAdapter(classesList);
        recyclerView.setAdapter(adapter);
    }
}
