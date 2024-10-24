package ru.tuxuu.java.basic.homeworks.homework12;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileUtils {


    public static void filesInFolder(String path) {
        System.out.println("Найденные файлы: ");
        File dirFolder = new File(path);
        for (File fileEntry : dirFolder.listFiles()) {
            if (fileEntry.getName().lastIndexOf("txt") > 0) {
                System.out.println(fileEntry.getName());
            }
        }
    }

    public static void readFromFile(String file) throws FileNotFoundException {
        System.out.print("Содержимое файла: ");
        try (InputStreamReader in = new InputStreamReader(
                new BufferedInputStream(
                        new FileInputStream(file)))) {
            int n = in.read();
            while (n > 0) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeInFile(String text, String path)  {
        try (FileOutputStream out = new FileOutputStream(path, true)) {
            byte[] buffer = text.getBytes(StandardCharsets.UTF_8);
            out.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
