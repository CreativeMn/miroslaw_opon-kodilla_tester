package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String firstName;
    private String lastName;
    private String nameOfSchool;

    public Principal(String firstName, String lastName, String nameOfSchool) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nameOfSchool = nameOfSchool;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nameOfSchool='" + nameOfSchool + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(firstName, principal.firstName) && Objects.equals(lastName, principal.lastName) && Objects.equals(nameOfSchool, principal.nameOfSchool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, nameOfSchool);
    }

    public String getNameOfSchool() {
        return nameOfSchool;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
