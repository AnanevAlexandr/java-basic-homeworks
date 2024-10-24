package ru.tuxuu.java.basic.homeworks.homework13;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;


public class Client {

    public static void main(String[] args) throws RuntimeException, IOException {
        try (Socket socket = new Socket("localhost",8888)) {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            String str = in.readLine().trim();
            System.out.println(str);

            String str1 = in.readLine().trim();
            System.out.println(str1);
            Scanner sc = new Scanner(System.in);
            Float number1 = sc.nextFloat();
            out.write(number1 + "\n");
            out.flush();

            String str2 = in.readLine().trim();
            System.out.println(str2);
            Scanner sc1 = new Scanner(System.in);
            Float number2 = sc1.nextFloat();
            out.write(number2 + "\n");
            out.flush();

            String str3 = in.readLine().trim();
            System.out.println(str3);
            Scanner sc2 = new Scanner(System.in);
            String sing = sc2.nextLine();
            out.write(sing + "\n");
            out.flush();

            String answer = in.readLine().trim();
            System.out.println(answer);

        }
    }
}
