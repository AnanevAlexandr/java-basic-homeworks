package ru.tuxuu.java.basic.homeworks.homework14;

public class HomeWork14 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        Massiv.mas(100000000);
        System.out.println("Задача 1 выполнена за " + (System.currentTimeMillis() - time) + " миллисекунд");

        long time2 = System.currentTimeMillis();
        Massiv2.mas(100000000);
        System.out.println("Задача 2 выполнена за " + (System.currentTimeMillis() - time2) + " миллисекунд");
    }
}
