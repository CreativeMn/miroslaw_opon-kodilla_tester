package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps= new HashSet<>();
        stamps.add(new Stamp ("Polska", 35, 35, true));
        stamps.add(new Stamp ("Niemcy", 40, 45, false));
        stamps.add(new Stamp ("Rosja", 50, 50, false));
        stamps.add(new Stamp ("Polska", 35, 35, true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);

        if (stamps.size() == 3) {
            System.out.println("Kolekcja bez żadnych duplikatów");
        } else {
            System.out.println("Błąd kolekcji.");
        }
    }
}
