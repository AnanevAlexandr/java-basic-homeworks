package ru.tuxuu.java.basic.homeworks.homework7;

import static ru.tuxuu.java.basic.homeworks.homework7.Area.PLAIN;

public class Horse implements Transport {
    private String name;
    private int energy;


    @Override
    public String getName() {
        return name;
    }

    public Horse(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public boolean choosingLocation(Area area) {
        if (area == PLAIN || area == Area.DENSE_FOREST) {
            System.out.println("Лошадь подходит для местности " + area);
            return true;
        }
        System.out.println("Лошадь не подходит для местности " + area);
        return false;
    }

    public boolean driveDistance(int distance) {
        if (energy >= distance) {
            energy -= distance;
            System.out.println("Человек на лошади проскакал весь путь, осталось энергии " + energy);
            return true;
        } else {
            distance -= energy;
            System.out.println("Человек на лошади не проскакал весь путь, осталось пройти " + distance);
            return false;
        }
    }
}