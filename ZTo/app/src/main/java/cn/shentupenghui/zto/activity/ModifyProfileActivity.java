/*
 * Copyright (c) 2018.
 * Created by shentupenghui
 * Last modified 18-4-20 上午11:07
 */

package cn.shentupenghui.zto.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.shentupenghui.zto.R;

public class ModifyProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify_profile);
        setTitle("修改密码");
    }
}
