package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalDate;

public class SeasonsSelector {
    private static final String seasons[] = {
            "Winter", "Winter", "Spring", "Spring", "Spring", "Summer",
            "Summer", "Summer", "Fall", "Fall", "Fall", "Winter"
    };

    public static String getSeason( LocalDate date ) {
        return seasons[ date.getMonthValue() ];
    }
}