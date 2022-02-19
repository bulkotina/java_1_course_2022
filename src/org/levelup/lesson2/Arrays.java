package org.levelup.lesson2;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        double price1 = 535.34;
        double price2 = 562.36;
        double price3 = 765.45;
        double price4 = 656.45;

        double averagePrice = (price1 + price2 + price3 + price4) / 4;
        System.out.println("Average price: " + averagePrice);

        double[] prices = new double[4];
        prices[0] = price1;
        prices[1] = price2;
        prices[2] = price3;
        prices[3] = price4;

        System.out.println("prices[0]: " + prices[0]);

        for (int i = 0; i<prices.length; i++){
            System.out.println(i + " - " + prices[i]);
        }
//
        int[] array = new int[10];
        Random generator = new Random();
        for (int i = 0;i < array.length; i++){
            array[i] = generator.nextInt(100);
            System.out.println(array[i]);
        }
        int sum = 0;
        for (int i = 0; i <  array.length; i++) {
            sum = sum = array[i];
        }
        double avg =  sum / (double)array.length;
        System.out.println("Avg: " + avg);
    }
}
