package ru.tuxuu.java.basic.homeworks.homework14;

public class Massiv {
    private int elems;

    public Massiv(int elems) {
        this.elems = elems;
    }

    public static void mas(int elems) {
        double[] mas = new double[elems];
        for (int i = 0; i < elems; i++) {
            mas[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }
}
