package com.sda.java8.sort;

public class Sort {
    public static void bubbleSort(int[] array) {
        boolean executat;
        do {
            executat = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    executat = true;
                }
            }
        } while (executat);
    }

    public static void mergeSort(int[] array) {
        mergeSortRecursive(array, 0, array.length - 1);
    }

    private static void mergeSortRecursive(int[] array, int start, int end) {
        
    }

}
