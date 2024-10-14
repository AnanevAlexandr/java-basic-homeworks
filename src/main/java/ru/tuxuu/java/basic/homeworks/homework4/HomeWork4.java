package ru.tuxuu.java.basic.homeworks.homework4;

public class HomeWork4 {
    public static void main(String[] args) {

        User[] user = new User[10];
        user[0] = new User("Аабов", "Ашот", "Арменович", 1986, "aabov@mail.ru");
        user[1] = new User("Бобров>", "Дмитрий", "Александрович", 1964, "bobr@mail.ru");
        user[2] = new User("Винокур", "Артем", "Дмитриевич", 1972, "vinokur@mail.ru");
        user[3] = new User("Гришин", "Андрей", "Данилович", 1958, "grishin@mail.ru");
        user[4] = new User("Донич", "Марк", "Ильич", 1994, "donich@mail.ru");
        user[5] = new User("Ефимов", "Олег", "Вадимович", 1949, "efimof@mail.ru");
        user[6] = new User("Жиров", "Константин", "Евгеньевич", 1980, "zhirov@mail.ru");
        user[7] = new User("Зимин", "Илья", "Алексеевич", 1977, "zimin@mail.ru");
        user[8] = new User("Иванов", "Иван", "Иванович", 1989, "ivanov@mail.ru");
        user[9] = new User("Котов", "Вадим", "Анатольевич", 1971, "kotov@mail.ru");


        for (User u : user) {
            if (2024 - u.getYearOfBirth() > 40) {
                u.info();
            }
        }


        System.out.println();
        System.out.println();
        System.out.println("Задача с коробкой");


        Box box1 = new Box(3, 3, 3, "Зеленая");
        box1.info();
        box1.setColor("Красная");
        box1.info();
        box1.open(true);
        box1.input();
        box1.open(false);
        box1.output();
        box1.open(true);
        box1.output();
    }
}

