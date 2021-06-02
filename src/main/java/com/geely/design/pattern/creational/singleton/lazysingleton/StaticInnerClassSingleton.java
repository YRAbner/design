package com.geely.design.pattern.creational.singleton.lazysingleton;

public class StaticInnerClassSingleton {
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }

    //私有构造器，一定要有，防止在其他类中直接通过构造器创建对象
    private StaticInnerClassSingleton(){
        if (InnerClass.staticInnerClassSingleton != null){
            throw new RuntimeException("单例模式不允许反射调用构造器创建实例");
        }
    }
}
