package com.gupao.designprinciple.demeter;

import com.gupao.designprinciple.depency_inversion.JavaCourse;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    public int  checkNumberOfCourse() {
        List<JavaCourse> javaCourses = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            javaCourses.add(new JavaCourse());
        }
        return javaCourses.size();
    }
}
