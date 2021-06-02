package com.geely.design.principle.singleeresponsibility;

public class CourseImpl implements ISCourseContent , ISCourseManager {
    @Override
    public Byte[] getCourseVideo() {
        return new Byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }

    @Override
    public String getCourseName() {
        return null;
    }
}
