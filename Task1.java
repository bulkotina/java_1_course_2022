package org.levelup.lesson2;

import java.util.Scanner;

public class Task1 {
    //Создать программу, проверяющую и сообщающую на экран, является ли целое число записанное в переменную n, чётным либо нечётным.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ВВедите число n");
        int n = sc.nextInt();

        if (n/2 != 0 || n ==1) {
            System.out.println("Нечетное");
        } else {
            System.out.println("Четное");
        }
    }
}
