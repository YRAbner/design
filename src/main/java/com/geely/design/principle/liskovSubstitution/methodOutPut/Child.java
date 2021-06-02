package com.geely.design.principle.liskovSubstitution.methodOutPut;

import java.util.HashMap;
import java.util.Map;

public class Child extends Base{

    @Override
    public HashMap method() {
        HashMap hashMap = new HashMap();
        hashMap.put("message","子类hashMap被执行");
        System.out.println(hashMap);
        return hashMap;
    }
}
