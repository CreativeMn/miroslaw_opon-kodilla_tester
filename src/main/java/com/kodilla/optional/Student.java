package com.kodilla.optional;

public class Student {
    public String name;
    public Teacher teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public String getName() {
        return name;
    }
}
