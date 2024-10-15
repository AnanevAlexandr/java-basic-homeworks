package ru.tuxuu.java.basic.homeworks.homework6;

public class Cat {
    private String name;
    private int appetit;
    private boolean isHungry;

    public boolean isHungry() {
        return isHungry=true;
    }

    public Cat(String name, int appetit) {
        this.name = name;
        this.appetit = appetit;
        this.isHungry = isHungry();
    }

    public void eat(Plate plate) {
        if (isHungry()) {
            if (plate.amountOfFood(plate.getNowFood() - appetit)) {
                plate.setNowFood(plate.getNowFood() - appetit);
                isHungry = false;
                System.out.println(name + " поел, остаток в тарелке " + plate.getNowFood());
            } else {
                System.out.println("В тарелке на хватает еды");
            }
        } else {
            System.out.println(name + " не голоден");
        }
    }

    public void info() {
        System.out.println(name + " " + (isHungry ? "голоден" : "не голоден"));
    }
}