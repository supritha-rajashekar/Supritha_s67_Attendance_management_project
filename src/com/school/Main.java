package com.school;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Attendance System!");

        // Array of Students (auto-generated rollNumbers)
        Student[] students = new Student[4];
        students[0] = new Student("Alice");
        students[1] = new Student("Bob");
        students[2] = new Student("Charlie");
        students[3] = new Student("Diana");

        // Array of Courses (auto-generated course codes)
        Course[] courses = new Course[3];
        courses[0] = new Course("Mathematics");
        courses[1] = new Course("Science");
        courses[2] = new Course("History");

        System.out.println("\nStudents:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nCourses:");
        for (Course course : courses) {
            System.out.println(course);
        }
    }
}