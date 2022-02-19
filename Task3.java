package org.levelup.lesson2;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        //Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155] целое число в интервал (25;100) и сообщать результат на экран. Примеры работы программы:
        //Число 113 не содержится в интервале (25,100).
        //Число 72 содержится в интервале (25,100).
        //Число 25 не содержится в интервале (25,100)Число 155 не содержится в интервале (25,100)
        Random generator = new Random();
        System.out.print("Выберем число X: ");
        int x = generator.nextInt(151) + 5;
        System.out.println(x);

        if (x>25&&x<100) {
            System.out.println("Число " + x + " содержится в интервале (25,100)");
        } else {
            System.out.println("Число " + x + " не содержится в интервале (25,100)");
        };
    }
}
