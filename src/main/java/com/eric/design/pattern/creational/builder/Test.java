package com.eric.design.pattern.creational.builder;

public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("python教程","pythonPPT","python视频","python手机","python问答");
        System.out.println(course.toString());

    }
}
