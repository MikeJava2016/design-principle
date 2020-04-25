package com.gupao.designprinciple.smiple_responsibility;

public class JavaCourse implements ICourseInfo, ICourseManager {
    @Override
    public String getCourseName() {
        return "java";
    }

    @Override
    public byte[] getCourseVedio() {
        return getCourseName().getBytes();
    }

    @Override
    public void studyCourse() {
        System.out.println("study java");
    }

    @Override
    public void refundCourse() {
        System.out.println("refundCourse");
    }
}
