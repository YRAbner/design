package com.geely.design.pattern.creational.singleton.threadlocalsingleton;

public class Test {
    public static void main(String[] args) {
        System.out.println("main thread"+ThreadLoaclSingleton.getInstance());
        System.out.println("main thread"+ThreadLoaclSingleton.getInstance());
        System.out.println("main thread"+ThreadLoaclSingleton.getInstance());
        System.out.println("main thread"+ThreadLoaclSingleton.getInstance());
        System.out.println("main thread"+ThreadLoaclSingleton.getInstance());
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program end");
    }
}
