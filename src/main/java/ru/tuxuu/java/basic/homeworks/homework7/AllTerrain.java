package ru.tuxuu.java.basic.homeworks.homework7;

public class AllTerrain implements Transport {
    private String name;
    private int fuel;

    @Override
    public String getName() {
        return name;
    }

    public AllTerrain(String name, int fuel) {
        this.name = name;
        this.fuel = fuel;
    }

    public boolean choosingLocation(Area area) {
        System.out.println("Вездеход подходит для местности " + area);
        return true;
    }

    public boolean driveDistance(int distance) {
        if (fuel >= distance) {
            fuel -= distance;
            System.out.println("Человек на вездеходе проехал весь путь, осталось топлива " + fuel);
            return true;
        } else {
            distance -= fuel;
            System.out.println("Человек на вездеходе не проехал весь путь, осталось пройти " + distance);
            return false;
        }
    }
}