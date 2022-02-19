package org.levelup.lesson2;

public class Arithmetic {
    public static void main(String[] args) {
        int a =35;
        int b= 4;
        int div =  a / b;
        System.out.println(div);
        double doubleDiv = a/b;
        System.out.println(doubleDiv);

        long longVar = a; //int -> long --неявное преобразование типов
        int intVar = (int)longVar; // явное преобразование типов
        System.out.println(intVar);

        double division = (double)a /b;
        System.out.println(division);

        byte bigByte = (byte)128;
        System.out.println(bigByte);
    }
}
