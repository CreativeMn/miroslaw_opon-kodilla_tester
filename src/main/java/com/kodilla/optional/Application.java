package com.kodilla.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mateusz", null));
        students.add(new Student("Michał", new Teacher("Grzegorz")));
        students.add(new Student("Tomasz", new Teacher("Norbert")));
        students.add(new Student("Wiktor", new Teacher("Paweł")));

        for(Student student : students) {

            String teacherName = getTeacherName(student);
            System.out.println("Student: " + student.getName() + " Nauczyciel: " + teacherName);
        }
    }
    public static String getTeacherName (Student student) {
        Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
        String teacher = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
        return teacher;
    }
}
