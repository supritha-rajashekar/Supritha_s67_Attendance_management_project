package com.school;

public class Student extends Person implements Storable {

    private static int nextStudentIdCounter = 1;

    private int studentId;

    public Student(String name) {
        super(name);
        this.studentId = nextStudentIdCounter++;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String getDescription() {
        return "Student{name='" + getName() + "', studentId=" + studentId + "}";
    }

    @Override
    public String toString() {
        return getDescription();
    }

    @Override
    public String toStorageString() {
        // Format: studentId,name
        return studentId + "," + getName();
    }
}
