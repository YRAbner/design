package com.geely.design.behaviral.observer;

public class FriendTwoObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("FriendTwo 知道了你发动态了" + message);
    }
}
