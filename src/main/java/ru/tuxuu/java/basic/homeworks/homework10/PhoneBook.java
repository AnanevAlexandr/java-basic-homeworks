package ru.tuxuu.java.basic.homeworks.homework10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PhoneBook {

    protected Map<String, List<String>> contact;

    @Override
    public String toString() {
        return contact.toString();
    }

    public PhoneBook() {
        this.contact = new HashMap<>();
    }

    public Map<String, List<String>> getContact() {
        return contact;
    }


    public void add(String name, String phoneNumber) {
        if (contact.containsKey(name)) {
            System.out.println("Такое имя уже есть. Пробую добавить номер");
            if (contact.get(name).contains(phoneNumber)) {
                System.out.println("Такой номер телефона уже есть. Добавление не нужно");
            } else {
                System.out.println("Новый номер добавлен");
                contact.get(name).add(phoneNumber);
            }
        } else {
            System.out.println("Добавил новую запись в телефонную книгу.");
            ArrayList<String> listNew = new ArrayList<>();
            listNew.add(phoneNumber);
            contact.put(name, listNew);
        }
    }

    public List<String> find(String name) {
        return contact.get(name);
    }

    public boolean containsPhoneNumber(String phoneNumber) {
        for (String name : contact.keySet()) {
            if (contact.get(name).contains(phoneNumber)) {
                System.out.println("Телефон " + phoneNumber + " есть в справочнике");
                return true;
            }
        }
        return false;
    }
}
