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

        // Teachers & Staff (from previous parts)
        Teacher teacher1 = new Teacher("Evelyn", "Mathematics");
        Teacher teacher2 = new Teacher("Frank", "Science");

        Staff staff1 = new Staff("Grace", "Administration");
        Staff staff2 = new Staff("Henry", "Library");

        System.out.println("\n=== School Directory ===");
        List<Person> schoolDirectory = new ArrayList<>();
        schoolDirectory.addAll(Arrays.asList(students));
        schoolDirectory.add(teacher1);
        schoolDirectory.add(teacher2);
        schoolDirectory.add(staff1);
        schoolDirectory.add(staff2);

        for (Person person : schoolDirectory) {
            System.out.println(person.getDescription());
        }

        // ===== Part 8: AttendanceService with overloaded methods =====
        AttendanceService attendanceService = new AttendanceService();

        // Overloaded markAttendance using Student & Course objects
        attendanceService.markAttendance(students[0], courses[0], "Present");
        attendanceService.markAttendance(students[1], courses[1], "Absent");

        // Overloaded markAttendance using IDs directly (will trigger invalid status)
        attendanceService.markAttendance(
                students[2].getStudentId(), courses[2].getCourseId(), "Late");

        System.out.println("\n=== Attendance Log (All Records) ===");
        for (AttendanceRecord record : attendanceService.getAttendanceLog()) {
            record.displayRecord();
        }

        // Overloaded query methods
        System.out.println("\n=== Attendance for Student (by object): " + students[0].getName() + " ===");
        List<AttendanceRecord> aliceRecords =
                attendanceService.getAttendanceForStudent(students[0]);
        for (AttendanceRecord record : aliceRecords) {
            record.displayRecord();
        }

        System.out.println("\n=== Attendance for Student (by ID): " + students[1].getName() + " ===");
        List<AttendanceRecord> bobRecords =
                attendanceService.getAttendanceForStudent(students[1].getStudentId());
        for (AttendanceRecord record : bobRecords) {
            record.displayRecord();
        }

        // ===== File saving (from Part 6) =====
        FileStorageService storageService = new FileStorageService();

        List<Student> studentList = Arrays.asList(students);
        List<Course> courseList = Arrays.asList(courses);

        storageService.saveToFile("students.txt", studentList);
        storageService.saveToFile("courses.txt", courseList);
        storageService.saveToFile("Attendance_log.txt", attendanceService.getAttendanceLog());

        System.out.println("\nData saved to files (students.txt, courses.txt, Attendance_log.txt).");
    }
}
