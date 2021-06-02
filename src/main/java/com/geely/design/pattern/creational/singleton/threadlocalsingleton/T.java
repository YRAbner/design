package com.geely.design.pattern.creational.singleton.threadlocalsingleton;

public class T implements Runnable {
    @Override
    public void run() {
        ThreadLoaclSingleton threadLoaclSingleton = ThreadLoaclSingleton.getInstance();

        System.out.println(Thread.currentThread().getName() + ":" + threadLoaclSingleton);
    }
}
