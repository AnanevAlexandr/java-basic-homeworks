package ru.tuxuu.java.basic.homeworks.homework2;

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {

        int[] array = {1,5,6,7,4,2,4,6};
        int[] arr1={1,2,3};
        int[] arr2={1,2,3,4};
        int[] arr3={1,2,3,4,5};

//        repeatText(2,"Привет");
//        sumElementsMore5(array);
//        fillMassArg(3,array);
//        increaseByNumber(2,array);
//        sumTwoHalfMass(array);
//        sumThirdMas(arr1,arr2,arr3);

    }
    /*Реализуйте метод, принимающий в качестве аргументов целое число и строку,
    и печатающий в консоль строку указанное количество раз*/
    public static void repeatText(int repeat, String text){
        for (int i = 0; i < repeat; i++) {
            System.out.println(text);
        }
    }

    /*Реализуйте метод, принимающий в качестве аргумента целочисленный массив, суммирующий все элементы,
    значение которых больше 5, и печатающий полученную сумму в консоль. */
    public static void sumElementsMore5(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>=5){
                sum+=array[i];
            }
        }
        System.out.println("Сумма чисел массива которые больше 5 равна: "+sum);
    }


    /*Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
    метод должен заполниться каждую ячейку массива указанным числом. */

    public static void fillMassArg(int a, int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=a;
        }
        System.out.println(Arrays.toString(arr));
    }

    /*Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
    увеличивающий каждый элемент которого на указанное число.*/
    public static void increaseByNumber(int a, int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]+=a;
        }
        System.out.println(Arrays.toString(arr));
    }


    /*Реализуйте метод, принимающий в качестве аргумента целочисленный массив,
    и печатающий в консоль сумма элементов какой из половин массива больше.*/
    public static void sumTwoHalfMass(int[] arr){
        int sum1=0;
        int sum2=0;
        for (int i = 0; i < arr.length/2; i++) {
            sum1+=arr[i];
        }
        for (int i = arr.length/2; i < arr.length; i++) {
            sum2+=arr[i];
        }
        if(sum1>sum2){
            System.out.println("Сумма первой части массива больше и равна: "+sum1);
        }else if(sum2>sum1){
            System.out.println("Сумма второй части массива больше и равна: "+sum2);
        } else {
            System.out.println("Сумма равная");
        }
    }

    /*Реализуйте метод, принимающий на вход набор целочисленных массивов, и получающий новый
    массив равный сумме входящих; */
    public static void sumThirdMas(int[] arr, int[] arr2, int[] arr3){
        int[] arrMax;
        if(arr.length>arr2.length && arr.length> arr3.length){
            arrMax=arr;
        }else if(arr2.length> arr.length && arr2.length>arr3.length){
            arrMax=arr2;
        }else{ arrMax=arr3;
        }
        int[] arrMin;
        if (arr.length < arr2.length && arr.length < arr3.length) {
            arrMin = arr;
        } else if (arr2.length < arr.length && arr2.length < arr3.length) {
            arrMin = arr2;
        } else {
            arrMin = arr3;
        }
        int[] arrSred;
        if(arr.length>arrMin.length && arr.length<arrMax.length){
            arrSred=arr;
        }else if(arr2.length> arrMin.length && arr2.length< arrMax.length){
            arrSred=arr2;
        }else{ arrSred=arr3;}

        for (int i = 0; i < arrMin.length; i++) {
            arrMax[i]=arrMin[i]+arrMax[i];
        }
        for (int i = 0; i < arrSred.length; i++) {
            arrMax[i]=arrSred[i]+arrMax[i];
        }
        System.out.println(Arrays.toString(arrMax));
    }
}
