package com.geely.design.principle.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse ioCourse = new JavaDiscountCourse(11 , "java课程" , 199d);

        JavaDiscountCourse javaCourse = (JavaDiscountCourse) ioCourse;

        System.out.println("id:"  + javaCourse.getId() +
                ",name:" + javaCourse.getName() +
                ",price:" + javaCourse.getPrice() +
                ",discountPrice:" + javaCourse.getDiscountCourse()
        );
    }
}
