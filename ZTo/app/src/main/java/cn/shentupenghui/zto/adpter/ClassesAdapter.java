/*
 * Copyright (c) 2018.
 * Created by shentupenghui
 * Last modified 18-4-21 上午9:10
 */

package cn.shentupenghui.zto.adpter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import cn.shentupenghui.zto.R;
import cn.shentupenghui.zto.beans.Classes;

public class ClassesAdapter extends RecyclerView.Adapter<ClassesAdapter.ViewHolder> {
    private List<Classes> mClassesList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView classImg;
        TextView className;
        TextView teacherName;

        public ViewHolder(View view) {
            super(view);
            classImg = (ImageView) view.findViewById(R.id.classes_items_img);
            className = (TextView) view.findViewById(R.id.classes_items_title);
            teacherName = (TextView) view.findViewById(R.id.classes_items_teacher_name);
        }
    }

    public ClassesAdapter(List<Classes> classes) {
        mClassesList = classes;
    }

    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.classes_items, parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int postion) {
        Classes classes = mClassesList.get(postion);
        holder.classImg.setImageResource(classes.getImageId());
        holder.className.setText(classes.getClassName());
        holder.teacherName.setText(classes.getTeacherName());
    }

    @Override
    public int getItemCount() {
        return mClassesList.size();
    }
}

