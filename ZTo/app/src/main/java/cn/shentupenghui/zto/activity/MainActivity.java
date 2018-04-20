/*
 * Copyright (c) 2018.
 * Created by shentupenghui
 * Last modified 18-4-19 下午3:20
 */

package cn.shentupenghui.zto.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import cn.shentupenghui.zto.R;
import cn.shentupenghui.zto.fragments.ClassesFragment;
import cn.shentupenghui.zto.fragments.HomePageFragment;
import cn.shentupenghui.zto.fragments.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    setTitle("首页");
                    HomePageFragment homePageFragment = new HomePageFragment();
                    android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fram, homePageFragment);
                    fragmentTransaction.commit();
                    return true;
                case R.id.navigation_dashboard:
                    setTitle("课程列表");
                    ClassesFragment classesFragment = new ClassesFragment();
                    android.support.v4.app.FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction2.replace(R.id.fram, classesFragment);
                    fragmentTransaction2.commit();
                    return true;
                case R.id.navigation_notifications:
                    setTitle("个人中心");
                    ProfileFragment profileFragment = new ProfileFragment();
                    FragmentTransaction fragmentTransaction3 = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction3.replace(R.id.fram, profileFragment);
                    fragmentTransaction3.commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        setTitle("首页");
        HomePageFragment homePageFragment = new HomePageFragment();
        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fram, homePageFragment, "fragment");
        fragmentTransaction.commit();
    }

}
