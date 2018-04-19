/*
 * Copyright (c) 2018.
 * Created by shentupenghui
 * Last modified 18-4-19 下午3:07
 */

package cn.shentupenghui.zto.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.shentupenghui.zto.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ClassesFragment extends Fragment {


    public ClassesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_classes, container, false);
    }

}
