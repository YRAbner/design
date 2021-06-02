package com.geely.design.principle.dependenceinversion;

public class Geely {
    //v1 版本
//    public void studyJavaCourse(){
//        System.out.println("Geely study JavaCourse");
//    }
//    public void studyFECourse(){
//        System.out.println("Geely study FECourse");
//    }
//    public void studyPythonCourse(){
//        System.out.println("Geely study PythonCourse");
//    }

//    //v2版本
//    public void studyCrouse(IDCourse idCourse){
//        idCourse.studyCrouse();
//    }
    //v3版本(开始类似正式开发，注入接口@Autowired)
    private IDCourse idCourse;

//    public Geely(IDCourse idCourse) {
//        this.idCourse = idCourse;
//    }

    public void studyCourse(){
        idCourse.studyCrouse();
    }

    //v4版本
    public void setIdCourse(IDCourse idCourse) {
        this.idCourse = idCourse;
    }
}
