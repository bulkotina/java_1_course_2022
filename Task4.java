package org.levelup.lesson2;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        //Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру.
        // Примеры работы программы: В числе 208 наибольшая цифра 8. В числе 774 наибольшая цифра 7. В числе 613 наибольшая цифра 6
        Random rm = new Random();
        int x =  rm.nextInt(101)+898;
        System.out.println(x);
        int a = x%10;
//        System.out.println(a);
        int c = x/100;
//        System.out.println(c);
        int b = (x-(c*100 + a))/10;
//        System.out.println(b);
        int max = Math.max(c,Math.max(a,b));
        System.out.println("max: " + max);
    }
}
