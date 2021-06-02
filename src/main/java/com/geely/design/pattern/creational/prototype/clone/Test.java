package com.geely.design.pattern.creational.prototype.clone;

import com.geely.design.pattern.creational.singleton.HungrySingleton.HungrySingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        Date date = new Date(0L);
//        Pig pig1 = new Pig("大肥仔" , date);
//        Pig pig2 = (Pig) pig1.clone();
//        System.out.println(pig1);
//        System.out.println(pig2);
//        pig1.getBirthday().setTime(88888888888L);
//        System.out.println(pig1);
//        System.out.println(pig2);

        //克隆破坏单例模式
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();

        Method method = hungrySingleton.getClass().getDeclaredMethod("clone");
        method.setAccessible(true);

        HungrySingleton cloneHungrySingleton = (HungrySingleton) method.invoke(hungrySingleton);

        System.out.println(hungrySingleton);
        System.out.println(cloneHungrySingleton);
    }
}
