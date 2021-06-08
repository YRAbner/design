package com.geely.design.behaviral.observer;

public interface Subject {
    //添加订阅关系
    void attach(Observer obServer);
    //移除订阅关系
    void detach(Observer observer);
    //通知订阅关系
    void notifyObserver(String message);
}
