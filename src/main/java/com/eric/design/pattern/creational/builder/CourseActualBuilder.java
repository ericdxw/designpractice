package com.eric.design.pattern.creational.builder;

public class CourseActualBuilder extends CourseBuilder {
    private Course course = new Course();
    @Override
    public void buildCourseName(String name) {
        this.course.setCourseName(name);
    }

    @Override
    public void buildCoursePPT(String ppt) {
        this.course.setCoursePPT(ppt);
    }

    @Override
    public void buildCourseVideo(String video) {
        this.course.setCourseVideo(video);
    }

    @Override
    public void buildCourseArticle(String article) {
        this.course.setCourseArticle(article);
    }

    @Override
    public void buildCourseQA(String qa) {
        this.course.setCourseQA(qa);
    }

    @Override
    public Course makeCourse() {
        return course;
    }
}
