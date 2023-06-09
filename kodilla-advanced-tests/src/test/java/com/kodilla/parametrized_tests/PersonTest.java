package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_tests.homework.Person;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.DataSources#provideDataForTesting")
    void shouldCalculateBMIWithProvidedDataExternalSource(Person person, String expected) {
        assertEquals(expected, person.getBMI());
    }
}



