package com.sda.java8;

import com.sda.java8.binarysearchtree.BinarySearchTree;
import com.sda.java8.linkedlist.DoubleLinkedList;
import com.sda.java8.linkedlist.DoubleLinkedNode;
import com.sda.java8.linkedlist.LinkedList;
import com.sda.java8.linkedlist.Node;
import com.sda.java8.sort.Sort;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int[] myArray = {2, 4, 3};
        int[] myArray2 = {6, 5, 3, 1, 8, 7, 2, 4};
        int[] generated = generate(10);

        Sort.quickSort(myArray);
        printArray(myArray);

        Sort.quickSort(myArray2);
        printArray(myArray2);

//        insertionSort();
//        mergeSort();
//        bubbleSort();

//        binarySearchTreeUsage();
//        doubleLinkedList();
//        singleLinkedList();
    }

    private static void insertionSort() {
        int[] myArray = {2, 4, 3};
        int[] myArray2 = {6, 5, 3, 1, 8, 7, 2, 4};
        int[] generated = generate(10);

//        Sort.insertionSort(myArray);
//        printArray(myArray);

//        Sort.insertionSort(myArray2);
//        printArray(myArray2);

        printArray(generated);
        Sort.insertionSort(generated);
        printArray(generated);
    }

    private static void mergeSort() {
        int[] myArray = {2, 4, 3};
        int[] myArray2 = {6, 5, 3, 1, 8, 7, 2, 4};

        Sort.mergeSort(myArray2);
//        printArray(myArray);
    }

    private static void sortRandomNumbers() {
        // Generate n random numbers, print, sort, print
        // read n from console
        // call generateMethod
        // call print
        // call sort
        // call print

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul de elemente: ");
        int n = scanner.nextInt();

        int[] myArray = generate(n);
        printArray(myArray);

        Sort.bubbleSort(myArray);
        printArray(myArray);
    }

    private static int[] generate(int n) {
        int[] array = new int[n];
        // for each element = random();
        for (int i = 0; i < array.length; i++) {
//            Random random = new Random();
//            array[i] = random.nextInt(100);


            int generated = (int) (n * Math.random());

            // array: 2 5 7 X X
            // index: 0 1 2 3 4: i = 3
            // verif: 0 1 2 3 4 - j
            int j = 0;
            while (j < i) {
                if (generated == array[j]) {
                    j = 0;
                    generated = (int) (n * Math.random());
                } else { // solves the issue that j restarts from 0 and avoid j++
                    j++;
                }
            }


            array[i] = generated;
        }

        return array;
    }

    private static void bubbleSort() {
        int[] myArray = {2, 4, 3};
        int[] myArray2 = {6, 5, 3, 1, 8, 7, 2, 4};

        Sort.bubbleSort(myArray);
        Sort.bubbleSort(myArray2);

        printArray(myArray);
        printArray(myArray2);

//        sortRandomNumbers();

    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void binarySearchTreeUsage() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(40);
        bst.add(50);
        bst.add(30);
        bst.add(20);
        bst.add(35);
        bst.add(32);


//        for(int i=0; i< 10000; i++) {
//            bst.add(i);
//        }

        bst.printInOrder();
        System.out.println();
        bst.printPreOrder();
        System.out.println();
        bst.printPostOrder();
    }

    private static void doubleLinkedList() {
        DoubleLinkedNode node1 = new DoubleLinkedNode(20);
        DoubleLinkedNode node2 = new DoubleLinkedNode(40);
        DoubleLinkedNode node3 = new DoubleLinkedNode(50);
        DoubleLinkedNode node4 = new DoubleLinkedNode(30);

        DoubleLinkedList list = new DoubleLinkedList();
        list.add(node1);
        list.add(node2);
        list.add(node3);
        list.add(node4);

        System.out.println("Elements: " + list.print());
        System.out.println("Elements: " + list.printReverse());
        list.remove(40);
        System.out.println("Elements: " + list.print());
        System.out.println("Elements: " + list.printReverse());
        list.remove(30);
        System.out.println("Elements: " + list.print());
        System.out.println("Elements: " + list.printReverse());
        list.remove(20);
        System.out.println("Elements: " + list.print());
        System.out.println("Elements: " + list.printReverse());
        list.remove(50);
        System.out.println("Elements: " + list.print());
        System.out.println("Elements: " + list.printReverse());

        // If we add the existing node4 we will get all the previous links of that node
        // Multiple ways to fix it:
        // * keep all the nodes inside the class LinkedList and add ints
        // * always send new nodes
        // * always set the links of the removed node to null
        list.add(new DoubleLinkedNode(30));
        System.out.println("Elements: " + list.print());
        System.out.println("Elements: " + list.printReverse());
    }

    private static void singleLinkedList() {
        Node node1 = new Node(20);
        Node node2 = new Node(40);
        Node node3 = new Node(50);
        Node node4 = new Node(30);

        LinkedList list = new LinkedList();
        list.add(node1);
        list.add(node2);
        list.add(node3);
        list.add(node4);
        System.out.println(list.print());

        // TODO: remove 40, print, remove 30, print, remove 20, print
        list.remove(40);
        System.out.println("Elements: " + list.print());
        list.remove(30);
        System.out.println("Elements: " + list.print());
        list.remove(20);
        System.out.println("Elements: " + list.print());
        list.remove(50);
        System.out.println("Elements: " + list.print());
    }
}
