package ru.tuxuu.java.basic.homeworks.homework6;

public class HomeWork6 {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 12);
        Plate plate = new Plate(50);
        plate.info();
        cat.eat(plate);
        plate.addFood();
        Cat[] cats = {
                new Cat("Murka", 10),
                new Cat("Kira", 8),
                new Cat("Sonia", 15),
                new Cat("Varia", 9),
                new Cat("Tisha", 14),
                new Cat("Nysha", 7)
        };
        plate.info();
        for (Cat allCats : cats) {
            allCats.eat(plate);
        }
        plate.addFood();
        plate.info();
        for (Cat allCats : cats) {
            allCats.info();
        }
    }
}
