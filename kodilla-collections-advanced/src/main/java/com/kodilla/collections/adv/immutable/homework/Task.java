package com.kodilla.collections.adv.immutable.homework;

public final class Task {
    private final String title;
    private final int duration;

    Task task = new Task("Do 100 push ups", 10);

    public Task (String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }
}

