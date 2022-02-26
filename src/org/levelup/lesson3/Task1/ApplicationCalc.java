package org.levelup.lesson3.Task1;

public class ApplicationCalc {
    public static void main(String[] args) {
        long longMax = 10L;
        long longMin = 20L;

        Calculator calculator = new Calculator();
        System.out.println("Integer sum: " + calculator.sum(4,5));
        System.out.println("double sum: " + calculator.sum(4.5,5.5));
        System.out.println("long sum: " + calculator.sum(longMax,longMin));
        System.out.println();

        System.out.println("Integer diff: " + calculator.diff(4,5));
        System.out.println("double diff: " + calculator.diff(4.5,5.5));
        System.out.println("long diff: " + calculator.diff(longMax,longMin));
        System.out.println();

        System.out.println("Integer multy: " + calculator.multy(4,5));
        System.out.println("double multy: " + calculator.multy(4.5,5.5));
        System.out.println("long multy: " + calculator.multy(longMax,longMin));
        System.out.println();

        System.out.println("Integer div: " + calculator.div(4,5));
        System.out.println("double div: " + calculator.div(4.5,5.5));
        System.out.println("long div: " + calculator.div(longMax,longMin));
        

    }
}
