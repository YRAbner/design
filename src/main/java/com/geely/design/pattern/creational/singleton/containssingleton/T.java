package com.geely.design.pattern.creational.singleton.containssingleton;


public class T implements Runnable {
    @Override
    public void run() {
        ContainsSingleton.putInstance("key" , new Object());
        Object object = ContainsSingleton.getInstance("key");
        System.out.println(Thread.currentThread().getName() + ":" + object);
    }
}
