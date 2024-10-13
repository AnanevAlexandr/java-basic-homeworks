package ru.tuxuu.java.basic.homeworks.homework5.animal;

public class Dog extends Animal {
    public Dog(String name, int runSpeed, int swimSpeed, int endurance) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.endurance = endurance;
    }

    @Override
    public void swim(int distance) {
        if (endurance - distance * 2 > 0) {
            time = (float) distance / runSpeed;
            endurance -= distance * 2;
            System.out.println("Время бега " + time + " секунд, выносливость " + endurance);
        } else {
            System.out.println("Животное " + name + " устало, и не может проплыть " + distance + " метров");
        }
    }
}
