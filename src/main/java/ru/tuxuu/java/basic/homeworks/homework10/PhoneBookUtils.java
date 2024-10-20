package ru.tuxuu.java.basic.homeworks.homework10;

import java.util.ArrayList;
import java.util.List;


public class PhoneBookUtils {

    private PhoneBook book = new PhoneBook();

    public PhoneBook getBook() {
        return book;
    }

    public void add(String name, String phoneNumber) {
        if (book.contact.containsKey(name)) {
            System.out.println("Такое имя уже есть. Пробую добавить номер");
            if (book.contact.get(name).contains(phoneNumber)) {
                System.out.println("Такой номер телефона уже есть. Добавление не нужно");
            } else {
                System.out.println("Новый номер добавлен");
                book.contact.get(name).add(phoneNumber);
            }
        } else {
            System.out.println("Добавил новую запись в телефонную книгу.");
            ArrayList<String> listNew = new ArrayList<>();
            listNew.add(phoneNumber);
            book.contact.put(name, listNew);
        }
    }
    public List<String> find(String name){
        return book.contact.get(name);
    }

    public boolean containsPhoneNumber(String phoneNumber){
        for(String name: book.contact.keySet()){
            if(book.contact.get(name).contains(phoneNumber)){
                System.out.println("Телефон "+phoneNumber+" есть в справочнике");
                return true;
            }
        }
        return false;
    }
}
