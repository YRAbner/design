package com.geely.design.pattern.creational.singleton.threadlocalsingleton;

public class ThreadLoaclSingleton {
    private static final ThreadLocal<ThreadLoaclSingleton> threadLocalInstance = new ThreadLocal<ThreadLoaclSingleton>(){
        @Override
        protected ThreadLoaclSingleton initialValue() {
            return new ThreadLoaclSingleton();
        }
    };
    private ThreadLoaclSingleton(){
    }
    public static ThreadLoaclSingleton getInstance(){
        return threadLocalInstance.get();
    }
}
