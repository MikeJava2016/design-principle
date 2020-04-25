package com.gupao.designprinciple.smiple_responsibility.sample;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 方法层面的单一职责原则
 */
@Getter
@AllArgsConstructor
public class UserInfo {
    private String name;
    private int age;
    private double height;

    public UserInfo() {
    }

    public UserInfo modifyName(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
        return this;
    }

    public UserInfo modifyName(String name) {
        this.name = name;
        return this;
    }

    public UserInfo modifyAge(int age) {
        this.age = age;
        return this;
    }

    public UserInfo modifyHeight(double height) {
        this.height = height;
        return this;
    }


}
