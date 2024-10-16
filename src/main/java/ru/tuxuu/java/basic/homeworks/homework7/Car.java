package ru.tuxuu.java.basic.homeworks.homework7;

import static ru.tuxuu.java.basic.homeworks.homework7.Area.PLAIN;

public class Car implements Transport {
    private String name;
    private int fuel;

    public Car(String name, int fuel) {
        this.name = name;
        this.fuel = fuel;
    }

    public String getName() {
        return name;
    }

    public boolean choosingLocation(Area area) {
        if (area == PLAIN) {
            System.out.println("Автомобиль подходит для местности " + area);
            return true;
        }
        System.out.println("Автомобиль не подходит для местности " + area);
        return false;
    }

    public boolean driveDistance(int distance) {
        if (fuel >= distance) {
            fuel -= distance;
            System.out.println("Человек на автомобиле проехал весь путь, осталось топлива " + fuel);
            return true;
        } else {
            distance -= fuel;
            System.out.println("Человек на автомобиле не проехал весь путь, осталось пройти " + distance);
            return false;
        }
    }
}