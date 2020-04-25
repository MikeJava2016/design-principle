package com.gupao.designprinciple.interface_segregation;

public class Dog implements IAnimal {
    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void fly() {

    }

    @Override
    public void sleep() {
        System.out.println("sleep");
    }
}
