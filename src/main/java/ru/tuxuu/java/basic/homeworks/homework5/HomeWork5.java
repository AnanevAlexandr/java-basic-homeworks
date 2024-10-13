package ru.tuxuu.java.basic.homeworks.homework5;

import ru.tuxuu.java.basic.homeworks.homework5.animal.Cat;
import ru.tuxuu.java.basic.homeworks.homework5.animal.Dog;
import ru.tuxuu.java.basic.homeworks.homework5.animal.Horse;

public class HomeWork5 {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 3, 3, 100);
        Dog dog = new Dog("Bobik", 4, 5, 200);
        Horse horse = new Horse("Plotva", 10, 2, 500);
        cat.run(10);
        cat.swim(50);
        dog.run(40);
        dog.swim(30);
        horse.run(20);
        horse.swim(20);
        horse.info();
    }
}
