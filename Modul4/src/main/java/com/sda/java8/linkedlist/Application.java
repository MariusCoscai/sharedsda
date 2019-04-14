package com.sda.java8.linkedlist;

import com.sda.java8.linkedlist.binarysearchtree.BinarySearchTree;

public class Application {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        bst.add(40);
        bst.add(50);
        bst.add(30);
        bst.add(20);
        bst.add(35);
        bst.add(32);

        bst.print();
//        doubleLinkedList();
//        singleLinkedList();
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
