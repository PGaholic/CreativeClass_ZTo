/*
 * Copyright (c) 2018.
 * Created by shentupenghui
 * Last modified 18-4-18 上午10:54
 */

package cn.shentupenghui.zto.activity;

import android.app.ActionBar;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import cn.shentupenghui.zto.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        init();
    }

    public void init() {

        TextView copyright = (TextView) findViewById(R.id.text2_version);
        try {
            PackageInfo info = getPackageManager().getPackageInfo(getPackageName(), 0);
            copyright.setText("version " + info.versionName);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            copyright.setText("version");
        }
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);
                SplashActivity.this.finish();
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, 2000);
    }
}
