package com.geely.design.behaviral.observer;

/**
 * 观察者模式：行为型
 *
 */
public class test {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(new FriendOneObserver());
        FriendTwoObserver friendTwoObserver = new FriendTwoObserver();
        subject.attach(friendTwoObserver);

        subject.notifyObserver("第一条消息");

        subject.detach(friendTwoObserver);
        subject.notifyObserver("第二条消息");
    }
}
