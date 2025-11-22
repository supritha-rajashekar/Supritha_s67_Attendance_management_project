package com.school;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return "Person{name='" + name + "'}";
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
