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
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        final ListView profile_list = (ListView) getActivity().findViewById(R.id.profile_lsit_items);
        int[] profile_list_img_id = new int[]{
                R.drawable.personal_center, R.drawable.good, R.drawable.edit, R.drawable.information
        };//定义初始化profile的各项图标
        String[] profile_text_title = new String[]{
                "个人资料修改", "赞赏", "反馈", "关于ZTo"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, profile_text_title);
        profile_list.setAdapter(adapter);
        profile_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0://个人资料修改
                        Intent intent = new Intent(getActivity(), ModifyProfileActivity.class);
                        startActivity(intent);
                        break;
                    case 1://赞赏
                        Toast.makeText(getActivity(), "感谢支持，赞赏功能即将推出", Toast.LENGTH_SHORT).show();
                        break;
                    case 2://反馈
                        Intent intent2 = new Intent(getActivity(), FeedbackActivity.class);
                        startActivity(intent2);
                        break;
                    case 3://关于
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
                        break;
                }
            }
        });

        //about的点击事件
//        about.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                final String[] items = new String[]{"ZTo-课堂助手", "www.shentupenghui.cn", "https://github.com/shentupenghui/CreativeClass_ZTo"};
//                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
//                builder.setTitle("关于ZTo");
//                builder.setItems(items, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        //TODO 点击具体项目的反应
//                    }
//                });
//                builder.create().show();
//            }
//        });


    }

}
