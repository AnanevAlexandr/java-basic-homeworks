package ru.tuxuu.java.basic.homeworks.homework7;

import static ru.tuxuu.java.basic.homeworks.homework7.Area.PLAIN;

public class Bicycle implements Transport {
    private String name;
    private int energy;


    @Override
    public String getName() {
        return name;
    }

    public Bicycle(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public boolean choosingLocation(Area area) {
        if (area == PLAIN || area == Area.DENSE_FOREST) {
            System.out.println("Велосипед подходит для местности " + area);
            return true;
        }
        System.out.println("Велосипед не подходит для местности " + area);
        return false;
    }

    public boolean driveDistance(int distance) {
        if (energy >= distance) {
            energy -= distance;
            System.out.println("Человек на велосипеде проехал весь путь, осталось энергии " + energy);
            return true;
        } else {
            distance -= energy;
            System.out.println("Человек на велосипеде не проехал весь путь, осталось пройти " + distance);
            return false;
        }
    }
}