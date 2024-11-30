package ru.tuxuu.java.basic.homeworks.homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork9 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 2, 3, 4, 8, 9, 6, 5));
        ArrayList<Employee> listOfEmployee = new ArrayList<>(Arrays.asList(
                new Employee("Дима", 26),
                new Employee("Вова", 30),
                new Employee("Кирилл", 39),
                new Employee("Сергей", 22)));


        minMax(0, 6);
        overFive(list);
        arrayPlus(4, list);
        replaceNumber(5, list);

        EmployeeUtils.nameOfEmployee(listOfEmployee);
        EmployeeUtils.ageMoreMin(21, listOfEmployee);
        EmployeeUtils.averageAgeEmployee(28, listOfEmployee);
        EmployeeUtils.yangEmployee(listOfEmployee);

    }

    public static List<Integer> minMax(int min, int max) {
        List<Integer> arrMinMax = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            arrMinMax.add(i);
        }
        System.out.println(arrMinMax);
        return arrMinMax;
    }

    public static int overFive(List<Integer> list) {
        int sum = 0;
        for (Integer number : list)
            if (number > 5) {
                sum += number;
            }
        System.out.println(sum);
        return sum;
    }

    public static List<Integer> replaceNumber(int number, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, number);
        }
        System.out.println(list);
        return list;
    }

    public static List<Integer> arrayPlus(int number, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + number);
        }
        System.out.println(list);
        return list;
    }


}
