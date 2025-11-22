package com.school;

public class Course {

    // Auto–ID counter for all courses
    private static int nextCourseIdCounter = 101;

    private int courseId;
    private String courseName;

    // Auto-ID constructor
    public Course(String courseName) {
        this.courseId = nextCourseIdCounter++;
        this.courseName = courseName;
    }

    // Getters (Part 4 requirement)
    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return "Course{name='" + courseName + "', courseId='C" + courseId + "'}";
    }
}
