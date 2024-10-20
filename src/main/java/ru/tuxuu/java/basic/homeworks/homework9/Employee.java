package ru.tuxuu.java.basic.homeworks.homework9;

import java.util.ArrayList;
import java.util.List;


public class Employee {
    private String name;
    private int age;

    @Override
    public String toString() {
        return name + " " + age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

