package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> classes = new HashMap<>();
        Principal marek = new Principal("Marek", "Nowak", "Szkoła Podstawowa");
        Principal jan = new Principal("Jan", "Ochał", "Szkoła Zawodowa");
        Principal krzysztof = new Principal("Krzysztof", "Kowalski", "Technikum");

        School marekSchool = new School(Arrays.asList(23,17,20,30,27));
        School janSchool = new School(Arrays.asList(33,28,29,20,19));
        School krzysztofSchool = new School(Arrays.asList(27,24,31,25,28));

        classes.put(marek, marekSchool);
        classes.put(jan, janSchool);
        classes.put(krzysztof, krzysztofSchool);

        for (Map.Entry<Principal, School> principalEntry : classes.entrySet())
            System.out.println("Dyrektor: " + principalEntry.getKey().getFirstName() + " " + principalEntry.getKey().getLastName() +
                    ", szkoła: " + principalEntry.getKey().getNameOfSchool() +
                    ", liczba uczniów: " + principalEntry.getValue().getNumberOfStudents());
    }
}