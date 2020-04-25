package com.gupao.designprinciple.open_close;

public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(String id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountPrice() {
        return super.getPrice() * 0.6;
    }
}
