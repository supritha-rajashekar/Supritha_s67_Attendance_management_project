package com.school;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Attendance System!");

        // Array of Students
        Student[] students = new Student[3];
        students[0] = new Student("Alice", 1);
        students[1] = new Student("Bob", 2);
        students[2] = new Student("Charlie", 3);

        // Array of Courses
        Course[] courses = new Course[2];
        courses[0] = new Course("Mathematics", "M101");
        courses[1] = new Course("Science", "S101");

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
