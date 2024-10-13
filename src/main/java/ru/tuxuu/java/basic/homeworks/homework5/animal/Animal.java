package ru.tuxuu.java.basic.homeworks.homework5.animal;

public abstract class Animal {
    String name;
    int runSpeed;
    int swimSpeed;
    int endurance;
    float time;

    public void info() {
        System.out.println("Состояние животного " + name +
                ":\nСкорость бега - " + runSpeed +
                "\nСкорость плавания - " + swimSpeed +
                "\nВыносливость - " + endurance);
    }


    public void run(int distance) {
        if (endurance - distance > 0) {
            time = (float) distance / runSpeed;
            endurance -= distance;
            System.out.println("Время бега " + time + " секунд, выносливость " + endurance);
        } else {
            System.out.println("Животное " + name + " устало, и не может пробежать " + distance + " метров");
        }
    }

    public abstract void swim(int distance);

}
