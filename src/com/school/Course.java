package com.school;

public class Course {

    // Auto–ID counter for all courses
    private static int nextCourseIdCounter = 101;

    private int code;     // now int instead of String
    private String name;

    // New constructor (Part 03 requirement)
    public Course(String name) {
        this.code = nextCourseIdCounter++;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Course{name='" + name + "', code='C" + code + "'}";
    }
}
