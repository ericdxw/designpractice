package com.eric.design.pattern.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("java教程").buildCourseVideo("java视频").buildCoursePPT("javaPPT").buildCourseQA("java问答").build();
        System.out.println(course.toString());
    }
}
