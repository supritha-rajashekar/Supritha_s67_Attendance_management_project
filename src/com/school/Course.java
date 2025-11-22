package com.school;

public class Course implements Storable {

    private static int nextCourseIdCounter = 101;

    private int courseId;
    private String courseName;

    public Course(String courseName) {
        this.courseId = nextCourseIdCounter++;
        this.courseName = courseName;
    }

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

    @Override
    public String toStorageString() {
        // Format: courseId,courseName
        return courseId + "," + courseName;
    }
}
