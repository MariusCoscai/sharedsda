package com.sda.java8.linkedlist;

public class Application {
    public static void main(String[] args) {
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
//        list.remove(20);
//        System.out.println("Elements: " + list.print());
//        System.out.println("Elements: " + list.printReverse());
//        list.remove(50);
//        System.out.println("Elements: " + list.print());
//        System.out.println("Elements: " + list.printReverse());


        // singleLinkedList();
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
