package org.levelup.lesson2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        //Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt(), factorial = 1;
        for (int i = 1; i <=n; i++){
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
}
