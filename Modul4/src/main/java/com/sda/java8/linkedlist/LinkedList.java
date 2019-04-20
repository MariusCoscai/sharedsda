package com.sda.java8.linkedlist;

public class LinkedList {
    private Node head;

    // Adds new node to the list
    public void add(Node node) {
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

    public void remove(int value) {
        // Example: remove last element if list contains only 2 values
//        if (head.getNextElement().getNextElement() == null) {
//            head.setNextElement(null);
//        }

        // We don't use the for because it's not explicitly doing anything
        // besides walking the list
//        for (Node nodCurent = head; nodCurent.getNextElement().getValue() == value;
//             nodCurent = nodCurent.getNextElement()) {
//        }

        // If the list is empty, we stop.
        if (head == null) {
            return;
        }

        // If the first element is the value to remove, move the head to the next element.
        if (head.getValue() == value) {
            head = head.getNextElement();
            return;
        }

        // Walk the list until we pass through all elements or we find the value.
        Node nodCurent = head;
        while (nodCurent.getNextElement() != null &&
                (nodCurent.getNextElement().getValue() != value)) {
            nodCurent = nodCurent.getNextElement();
        }

        // If we didn't find the element, end.
        if (nodCurent.getNextElement() == null) {
            return;
        }

        // Remove the element.
        nodCurent.setNextElement(nodCurent.getNextElement().getNextElement());
    }

    // Displays all element values of the list separated by space
    public String print() {
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
