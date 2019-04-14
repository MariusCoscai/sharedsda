package com.sda.java8.linkedlist;

public class LinkedList {
    private Node head;

    // Adds new node to the list
    void add(Node node) {
        if (head == null) {
            head = node;
            return;
        }

        Node parcurge = head;
        while (parcurge.getNextElement() != null) {
            parcurge = parcurge.getNextElement();
        }

        // Example
        // parcurge = 20|null
        // node = 40|null
        // connect node 20|Node(40)
        parcurge.setNextElement(node);
    }

    // Displays all element values of the list separated by space
    String print() {
        // Hint: same procedure of passing through the elements
        StringBuilder builder = new StringBuilder();
        for (Node nodCurent = head; nodCurent != null;
             nodCurent = nodCurent.getNextElement()) {
            builder.append(nodCurent.getValue());
            builder.append(" ");
        }
        return builder.toString();
    }
}
