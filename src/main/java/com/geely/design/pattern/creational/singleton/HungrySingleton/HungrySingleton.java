package com.geely.design.pattern.creational.singleton.HungrySingleton;

import java.io.Serializable;

public class HungrySingleton implements Serializable , Cloneable{
//    private final static HungrySingleton hunrySigleton = new HungrySingleton();
    private final static HungrySingleton hunrySigleton;

    static {
        hunrySigleton = new HungrySingleton();
    }

    private HungrySingleton(){
        if (hunrySigleton != null){
            throw new RuntimeException("单例模式不允许反射调用构造器创建实例");
        }
    }
    public static HungrySingleton getInstance(){
        return hunrySigleton;
    }

    private Object readResolve(){
        return hunrySigleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
