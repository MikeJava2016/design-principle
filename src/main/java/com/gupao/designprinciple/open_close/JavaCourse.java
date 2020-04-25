package com.gupao.designprinciple.open_close;

public class JavaCourse implements ICourse {
    private String id;

    private String name;

    private double price;

    public JavaCourse(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public  JavaCourse() {

    }
    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
