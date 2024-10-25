package ru.tuxuu.java.basic.homeworks.homework14;

public class Massiv2 {
    private int elems;

    public Massiv2(int elems) {
        this.elems = elems;
    }

    public static void mas(int elems) {
        double[] mas = new double[elems];
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < mas.length / 4; i++) {
                mas[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = mas.length / 4; i < mas.length / 2; i++) {
                mas[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = mas.length / 2; i < mas.length * 3 / 4; i++) {
                mas[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread t4 = new Thread(() -> {
            for (int i = mas.length * 3 / 4; i < mas.length; i++) {
                mas[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
