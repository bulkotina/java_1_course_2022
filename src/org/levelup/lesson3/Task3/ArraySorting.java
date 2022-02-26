package org.levelup.lesson3.Task3;

public class ArraySorting {

    private int[] arr; //ссылка на массив

//    private void toChange(int first, int second) //метод "поменять местами стоящие рядом"
//    {
//        int one = arr[first];
//        arr[first] = arr[second];
//        arr[second] = one;
//    }

    public static int[] bubbleSort(int[] arr) {
        int one;
        boolean flag = false;
        for (int i = 1; i < arr.length; i++) {
            flag = false;
            for (int j = 0; j < arr.length-i; j++) {
                if (arr[j] > arr[j + 1]) {
                //    ArraySorting.toChange(arr[j], arr[j + 1]);
                    one = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = one;
                    flag = true;
                }

            } if (!flag) break;

        }

        return arr;
    }
    public void printArr(int[] arr) {
        for (int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}