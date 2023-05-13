package com.kodilla.optional.homework;

import com.kodilla.User;
import com.kodilla.stream.homework.ForumStats;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStatsTest {
    ForumStats forumStats = new ForumStats();
    public List<User> userList() {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));
        users.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        return users;
    }
    @Test
    void avg1Test() {
        double result = forumStats.averageOfUsersAgeHigherThanForty(userList());
        double expectedValue = 2.25;
        assertEquals(expectedValue, result);
    }

    @Test
    void avg2Test() {
        double result = forumStats.averageOfUserAgeLowerThanForty(userList());
        double expectedValue = 2382.0;
        assertEquals(expectedValue, result);
    }
}
