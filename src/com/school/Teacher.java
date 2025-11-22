package com.school;

public class Teacher extends Person {

    private static int nextTeacherIdCounter = 5001;

    private int teacherId;
    private String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.teacherId = nextTeacherIdCounter++;
        this.subject = subject;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String getDescription() {
        return "Teacher{name='" + getName() +
                "', teacherId=" + teacherId +
                ", subject='" + subject + "'}";
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
