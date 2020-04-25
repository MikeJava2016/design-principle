package com.gupao.designprinciple.open_close;

public class MainOpenCloseTest {
    public static void main(String[] args) {
        ICourse course = new JavaCourse("1", "java", 100);
        System.out.printf(" course = " + course.toString());

        ICourse javaCourse = new JavaDiscountCourse("2020", "java", 18000d);
        JavaDiscountCourse discountCourse = (JavaDiscountCourse) javaCourse;
        System.out.println(discountCourse.getDiscountPrice());

    }
}
