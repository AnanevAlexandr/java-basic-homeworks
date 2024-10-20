package ru.tuxuu.java.basic.homeworks.homework10;

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
}
