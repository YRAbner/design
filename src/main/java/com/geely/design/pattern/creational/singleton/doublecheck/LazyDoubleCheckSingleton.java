package com.geely.design.pattern.creational.singleton.doublecheck;

public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    private LazyDoubleCheckSingleton(){
    }
    public static LazyDoubleCheckSingleton getInstance(){
        if (lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (lazyDoubleCheckSingleton == null){
                    /**new的这个过程虽然简单，但是需要经历三个步骤
                        1、分配内存给对象
                        2、初始化对象
                        3、设置lazyDoubleCheckSingleton 指向刚分配的内存
                        这三个步骤中2、3步是可以调换顺序的，而调换顺序的过程称为重排序，是一个随机行为
                        所以这里存在一个隐患，当线程0在指向new的过程时，
                        线程2进行第一次判断，会发现lazyDoubleCheckSingleton对象已经分配的内存。
                        虽然没有初始化，这样导致线程2会直接返回。此时将出现错误
                     **/
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
