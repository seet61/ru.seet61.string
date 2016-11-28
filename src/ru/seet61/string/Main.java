package ru.seet61.string;

import java.io.Console;

/**
 * Напишите рекурсивный метод отображающий строку задом на перед.
 * Created by dmitry.arefyev on 28.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        String string = null;

        //Подключаемся к консоли.
        Console c = System.console();
        if (c == null) {
            System.err.println("No console.");
            System.exit(1);
        }

        System.out.println("Добро пожаловать!");
        while (true) {
            string = c.readLine("Введите, пожалуйста, строку: ");
            System.out.print("Перевернутая строка: ");
            for (int i=string.length(); i>0; i--) {
                System.out.print(string.substring(i-1,i));
            }
            System.out.println();
        }
    }
}
