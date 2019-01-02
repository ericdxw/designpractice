package com.eric.design.principle.dependenceinversion;
//依赖倒置原则：程序要实现接口，不要依赖具体的程序
//高层模块不能依赖于低层模块，应该依赖于抽象


public class Geely {
    //v1
//    public void studyJavaCourse(){
//
//        System.out.println("学习java课程");
//    }
//    public void studyFECourse(){
//        System.out.println("学习前端课程");
//    }
//    public void studyPythonCourse(){
//        System.out.println("学习python课程");
//    }
    //v2
//    public void studyImoocCourse(ICourse iCourse){
//        iCourse.studyCourse();
//    }
    //v3 构造器
//    private ICourse iCourse;
//    public Geely(ICourse iCourse) {
//        this.iCourse=iCourse;
//    }
//
//    public void studyImoocCourse(){
//        iCourse.studyCourse();
//    }
    //v4
    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void StudyImoocCourse(){
        iCourse.studyCourse();
    }
}
