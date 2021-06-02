package com.geely.design.principle.singleeresponsibility;

public class Test {

    public static void main(String[] args) {
//        Bird bird = new Bird();
////        bird.mainMoveMode("大雁");
////        bird.mainMoveMode("鸵鸟");

        FlyBird flyBird = new FlyBird();
        MoveBird moveBird = new MoveBird();
        flyBird.mainMoveMode("大雁");
        moveBird.mainMoveMode("鸵鸟");
    }
}
