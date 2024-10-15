package ru.tuxuu.java.basic.homeworks.homework6;

public class Plate {
    private int maxFood;
    private int nowFood;

    private boolean isChangingFood;

    public void setNowFood(int nowFood) {
        this.nowFood = nowFood;
    }


    public Plate(int maxEat) {
        this.maxFood = maxEat;
        nowFood = maxFood;
    }

    public void addFood() {
        int food = maxFood - nowFood;
        nowFood += food;
        System.out.println("В тарелку добавлено: " + food);
    }

    public int getNowFood() {
        return nowFood;
    }

    public void info() {
        System.out.println("Количество еды в тарелке: " + nowFood);
    }

    public boolean amountOfFood(int changingFood) {
        if (changingFood >= 0) {
            this.isChangingFood = true;
            return true;
        }
        this.isChangingFood = false;
        return false;
    }
}
