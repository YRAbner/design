package com.geely.design.pattern.creational.singleton.HungrySingleton;

import com.geely.design.pattern.creational.singleton.lazysingleton.LazySingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    //序列化破坏
//    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        HungrySingleton instance = HungrySingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//
//        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);
//
//    }

    //反射攻击防御
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //饿汉式
//        Class objectClass = HungrySingleton.class;
//
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        HungrySingleton instance = HungrySingleton.getInstance();
//        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();

        //静态内部类
//        Class objectClass = StaticInnerClassSingleton.class;
//
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
//        StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton) constructor.newInstance();


        //懒汉式
        Class objectClass = LazySingleton.class;

        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        LazySingleton newInstance = (LazySingleton) constructor.newInstance();
        LazySingleton instance = LazySingleton.getInstance();


        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
