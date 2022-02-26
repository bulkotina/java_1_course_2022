package org.levelup.lesson3.Task3;

import java.util.Arrays;

public class ApplicationSort {
    public static void main(String[] args) {
        int[] arr = new int[]{-45, 5, 1, 654, 7, 0};
        ArraySorting arrSort = new ArraySorting();
       // System.out.println(Arrays.toString(
                arrSort.bubbleSort(arr);
                //));
        arrSort.printArr(arr);

    }
}
