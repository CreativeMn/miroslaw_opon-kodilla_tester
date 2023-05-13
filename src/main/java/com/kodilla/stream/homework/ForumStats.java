package com.kodilla.stream.homework;

import com.kodilla.User;
import com.kodilla.UsersRepository;

import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
        ForumStats forumStats = new ForumStats();
        System.out.println("Średnia ilość postów dla użytkowników starszych od 40 lat: " + forumStats.averageOfUsersAgeHigherThanForty(UsersRepository.getUsersList()));
        System.out.println("Średnia ilość postów dla użytkowników młodszych od 40 lat: " + forumStats.averageOfUserAgeLowerThanForty(UsersRepository.getUsersList()));
    }

    public double averageOfUsersAgeHigherThanForty(List<User> users) {
        return users
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
    }

    public double averageOfUserAgeLowerThanForty(List<User> users) {
        return users
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
    }
}
