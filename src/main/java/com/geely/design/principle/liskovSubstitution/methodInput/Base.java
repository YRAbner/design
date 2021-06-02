package com.geely.design.principle.liskovSubstitution.methodInput;

import java.util.HashMap;
import java.util.Map;

public class Base {

    public void method(HashMap map){
        System.out.println("父类被执行");
    }
}
