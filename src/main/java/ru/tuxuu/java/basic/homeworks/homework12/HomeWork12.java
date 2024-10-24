package ru.tuxuu.java.basic.homeworks.homework12;


import java.io.*;
import java.util.Scanner;
import static ru.tuxuu.java.basic.homeworks.homework12.FileUtils.*;

public class HomeWork12 {
    static String path = "C:\\Users\\ACER\\Desktop\\Otus Basic\\DZ\\java-basic-hameworks\\java-basic-homeworks\\";
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {

        filesInFolder(path);


        System.out.println("Введите имя файла");
        String fileName = scanner.nextLine();
        String file = path + fileName;

        readFromFile(file);
        System.out.println();

        System.out.println("Введите фразу, для записи в файл");
        String enter = "\n" + scanner.nextLine();

        writeInFile(enter, file);

    }
}

