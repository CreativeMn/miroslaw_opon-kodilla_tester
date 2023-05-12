package com.kodilla.optional.homework;

import com.kodilla.optional.Application;
import com.kodilla.optional.Student;
import com.kodilla.optional.Teacher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {
        @Test
        public void shouldReturnTeacherName() {
            Student student = new Student("Michał", new Teacher("Grzegorz"));
            String teacher = Application.getTeacherName(student);
            assertEquals("Grzegorz", teacher);
        }
        @Test
        public void shouldReturnUndefined() {
            Student student = new Student("Mateusz", null);
            String teacher = Application.getTeacherName(student);
            assertEquals("<undefined>", teacher);
        }
}

