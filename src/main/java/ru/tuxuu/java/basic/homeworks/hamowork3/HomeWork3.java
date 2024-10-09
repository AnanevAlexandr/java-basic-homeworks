package ru.tuxuu.java.basic.homeworks.hamowork3;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3, 5, 4, 8}, {4, 5, 8, 9, 7, 5}};
        char[][] array2 = new char[7][7];
        int[][] arrayDiagonal = new int[5][5];


//        System.out.println(sumOfPositiveElements(array));

//        massForSquare(array2,'_');
//        Square(array2,5);
//        print2DArray(array2);

//        diagonal(arrayDiagonal);
//        print2DArray(arrayDiagonal);

//        System.out.println(findMax(array));

        randomMas(array);
        print2DArray(array);
        System.out.println(sumSecondString(array));


    }

    /*Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный массив,
    метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0*/
    public static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    /*Реализовать метод, который принимает в качестве аргумента int size и печатает в консоль квадрат
    из символов * со сторонами соответствующей длины*/
    public static void massForSquare(char[][] arr, char value) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = value;
            }
        }
    }

    public static void Square(char[][] arr, int size) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i < size && j < size) {
                    arr[i][j] = '*';
                }
            }
        }
    }

    /*Реализовать метод, принимающий в качестве аргумента квадратный двумерный целочисленный массив,
    и зануляющий его диагональные элементы (можете выбрать любую из диагоналей, или занулить обе)*/
    public static void diagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 8;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i][arr.length - 1 - i] = 8;
        }
    }

    /*Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива*/
    public static int findMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    /*Реализуйте метод, который считает сумму элементов второй строки двумерного массива,
    если второй строки не существует, то в качестве результата необходимо вернуть -1*/
    public static int sumSecondString(int[][] arr) {
        int sum = 0;
        if (arr[1].length >= 1) {
            for (int i = 0; i < arr[1].length; i++) {
                sum += arr[1][i];
            }
        } else {
            sum = -1;
        }
        return sum;
    }


    //вспомогательные методы
    public static void randomMas(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
    }


    public static void print2DArray(int[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void print2DArray(char[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}


