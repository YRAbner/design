package com.geely.design.principle.dependenceinversion;

public class Test {
    //v1 版本
//    public static void main(String[] args) {
//        Geely geely = new Geely();
//        geely.studyJavaCourse();
//        geely.studyJavaCourse();
//        geely.studyPythonCourse();
//    }

    //v2版本

//    public static void main(String[] args) {
//        Geely geely = new Geely();
//        geely.studyCrouse(new JavaCourse());
//        geely.studyCrouse(new FECourse());
//        geely.studyCrouse(new PythonCourse());
//    }

    //v3版本
//    public static void main(String[] args) {
//        Geely geely = new Geely(new JavaCourse());
//        geely.studyCourse();
//    }

    //v4版本
    public static void main(String[] args) {
        Geely geely = new Geely();
        geely.setIdCourse(new JavaCourse());
        geely.studyCourse();
    }
}
