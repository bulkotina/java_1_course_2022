package org.levelup.lesson2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // 1. Будем  использовать Генератор .последовательности Случайный чисел
        // 2. Считывать ввод с консоли
        // Переменная генератор с типом Random
        // nextInt(11)+10->[0,10]+10->[10;20]
        // nextInt(4) -> (0,3]
        // [-30;-17] -> nextInt(14)-30;
        // nextInt(14) - 30 -> (0;13] - 30 -> [-30;-17];
        Random generator = new Random(); // инициализация переменной generator
        int secret = generator.nextInt(4);
        //Ввод с консоли
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println(secret);
        // System.out.println(number);
        if (number == secret) {
            System.out.println("Вы угадали");
        } else {
            System.out.println("Вы ввели неправильное число!");
            if (number<secret) {
                System.out.println("Вы ввели число меньше загаданного");
            } else {
                System.out.println("Вы ввели чило больше загаданного");
            }
        };
    }
}
