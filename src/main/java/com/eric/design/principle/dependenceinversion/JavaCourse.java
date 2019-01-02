package com.eric.design.principle.dependenceinversion;

public class JavaCourse implements  ICourse {

    @Override
    public void studyCourse() {

        System.out.println("学习java课程");
    }
}
