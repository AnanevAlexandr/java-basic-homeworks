package ru.tuxuu.java.basic.homeworks.homework4;


public class User {
    private String surname;
    private String name;
    private String patronymic;
    private int yearOfBirth;
    private String email;


    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getEmail() {
        return email;
    }

    public User(String surname, String name, String patronymic, int yearOfBirth, String email) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }


    public void info(){
        System.out.println("ФИО: "+surname+" "+name+" "+" "+patronymic);
        System.out.println("Год рождения: "+yearOfBirth);
        System.out.println("e-mail: "+email);
    }
}

