package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Attendance System!");

        // Create Students (auto-generated IDs)
        Student[] students = new Student[4];
        students[0] = new Student("Alice");
        students[1] = new Student("Bob");
        students[2] = new Student("Charlie");
        students[3] = new Student("Diana");

        // Create Courses (auto-generated IDs)
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

        // Part 4 – Attendance Records
        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        // Valid records
        attendanceLog.add(new AttendanceRecord(
                students[0].getStudentId(), courses[0].getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(
                students[1].getStudentId(), courses[1].getCourseId(), "Absent"));

        // Invalid status (to test validation)
        attendanceLog.add(new AttendanceRecord(
                students[2].getStudentId(), courses[2].getCourseId(), "Late"));

        System.out.println("\nAttendance Log:");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
    }
}
