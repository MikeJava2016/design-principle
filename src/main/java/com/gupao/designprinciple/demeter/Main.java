package com.gupao.designprinciple.demeter;

public class Main {
    public static void main(String[] args) {
        TeamLeader leader = new TeamLeader();
        Employee employee = new Employee();
        leader.commandCheckNumber(employee);
    }
}
