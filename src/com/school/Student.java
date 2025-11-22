package com.school;

public class Student {

    // Auto–ID counter for all students
    private static int nextStudentIdCounter = 1;

    private int rollNumber;   // now auto-generated
    private String name;

    // New constructor (Part 03 requirement)
    public Student(String name) {
        this.rollNumber = nextStudentIdCounter++;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNumber=" + rollNumber + "}";
    }
}
