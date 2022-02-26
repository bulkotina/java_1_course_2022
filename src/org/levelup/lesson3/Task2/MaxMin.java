package org.levelup.lesson3.Task2;

public class MaxMin {

    public static int max(int[] arr) {
        int maxx = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] > arr[i]) {
                maxx = arr[i + 1];
            }
            ;
        }
        ;
        return maxx;
    }

    public static int min(int[] arr) {
        int minn = arr[0];
        for (int j : arr) {
            if (j < minn) {
                minn = j;
            }
            ;
        }
        ;
        return minn;
    }
}
