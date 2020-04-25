package com.gupao.designprinciple.smiple_responsibility.sample;

public class Main {
    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo("name", 19, 178);
        System.out.println(userInfo.getAge());
        System.out.println(userInfo.getName());
        System.out.println(userInfo.getHeight());

        userInfo.modifyHeight(180).modifyName("java")
                .modifyAge(24);
        System.out.println(userInfo.getHeight());
    }
}
