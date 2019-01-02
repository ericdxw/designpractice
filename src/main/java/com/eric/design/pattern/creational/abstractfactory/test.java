package com.eric.design.pattern.creational.abstractfactory;

public class test {
    public static void main(String[] args) {
        CourseFactory javaCourseFactoryFactory = new JavaCourseFactory();
        Video video = javaCourseFactoryFactory.getVideo();
        video.produceVideo();
        Article article = javaCourseFactoryFactory.getArticle();
        article.produceArticle();

        CourseFactory pythonCourseFactory = new PythonCourseFactory();
        Video pythonVideo = pythonCourseFactory.getVideo();
        pythonVideo.produceVideo();
    }
}
