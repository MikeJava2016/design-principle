package com.gupao.designprinciple.demeter;

public class TeamLeader {
    public void commandCheckNumber(Employee employee) {
        System.out.println("count:"+ employee.checkNumberOfCourse());
    }
}
