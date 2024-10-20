package ru.tuxuu.java.basic.homeworks.homework9;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtils {
    public static List<String> nameOfEmployee(ArrayList<Employee> employee) {
        List<String> names = new ArrayList<>();
        System.out.println("Имена сотрудников: ");
        for (Employee nam : employee) {
            names.add(nam.getName());
        }
        System.out.println(names);
        return names;
    }

    public static List<Employee> ageMoreMin(int minAge, ArrayList<Employee> employee) {
        List<Employee> nameEmployeeOverMinAge = new ArrayList<>();
        System.out.println("Список сотрудников, возраст которых больше либо равен " + minAge + " ");
        for (Employee nam : employee) {
            if (nam.getAge() >= minAge) {
                nameEmployeeOverMinAge.add(nam);
            }
        }
        System.out.println(nameEmployeeOverMinAge);
        return nameEmployeeOverMinAge;
    }

    public static boolean averageAgeEmployee(int minSredAge, ArrayList<Employee> list) {
        Integer sumAge = 0;
        for (Employee age : list) {
            sumAge += age.getAge();
        }
        sumAge=sumAge/list.size();
        if (sumAge >= minSredAge) {
            System.out.println("Средний возраст сотрудников "+sumAge+ ", это больше минимального возраста "+minSredAge);
            return true;
        } else {
            System.out.println("Средний возраст сотрудников "+sumAge+", это меньше минимального возраста "+minSredAge);
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
        System.out.println("Самый молодой сотрудник: " + yang);
        return yang;
    }
}
