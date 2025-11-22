package com.school;

public class Student {

    // Auto–ID counter for all students
    private static int nextStudentIdCounter = 1;

    private int studentId;
    private String name;

    // Auto-ID constructor
    public Student(String name) {
        this.studentId = nextStudentIdCounter++;
        this.name = name;
    }

    // Getters (Part 4 requirement)
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', studentId=" + studentId + "}";
    }
}
