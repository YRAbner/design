package com.geely.design.principle.dependenceinversion;

public class PythonCourse implements IDCourse {
    @Override
    public void studyCrouse() {
        System.out.println("Geely study PythonCourse");
    }
}
