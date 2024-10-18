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

    public static List<Employee> yangEmployee(ArrayList<Employee> list) {
        List<Employee> yang = new ArrayList<>();
        int minAge = list.get(0).getAge();
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (minAge >= list.get(i).getAge()) {
                index = i;
            }
        }
        System.out.println("Имя и возраст самого молодого сотрудника: " +
                list.get(index).getName() + " " + list.get(index).getAge());
        yang.add(list.get(index));
        return yang;
    }
}

