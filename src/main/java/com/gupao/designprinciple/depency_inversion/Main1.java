package com.gupao.designprinciple.depency_inversion;

public class Main1 {
    public static void main(String[] args) {
        Tom tom = new Tom();
        /*tom.studyJavaCourse();
        tom.studyPythonCourse();*/

        tom.studyPythonCourse();
        tom.study(new PythonCourse());
        tom.study(new JavaCourse());
        tom.study(new ICourse() {
            @Override
            public String getName() {
                return "ai";











            }
        });
    }
}
