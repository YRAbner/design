package com.geely.design.behaviral.observer;

public class FriendOneObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("FriendOne 知道了你发动态了" + message);
    }
}
