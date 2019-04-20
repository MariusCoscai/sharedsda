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
        int leftLength = middle - start + 1;
        int rightLength = end - middle;
        int[] leftArray = new int[leftLength];
        int[] rightArray = new int[rightLength];

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = array[start + i];
        }
        for (int j = 0; j < rightArray.length; j++) {
            rightArray[j] = array[middle + j + 1];
        }

        int i = 0;
        int j = 0;
        for (int k = start; k <= end; k++) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i++];
                if (i == leftLength) {
                    // Am ajuns la capat cu left, finalizam cu elemente din right
                    while (++k <= end) {
                        array[k] = rightArray[j++];
                    }
                }
            } else {
                array[k] = rightArray[j++];
                if (j == rightLength) {
                    // Am ajuns la capat cu right, finalizam cu elemente din left
                    while (++k <= end) {
                        array[k] = leftArray[i++];
                    }
                }
            }
        }

        for (i = start; i <= end; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }

}
