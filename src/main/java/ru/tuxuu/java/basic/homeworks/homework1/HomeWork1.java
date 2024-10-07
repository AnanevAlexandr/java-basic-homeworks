package ru.tuxuu.java.basic.homeworks.homework1;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {


        greetings();
        checkSign(1, -3, 4);
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint(7, 6, true);
        randomMethod();

    }

    /*Реализуйте метод greetings(), который при вызове должен отпечатать в столбец 4 слова: Hello, World, from, Java*/
    public static void greetings() {
        System.out.println("Hello \nWorld \nfrom \nJava");
    }

    /*Реализуйте метод checkSign(..), принимающий в качестве аргументов 3 int переменные a, b и c.
    Метод должен посчитать их сумму, и если она больше или равна 0,
    то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”*/
    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная = " + sum);
        } else {
            System.out.println("Сумма отрицательная = " + sum);
        }
    }

    /*Реализуйте метод selectColor() в теле которого задайте int переменную data с любым начальным значением.
    Если data меньше 10 включительно, то в консоль должно быть выведено сообщение “Красный”,
    если от 10 до 20 включительно, то “Желтый”, если больше 20 - “Зеленый”*/
    public static void selectColor() {
        System.out.print("Введите число:");
        int data = new Scanner(System.in).nextInt();
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    /*Реализуйте метод compareNumbers(), в теле которого объявите две int переменные a и b с любыми начальными значениями.
    Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”*/
    public static void compareNumbers() {
        int a = 1;
        int b = 3;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    /*Создайте метод addOrSubtractAndPrint(int initValue, int delta, boolean increment).
    Если increment = true, то метод должен к initValue прибавить delta и отпечатать в консоль результат, в противном случае - вычесть*/
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        int result;

        if (increment) {
            result = initValue + delta;
            System.out.println(result);
        } else {
            result = initValue - delta;
            System.out.println(result);
        }
    }

    /*При запуске приложения, запросите у пользователя число от 1 до 5, и после ввода выполнения метод,
    соответствующий указанному номеру со случайным значением аргументов*/
    public static void randomMethod() {
        int x;
        do {
            System.out.println("Введите число от 1 до 5");
            x = new Scanner(System.in).nextInt();
        } while (x<1 || x>5);
        if (x == 1) {
            greetings();
        } else if (x == 2) {
            checkSign((int) (Math.random() * 10-5), (int) (Math.random() * 10-8), (int) (Math.random() * 10-3));
        } else if (x == 3) {
            selectColor();
        } else if (x == 4) {
            compareNumbers();
        } else {
            addOrSubtractAndPrint((int)(Math.random() * 10), (int)(Math.random() * 10), true);
        }
    }
}
