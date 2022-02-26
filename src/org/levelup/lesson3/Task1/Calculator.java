package org.levelup.lesson3.Task1;

import java.util.Scanner;

public class Calculator {
  //  public static void main(String[] args) {
        int a;
        int b;

        //  задача: Создать класс Calculator. У него должны быть методы:
        //  1. Сумма
        //  2. Деление
        //  3. Умножение
        //  4. Вычитание
        //  Все методы должны быть перегружены и работать с тремя типами - double, long и int. Т.е. должны быть, к примеру, по 3 метода суммы: int add(int a, int b), double add(double a, double b) и long add(long a, long b).

        public Calculator() {
        }

        public int sum (int a, int b) {return a + b ;}
        public double sum(double a, double b) {return  a + b;}
        public long sum(long a, long b) {return a + b;}


        public int diff (int a, int b) {return a - b ;}
        public double diff(double a, double b) {return  a - b;}
        public long diff(long a, long b) {return a - b;}

        public int multy (int a, int b) {return a * b ;}
        public double multy(double a, double b) {return  a * b;}
        public long multy(long a, long b) {return a * b;}

        public int div (int a, int b) { return a / b ;}
        public double div(double a, double b) {return  a / b;}
        public long div(long a, long b) {return a / b;}

        }


//}
