package ru.tuxuu.java.basic.homeworks.homework2;

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {

        int[] array = {1, 5, 6, 7, 4, 2, 4, 6};
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = {1, 2, 3, 4, 5};

//        repeatText(2,"Привет");
//        sumElementsMore5(array);
//        fillMassArg(3,array);
//        increaseByNumber(2,array);
//        sumTwoHalfMass(array);
        sumThirdMas(arr1, arr2, arr3);

    }

    /*Реализуйте метод, принимающий в качестве аргументов целое число и строку,
    и печатающий в консоль строку указанное количество раз*/
    public static void repeatText(int repeat, String text) {
        for (int i = 0; i < repeat; i++) {
            System.out.println(text);
        }
    }

    /*Реализуйте метод, принимающий в качестве аргумента целочисленный массив, суммирующий все элементы,
    значение которых больше 5, и печатающий полученную сумму в консоль. */
    public static void sumElementsMore5(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 5) {
                sum += array[i];
            }
        }
        System.out.println("Сумма чисел массива которые больше 5 равна: " + sum);
    }


    /*Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
    метод должен заполниться каждую ячейку массива указанным числом. */

    public static void fillMassArg(int a, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
        }
        System.out.println(Arrays.toString(arr));
    }

    /*Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
    увеличивающий каждый элемент которого на указанное число.*/
    public static void increaseByNumber(int a, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += a;
        }
        System.out.println(Arrays.toString(arr));
    }


    /*Реализуйте метод, принимающий в качестве аргумента целочисленный массив,
    и печатающий в консоль сумма элементов какой из половин массива больше.*/
    public static void sumTwoHalfMass(int[] arr) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sum1 += arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            sum2 += arr[i];
        }
        if (sum1 > sum2) {
            System.out.println("Сумма первой части массива больше и равна: " + sum1);
        } else if (sum2 > sum1) {
            System.out.println("Сумма второй части массива больше и равна: " + sum2);
        } else {
            System.out.println("Сумма равная");
        }
    }

    /*Реализуйте метод, принимающий на вход набор целочисленных массивов, и получающий новый
    массив равный сумме входящих; */
    public static void sumThirdMas(int[] arr, int[] arr2, int[] arr3) {

        int maxLenght = Math.max(arr.length, Math.max(arr2.length, arr3.length));
        int[] arrMax = new int[maxLenght];
        for (int i = 0; i < arr.length; i++) {
            arrMax[i] += arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arrMax[i] += arr2[i];
        }
        for (int i = 0; i < arr3.length; i++) {
            arrMax[i] += arr3[i];
        }
        System.out.println(Arrays.toString(arrMax));
    }
}
