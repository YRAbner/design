package com.geely.design.pattern.creational.builder.v2;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder()
                .builderCourseName("123")
                .builderCoursePPT("123")
                .builderCourseArticle("123")
                .builderCourseVideo("132")
                .builderCourseQA("123")
                .makeCourse();
        System.out.println(course);

        Set<String> set = ImmutableSet.<String>builder().add("a").add("b").build();
        System.out.println(set);
    }
}
