package org.levelup.lesson2;

public class Task9 {
    public static void main(String[] args) {
        int count = 1;
        double x = 2;
        //Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
        for (int i = 1; count < 21; i++){
            System.out.print((int)Math.pow(x,i)+" ");
            count++;
        }
            }
}
