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
        if (start < end) {
            int middle = (start + end) / 2;
            mergeSortRecursive(array, start, middle);
            mergeSortRecursive(array, middle + 1, end);
            merge(array, start, middle, end);
        }
    }

    private static void merge(int[] array, int start, int middle, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
