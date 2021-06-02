package com.geely.design.pattern.creational.singleton.enumsingleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //序列化破坏测试枚举类
//        EnumInstance instance = EnumInstance.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//
//        EnumInstance newInstance = (EnumInstance) ois.readObject();
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);

        //反射攻击测试枚举类
        Class objectClass = EnumInstance.class;

        Constructor constructor = objectClass.getDeclaredConstructor(String.class , int.class);
        constructor.setAccessible(true);
        constructor.newInstance("haha",666);
        EnumInstance instance = EnumInstance.getInstance();
        EnumInstance newInstance = (EnumInstance) constructor.newInstance();
    }
}
