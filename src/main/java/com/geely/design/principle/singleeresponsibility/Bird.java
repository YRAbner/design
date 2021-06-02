package com.geely.design.principle.singleeresponsibility;

public class Bird {

    public void mainMoveMode(String birdName){
        if ("鸵鸟".equals(birdName)){
            System.out.println(birdName + "在地上走");
        }else {
            System.out.println(birdName + "在天上飞");
        }

    }
}
