package com.gupao.designprinciple.interface_segregation;

public class Bird implements IFlyAnimal,IEatAnimal {
    @Override
    public void eat() {
        System.out.println("bird eat");
    }

    @Override
    public void fly() {
        System.out.println("bird fly");
    }
}
