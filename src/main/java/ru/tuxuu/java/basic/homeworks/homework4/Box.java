package ru.tuxuu.java.basic.homeworks.homework4;

import java.util.Scanner;

public class Box {
    private int length;
    private int width;
    private int height;
    private String color;
    private String item;

    static Scanner sc = new Scanner(System.in);

    private boolean isOpen;

    public boolean isOpen() {
        return isOpen;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public Box(int length, int width, int height, String color) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void info() {
        System.out.println("Данные коробки:\nДлина: " + length + "\nШирина: " + width + "\nВысота: " + height + "\nЦвет: " + color);
    }

    public void open(boolean isOpen) {
        if (isOpen) {
            this.isOpen=isOpen;
            System.out.println("Коробка открыта");
        } else {
            System.out.println("Коробка закрыта!");
            this.isOpen=isOpen;
        }
    }

    public void input() {
        if (!isOpen) {
            System.out.println("Коробка закрыта!");
            return;
        }
        if (item == null) {
            System.out.println("Коробка пустая, положите предмет в коробку");
            item = sc.nextLine();
            System.out.println("Вы положите в коробку " + item);
        } else {
            System.out.println("В коробке лежит " + item);
        }
    }


    public void output() {
        if (!isOpen) {
            System.out.println("Коробка закрыта!");
            return;
        }
        if (item == null) {
            System.out.println("Коробка пустая");
        } else {
            System.out.println("Вы достали из коробки " + item);
            item = null;
        }
    }
}




