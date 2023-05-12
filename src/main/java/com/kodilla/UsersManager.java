package com.kodilla;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());                      // [2]

        return usernames;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
    public static List<User> getHigherAge(int age) {
        return UsersRepository.getUsersList()
                .stream()
                .filter(n -> n.getAge() > age)
                .collect(Collectors.toList());
    }

    public static List<User> getNumberOfPostsAndGroupFilter(int post, String group) {
        return UsersRepository.getUsersList()
                .stream()
                .filter(n -> n.getNumberOfPost() >= post && n.getGroup().equals(group))
                .collect(Collectors.toList());
    }
}
