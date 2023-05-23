package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_tests.homework.Person;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class DataSources {
        public static Stream<Arguments> provideDataForTesting() {
            return Stream.of(
                    Arguments.of(new Person(1.7, 65),"Normal (healthy weight)"),
                    Arguments.of(new Person(1.5, 38),"Underweight"),
                    Arguments.of(new Person(1.5, 35),"Severely underweight"),
                    Arguments.of(new Person(1.5, 30),"Very severely underweight"),
                    Arguments.of(new Person(1.6, 70),"Overweight"),
                    Arguments.of(new Person(1.6, 80),"Obese Class I (Moderately obese)"),
                    Arguments.of(new Person(1.6, 95),"Obese Class II (Severely obese)"),
                    Arguments.of(new Person(1.7, 120),"Obese Class III (Very severely obese)"),
                    Arguments.of(new Person(1.7, 135),"Obese Class IV (Morbidly Obese)"),
                    Arguments.of(new Person(1.8, 165),"Obese Class V (Super Obese)"));
        }
}
