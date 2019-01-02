package com.eric.design.pattern.creational.builder.v2;

public class Course {
    private String CourseName;
    private String CoursePPT;
    private String CourseArticle;
    private String CourseQA;
    private String CourseVideo;

    public Course(CourseBuilder courseBuilder){
        this.CourseName = courseBuilder.courseName;
        this.CourseArticle = courseBuilder.courseArticle;
        this.CourseQA = courseBuilder.courseQA;
        this.CourseVideo = courseBuilder.courseVideo;
        this.CoursePPT = courseBuilder.coursePPT;
    }
    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public void setCoursePPT(String coursePPT) {
        CoursePPT = coursePPT;
    }

    public void setCourseArticle(String courseArticle) {
        CourseArticle = courseArticle;
    }

    public void setCourseOA(String courseOA) {
        CourseQA = courseOA;
    }

    public void setCourseVideo(String courseVideo) {
        CourseVideo = courseVideo;
    }

    public String getCourseName() {

        return CourseName;
    }

    public String getCoursePPT() {
        return CoursePPT;
    }

    public String getCourseArticle() {
        return CourseArticle;
    }

    public String getCourseOA() {
        return CourseQA;
    }

    public String getCourseVideo() {
        return CourseVideo;
    }

    @Override
    public String toString() {
        return "Course{" +
                "CourseName='" + CourseName + '\'' +
                ", CoursePPT='" + CoursePPT + '\'' +
                ", CourseArticle='" + CourseArticle + '\'' +
                ", CourseQA='" + CourseQA + '\'' +
                ", CourseVideo='" + CourseVideo + '\'' +
                '}';
    }

    public static class CourseBuilder{
        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseArticle;
        private String courseQA;
        public CourseBuilder buildCourseName(String courseName){
            this.courseName = courseName;
            return this;
        }
        public CourseBuilder buildCoursePPT(String coursePPT){
            this.coursePPT= coursePPT;
            return this;
        }
        public CourseBuilder buildCourseVideo(String courseVideo){
            this.courseVideo = courseVideo;
            return this;
        }
        public CourseBuilder buildCourseArticle(String courseArticle){
            this.courseArticle = courseArticle;
            return this;
        }
        public CourseBuilder buildCourseQA(String courseQA){
            this.courseQA = courseQA;
            return this;
        }
        public Course build(){
            return new Course(this);
        }

    }

}
