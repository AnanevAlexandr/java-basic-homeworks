package ru.tuxuu.java.basic.homeworks.homework5.animal;

public class Cat extends Animal {
    public Cat(String name, int runSpeed, int swimSpeed, int endurance) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.endurance = endurance;
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать, выносливость не изменилась: " + endurance);
    }
}
