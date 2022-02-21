package org.levelup.lesson2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.
        //Создать программу, которая переставит числа в переменных таким образом, чтобы при выводе на экран последовательность a, b и c оказалась строго возрастающей.
        //Числа в переменных a, b и c: 3, 9, -1
        //Возрастающая последовательность: -1, 3, 9
        //Числа в переменных a, b и c: 2, 4, 3
        //Возрастающая последовательность: 2, 3, 4
        //Числа в переменных a, b и c: 7, 0, -5
        //Возрастающая последовательность: -5, 0, 7
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int minAB = Math.min(a,b), mid;
        int minABC = Math.min(minAB,c);
        int max = Math.max(Math.max(a,b),c);
        if (a!= minABC && a!= max) {mid = a;}
        else if (b!= minABC && b!= max) {mid = b;}
        else {mid = c;};
        System.out.println(minABC + ", " + mid + ", " + max);
    }
}
