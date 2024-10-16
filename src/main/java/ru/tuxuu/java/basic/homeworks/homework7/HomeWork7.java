package ru.tuxuu.java.basic.homeworks.homework7;

public class HomeWork7 {
    public static void main(String[] args) {
        Human human = new Human("Oleg");
        Car car = new Car("BMW", 110);
        Horse horse = new Horse("Plotva", 90);
        Bicycle bicycle = new Bicycle("Aist", 130);
        AllTerrain allTerrain = new AllTerrain("Cruser", 250);

        human.sitDown(car);
        human.info();
        human.standUp();
        human.standUp();
        human.info();

        human.driveLocation(allTerrain, Area.DENSE_FOREST, 180);
        human.driveLocation(bicycle, Area.SWAMP, 120);
        human.driveLocation(horse, Area.SWAMP, 70);
        human.driveLocation(car, Area.PLAIN, 100);
        human.walk(Area.PLAIN, 35);

    }
}
