package org.levelup.lesson2;

public class Task7 {
    public static void main(String[] args) {
        //Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 …
        int count = 1, x = 1;
        System.out.print(x + " ");
        while (count<=55) {
            x = x + 2;
            System.out.print(x + " ");
            count = count + 1;
        };
    }
}
