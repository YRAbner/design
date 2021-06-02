package com.geely.design.pattern.creational.singleton.doublecheck;

public class T implements Runnable {
    @Override
    public void run() {
        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + lazyDoubleCheckSingleton);
    }
}
