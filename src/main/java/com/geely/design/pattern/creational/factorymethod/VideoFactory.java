package com.geely.design.pattern.creational.factorymethod;

public abstract class VideoFactory {

    public abstract Video getVideo();

//    public Video getVideoType(String type){
//        if ("java".equals(type)){
//            return new JavaVideo();
//        }else if ("python".equals(type)){
//            return new PythonVideo();
//        }
//
//        return null;
//    }

//    public Video getVideoType(Class c){
//        Video video = null;
//
//        try {
//            video = (Video) Class.forName(c.getName()).newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        return video;
//    }
}
