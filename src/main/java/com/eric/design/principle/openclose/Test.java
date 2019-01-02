package com.eric.design.principle.openclose;

public class Test {
    //快速生成main方法 psvm
    public static void main(String[] args) {
        ICouse iCourse = new JavaDiscountCourse(96,"java开发",398d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程ID"+javaCourse.getId()+"课程名："+javaCourse.getName()+"价格："+ javaCourse.getPrice()+"原价"+javaCourse.getOriginalPrice());
    }
}
