package com.school;

import java.util.ArrayList;
import java.util.List;

public class AttendanceService {

    private List<AttendanceRecord> attendanceLog = new ArrayList<>();

    // Overloaded method 1: use IDs
    public AttendanceRecord markAttendance(int studentId, int courseId, String status) {
        AttendanceRecord record = new AttendanceRecord(studentId, courseId, status);
        attendanceLog.add(record);
        return record;
    }

    // Overloaded method 2: use Student and Course objects
    public AttendanceRecord markAttendance(Student student, Course course, String status) {
        return markAttendance(student.getStudentId(), course.getCourseId(), status);
    }

    // Query by studentId
    public List<AttendanceRecord> getAttendanceForStudent(int studentId) {
        List<AttendanceRecord> results = new ArrayList<>();
        for (AttendanceRecord record : attendanceLog) {
            if (record.getStudentId() == studentId) {
                results.add(record);
            }
        }
        return results;
    }

    // Overloaded query: by Student object
    public List<AttendanceRecord> getAttendanceForStudent(Student student) {
        return getAttendanceForStudent(student.getStudentId());
    }

    // Expose full log (for display and file saving)
    public List<AttendanceRecord> getAttendanceLog() {
        return attendanceLog;
    }
}
