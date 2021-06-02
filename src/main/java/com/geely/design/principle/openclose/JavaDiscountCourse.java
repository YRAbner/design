package com.geely.design.principle.openclose;

/**
 * 继承原实现类
 * 实现新的需求：某一类课程打折，某一类课程价格超过多少的打折
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountCourse(){
        if (getPrice() > 100){
            return super.getPrice()*0.8;
        }

        return super.getPrice();
    }
}
