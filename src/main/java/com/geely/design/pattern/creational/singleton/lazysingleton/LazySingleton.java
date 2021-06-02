package com.geely.design.pattern.creational.singleton.lazysingleton;

public class LazySingleton {
    private static LazySingleton lazySingleton = null;
//    private static boolean flag = true;
    private LazySingleton(){
//        if (flag){
//            flag = false;
//        }else {
//            throw new RuntimeException("单例模式不允许反射调用构造器创建实例");
//        }
    }
    public synchronized static LazySingleton getInstance(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    //反射攻击测试
//    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
//        Class objectClass = LazySingleton.class;
//
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//
//        LazySingleton instance = LazySingleton.getInstance();
//
//        Field field = instance.getClass().getDeclaredField("flag");
//        field.setAccessible(flag);
//        field.set(instance,true);
//
//        LazySingleton newInstance = (LazySingleton) constructor.newInstance();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);
//    }
}
