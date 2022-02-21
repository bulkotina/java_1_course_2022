package org.levelup.lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Создать программу, выводящую на экран ближайшее к 10 из двух положительных чисел, записанных в переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числo m: ");
        int m = Math.abs(sc.nextInt());
        System.out.println("Введите числo n: ");
        int n = Math.abs(sc.nextInt());

        if ((m>10&&n>10&&n>m)||(m<10&&n<10&&m>n)||(Math.abs(10-m)<Math.abs(10-n))) {
            System.out.println("Ближайшее к 10 число: " + m);
        } else if (Math.abs(10-m) == Math.abs(10-n)) {
            System.out.println("m и n удалены от 10 одинакого");
        } else
            {
            System.out.println("Ближайшее к 10 число: " + n);
        };
    }
}
