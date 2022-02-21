package org.levelup.lesson2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        //Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n%i == 0) {
                System.out.print(i + " ");
            };
        }
    }
}
