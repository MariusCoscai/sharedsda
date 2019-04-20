package com.sda.java8;

import com.sda.java8.binarysearchtree.BinarySearchTree;
import com.sda.java8.linkedlist.DoubleLinkedList;
import com.sda.java8.linkedlist.DoubleLinkedNode;
import com.sda.java8.linkedlist.LinkedList;
import com.sda.java8.linkedlist.Node;
import com.sda.java8.sort.Sort;

public class Application {
    public static void main(String[] args) {

        // Generate n random numbers, print, sort, print
        // read n from console
        // call generateMethod
        // call print
        // call sort
        // call print

        int[] myArray = generate();

//        bubbleSort();
//        binarySearchTreeUsage();
//        doubleLinkedList();
//        singleLinkedList();
    }

    private static int[] generate() {
        int[] array = new int[100];
        // for each element = random();
        return array;
    }

    private static void bubbleSort() {
        int[] myArray = {2, 4, 3};
        int[] myArray2 = {6, 5, 3, 1, 8, 7, 2, 4};

        Sort.bubbleSort(myArray);
        Sort.bubbleSort(myArray2);

        printArray(myArray);
        printArray(myArray2);
    }

    private static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
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
