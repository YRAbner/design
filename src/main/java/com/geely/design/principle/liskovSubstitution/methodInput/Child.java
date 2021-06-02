package com.geely.design.principle.liskovSubstitution.methodInput;

import java.util.HashMap;
import java.util.Map;

public class Child extends Base{

    public void method(Map map) {
        System.out.println("子类Map被执行");
    }

//    @Override
//    public void method(HashMap map){
//        System.out.println("子类HashMap被执行");
//    }
}
