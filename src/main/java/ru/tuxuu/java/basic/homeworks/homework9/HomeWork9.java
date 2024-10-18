package ru.tuxuu.java.basic.homeworks.homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork9 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 2, 3, 4, 8, 9, 6, 5));
        Employee employee = new Employee("Дима",26);
        Employee employee2 = new Employee("Вова",30);
        Employee employee3 = new Employee("Кирилл",39);
        Employee employee4 = new Employee("Сергейад",26);


        minMax(0, 6);
        overFive(list);
        arrayPlus(4, list);
        replaceNumber(5, list);

        Employee.nameOfEmployee(new ArrayList<>(Arrays.asList(new Employee("Дима", 26), new Employee("Вова", 30), new Employee("Кирилл", 39))));
        Employee.ageMoreMin(30, new ArrayList<>(Arrays.asList(new Employee("Дима", 26), new Employee("Вова", 30), new Employee("Кирилл", 39))));
        Employee.sredAgeEmployee(30, new ArrayList<>(Arrays.asList(new Employee("Дима", 26), new Employee("Вова", 30), new Employee("Кирилл", 39))));
        Employee.yangEmployee(new ArrayList<>(Arrays.asList(new Employee("Дима", 26), new Employee("Вова", 30), new Employee("Кирилл", 39))));

    }

    public static List<Integer> minMax(int min, int max) {
        List<Integer> arrMinMax = new ArrayList<>();
        for (int i = 0; i < (max - min + 1); i++) {
            arrMinMax.add(i + min);
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
