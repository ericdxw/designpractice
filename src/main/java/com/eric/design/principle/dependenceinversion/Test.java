package com.eric.design.principle.dependenceinversion;

public class Test {
    //  v1高耦合
//    public static void main(String[] args) {
//
//        Geely geely = new Geely();
//        geely.studyFECourse();
//        geely.studyJavaCourse();
//
//    }
    //v2接口方法注入
//    public static void main(String[] args) {
//
//
//        Geely geely = new Geely();
//        geely.studyImoocCourse(new JavaCourse());
//        geely.studyImoocCourse(new FECourse());
//    }

    //v3构造器注入
//    public static void main(String[] args) {
//        Geely geely = new Geely(new JavaCourse());
//        geely.studyImoocCourse();
//    }

    //v4
    public static void main(String[] args) {
        Geely geely = new Geely();
        geely.setiCourse(new JavaCourse());
        geely.StudyImoocCourse();
        geely.setiCourse(new FECourse());
        geely.StudyImoocCourse();
    }
}
