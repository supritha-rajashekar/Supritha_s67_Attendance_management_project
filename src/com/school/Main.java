package com.school;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Attendance System!");

        // Create Students
        Student[] students = new Student[4];
        students[0] = new Student("Alice");
        students[1] = new Student("Bob");
        students[2] = new Student("Charlie");
        students[3] = new Student("Diana");

        // Create Courses
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

        // (From Part 5) – Teachers / Staff if you still want to keep them
        Teacher teacher1 = new Teacher("Evelyn", "Mathematics");
        Teacher teacher2 = new Teacher("Frank", "Science");

        Staff staff1 = new Staff("Grace", "Administration");
        Staff staff2 = new Staff("Henry", "Library");

        System.out.println("\nTeachers:");
        System.out.println(teacher1);
        System.out.println(teacher2);

        System.out.println("\nStaff:");
        System.out.println(staff1);
        System.out.println(staff2);

        Person[] people = new Person[] { students[0], students[1], teacher1, staff1 };
        System.out.println("\nPeople (Person references):");
        for (Person person : people) {
            System.out.println(person);
        }

        // Attendance log
        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        attendanceLog.add(new AttendanceRecord(
                students[0].getStudentId(), courses[0].getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(
                students[1].getStudentId(), courses[1].getCourseId(), "Absent"));
        attendanceLog.add(new AttendanceRecord(
                students[2].getStudentId(), courses[2].getCourseId(), "Late")); // invalid

        System.out.println("\nAttendance Log:");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }

        // ===== Part 6: Save to files using FileStorageService =====
        FileStorageService storageService = new FileStorageService();

        List<Student> studentList = Arrays.asList(students);
        List<Course> courseList = Arrays.asList(courses);

        storageService.saveToFile("students.txt", studentList);
        storageService.saveToFile("courses.txt", courseList);
        storageService.saveToFile("Attendance_log.txt", attendanceLog);

        System.out.println("\nData saved to files (students.txt, courses.txt, Attendance_log.txt).");

                // ===== Part 7: School Directory using runtime polymorphism =====
        List<Person> schoolDirectory = new ArrayList<>();

        // Add Students
        schoolDirectory.addAll(Arrays.asList(students));

        // Add Teachers
        schoolDirectory.add(teacher1);
        schoolDirectory.add(teacher2);

        // Add Staff
        schoolDirectory.add(staff1);
        schoolDirectory.add(staff2);

        System.out.println("\n=== School Directory ===");
        for (Person person : schoolDirectory) {
            // Runtime polymorphism: which getDescription() runs depends on actual object type
            System.out.println(person.getDescription());
        }

    }
}
