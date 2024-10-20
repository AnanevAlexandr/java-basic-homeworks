package ru.tuxuu.java.basic.homeworks.homework9;

import java.util.ArrayList;
import java.util.List;


public class Employee {
    private String name;
    private int age;

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

    public static List<String> nameOfEmployee(ArrayList<Employee> employee) {
        List<String> names = new ArrayList<>();
        System.out.println("Имена сотрудников: ");
        for (Employee nam : employee) {
            names.add(nam.getName());
        }
        System.out.println(names);
        return names;
    }

    public static List<String> ageMoreMin(int minAge, ArrayList<Employee> employee) {
        List<String> nameEmployeeOverMinAge = new ArrayList<>();
        System.out.println("Список сотрудников, возраст которых больше либо равен " + minAge + " ");
        for (Employee nam : employee) {
            if (nam.getAge() >= minAge) {
                nameEmployeeOverMinAge.add(nam.getName());
            }
        }
        System.out.println(nameEmployeeOverMinAge);
        return nameEmployeeOverMinAge;
    }

    public static boolean sredAgeEmployee(int minSredAge, ArrayList<Employee> list) {
        Integer sumAge = 0;
        for (Employee age : list) {
            sumAge += age.getAge();
        }
        if (sumAge / list.size() >= minSredAge) {
            System.out.println("Средний возраст сотрудников больше минимального возраста");
            return true;
        } else {
            System.out.println("Средний возраст сотрудников меньше минимального возраста");
        }
        return false;
    }

    public static Employee yangEmployee(ArrayList<Employee> list) {
        Employee yang = list.get(0);
        for (Employee emp : list) {
            if (emp.getAge() < yang.getAge()) {
                yang = emp;
            }
        }
        System.out.println("Самый молодой сотрудник: " + yang.getName() + ". Его возраст: " + yang.getAge());
        return yang;
    }
}

