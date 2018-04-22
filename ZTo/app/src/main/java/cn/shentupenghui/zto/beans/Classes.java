/*
 * Copyright (c) 2018.
 * Created by shentupenghui
 * Last modified 18-4-21 上午9:22
 */

package cn.shentupenghui.zto.beans;

public class Classes {
    private int imageId;
    private String className;
    private String teacherName;

    public Classes(int imageId, String className, String teacherName) {
        this.imageId = imageId;
        this.className = className;
        this.teacherName = teacherName;
    }

    public int getImageId() {
        return imageId;
    }

    public String getClassName() {
        return className;
    }

    public String getTeacherName() {
        return teacherName;
    }
}
