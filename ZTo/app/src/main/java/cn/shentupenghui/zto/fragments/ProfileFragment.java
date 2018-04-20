/*
 * Copyright (c) 2018.
 * Created by shentupenghui
 * Last modified 18-4-19 下午3:08
 */

package cn.shentupenghui.zto.fragments;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import cn.shentupenghui.zto.R;
import cn.shentupenghui.zto.activity.FeedbackActivity;
import cn.shentupenghui.zto.activity.LoginActivity;
import cn.shentupenghui.zto.activity.ModifyProfileActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {

    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TextView about = (TextView) getActivity().findViewById(R.id.profile_about);
        TextView feedback = (TextView) getActivity().findViewById(R.id.profile_feedback);
        TextView donate = (TextView) getActivity().findViewById(R.id.profile_donate);
        TextView modify = (TextView) getActivity().findViewById(R.id.profile_modify);
        //about的点击事件
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String[] items = new String[]{"ZTo-课堂助手", "www.shentupenghui.cn", "https://github.com/shentupenghui/CreativeClass_ZTo"};
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("关于ZTo");
                builder.setItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //TODO 点击具体项目的反应
                    }
                });
                builder.create().show();
            }
        });

        //feedback的点击事件
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), FeedbackActivity.class);
                startActivity(intent);
            }
        });
        //donate的点击事件
        donate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "赞赏功能待添加", Toast.LENGTH_SHORT).show();
            }
        });
        modify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ModifyProfileActivity.class);
                startActivity(intent);
            }
        });

    }

}
