package ru.tuxuu.java.basic.homeworks.homework11;

public class HomeWork11 {
    public static void main(String[] args) {
        PersonDataBase employee = new PersonDataBase();
        Person person1 = new Person("Иван",Position.MANAGER, 1L);
        Person person2 = new Person("Петр",Position.DIRECTOR, 2L);
        Person person3 = new Person("Дмитрий",Position.DRIVER, 3L);
        Person person4 = new Person("Евгений",Position.ENGINEER, 4L);
        Person person5 = new Person("Алексей",Position.SENIOR_MANAGER, 5L);
        Person person6 = new Person("Николай",Position.DEVELOPER, 6L);
        Person person7 = new Person("Сергей",Position.QA, 7L);
        Person person8 = new Person("Даниил",Position.JANITOR, 8L);
        Person person9 = new Person("Василий",Position.PLUMBER, 9L);
        Person person10 = new Person("Олег",Position.BRANCH_DIRECTOR, 10L);
        Person person11 = new Person("Александр",Position.JUNIOR_DEVELOPER, 11L);

        employee.add(person1);
        employee.add(person2);
        employee.add(person3);
        employee.add(person4);
        employee.add(person5);
        employee.add(person6);
        employee.add(person7);
        employee.add(person8);
        employee.add(person9);
        employee.add(person10);
        employee.add(person11);

        System.out.println(employee);

        System.out.println(employee.findById(2L));
        System.out.println(employee.isManager(person2));
        System.out.println(employee.isEmployee(2L));





    }
}
