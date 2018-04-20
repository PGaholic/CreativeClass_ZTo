/*
 * Copyright (c) 2018.
 * Created by shentupenghui
 * Last modified 18-4-20 上午10:24
 */

package cn.shentupenghui.zto.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.shentupenghui.zto.R;

public class FeedbackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        setTitle("反馈");
    }
}
