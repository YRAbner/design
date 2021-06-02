package com.geely.design.pattern.creational.factorymethod;

public class Test {

    public static void main(String[] args) {
//        Video video = new JavaVideo();
//        video.produce();

//        VideoFactory factory = new VideoFactory();
//        Video video = factory.getVideoType("java");
//
//        if (video == null){
//            return;
//        }
//        video.produce();
//
//        VideoFactory factory = new VideoFactory();
//        Video video = factory.getVideoType(JavaVideo.class);
//        video.produce();

        VideoFactory factory = new JavaVideoFactory();
        Video video = factory.getVideo();
        video.produce();
    }
}
