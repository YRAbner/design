package com.geely.design.principle.dependenceinversion;

public class JavaCourse implements IDCourse {
    @Override
    public void studyCrouse() {
        System.out.println("Geely study JavaCourse");
    }
}
