package com.school;

public class AttendanceRecord implements Storable {

    private int studentId;
    private int courseId;
    private String status;

    public AttendanceRecord(int studentId, int courseId, String status) {
        this.studentId = studentId;
        this.courseId = courseId;

        if (status.equalsIgnoreCase("Present") || status.equalsIgnoreCase("Absent")) {
            this.status = status;
        } else {
            this.status = "Invalid";
            System.out.println("Warning: Invalid status '" + status +
                    "' for studentId=" + studentId + ", courseId=" + courseId);
        }
    }

    public int getStudentId() {
        return studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getStatus() {
        return status;
    }

    public void displayRecord() {
        System.out.println("AttendanceRecord{studentId=" + studentId +
                ", courseId=" + courseId + ", status='" + status + "'}");
    }

    @Override
    public String toStorageString() {
        // Format: studentId,courseId,status
        return studentId + "," + courseId + "," + status;
    }
}
