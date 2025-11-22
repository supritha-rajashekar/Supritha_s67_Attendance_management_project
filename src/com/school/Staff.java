package com.school;

public class Staff extends Person {

    private static int nextStaffIdCounter = 9001;

    private int staffId;
    private String role;

    public Staff(String name, String role) {
        super(name);
        this.staffId = nextStaffIdCounter++;
        this.role = role;
    }

    public int getStaffId() {
        return staffId;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String getDescription() {
        return "Staff{name='" + getName() +
                "', staffId=" + staffId +
                ", role='" + role + "'}";
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
