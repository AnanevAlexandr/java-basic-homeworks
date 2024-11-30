package ru.tuxuu.java.basic.homeworks.homework10;

public class HomeWork10 {
    public static void main(String[] args) {
        PhoneBook cont = new PhoneBook();
        cont.add("Дима", "89654321897");
        cont.add("Вася", "8-987-654-32-10");
        cont.add("Саша", "номер");
        cont.add("Саша", "8964-889-28-47");
        cont.add("Саша", "номер 574437");
        cont.add("Паша", "89654321897");
        cont.add("Леша", "89654321897");
        System.out.println(cont.getContact());
        System.out.println(cont.find("Дима"));
        cont.containsPhoneNumber("89654321897");


    }
}
