package com.eric.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {
    public void checkNumberOfCourses() {
        List<Course> courseList = new ArrayList<>();
        for (int i = 0 ; i < 20 ; i++){
            courseList.add(new Course());
        }
        System.out.println("课程数量"+courseList.size());
    }
}
