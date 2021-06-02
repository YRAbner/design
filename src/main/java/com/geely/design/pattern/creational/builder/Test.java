package com.geely.design.pattern.creational.builder;

public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("名称","PPT","Video","Article","QA");
        System.out.println(course);
    }
}
