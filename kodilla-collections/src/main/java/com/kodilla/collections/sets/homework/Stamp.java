package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String nameOfStamp;
    private double width;
    private double length;
    private boolean isStampedOrNot;

    @Override
    public String toString() {
        return "Stamp{" +
                "nameOfStamp='" + nameOfStamp + '\'' +
                ", width=" + width +
                ", length=" + length +
                ", isStampedOrNot=" + isStampedOrNot +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.width, width) == 0 && Double.compare(stamp.length, length) == 0 && isStampedOrNot == stamp.isStampedOrNot && Objects.equals(nameOfStamp, stamp.nameOfStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfStamp, width, length, isStampedOrNot);
    }

    public boolean isStampedOrNot() {
        return isStampedOrNot;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String getNameOfStamp() {
        return nameOfStamp;
    }

    public Stamp(String nameOfStamp, double width, double length, boolean isStampedOrNot) {
        this.nameOfStamp = nameOfStamp;
        this.width = width;
        this.length = length;
        this.isStampedOrNot = isStampedOrNot;


    }
}
