package com.gupao.designprinciple.depency_inversion;

public class Tom {

    public void
    study(ICourse  course) {
        System.out.println(course.getName());
    }
    public void studyJavaCourse() {
        System.out.println("study java course...");
    }

    public void studyPythonCourse() {
        System.out.println("study python course...");
    }

    public void studyAICourse() {
        System.out.println("study AI Course...");
    }
}
