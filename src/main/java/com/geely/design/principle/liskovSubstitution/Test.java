package com.geely.design.principle.liskovSubstitution;

public class Test {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);
    }
//    public static void main(String[] args) {
//        Square square = new Square();
//        square.setSideLength(10);
//        resize(square);
//    }
    public static void resize(Rectangle rectangle){
        while(rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
            System.out.println("width:" + rectangle.getWidth() + ",length:" + rectangle.getLength());
        }
        System.out.println("resize方案结束：width:" + rectangle.getWidth() + ",length:" + rectangle.getLength());
    }
}
