package com.geely.design.behaviral.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    //订阅容器
    private List<Observer> observers = new ArrayList<Observer>();
    @Override
    public void attach(Observer obServer) {
        observers.add(obServer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
        for (Observer observer: observers){
            observer.update(message);
        }
    }
}
