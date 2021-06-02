package com.geely.design.principle.dependenceinversion;

public class FECourse implements IDCourse {
    @Override
    public void studyCrouse() {
        System.out.println("Geely study FECourse");
    }
}
