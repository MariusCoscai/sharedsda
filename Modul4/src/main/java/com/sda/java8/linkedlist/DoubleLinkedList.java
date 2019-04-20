package com.sda.java8.linkedlist;

public class DoubleLinkedList {
    private DoubleLinkedNode head;
    private DoubleLinkedNode tail;

    // Adds new node to the list
    public void add(DoubleLinkedNode node) {
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.setNextElement(node);
        node.setPreviousElement(tail);
        tail = node;
    }

    public void remove(int value) {
        // Example: remove last element if list contains only 2 values
//        if (head.getNextElement().getNextElement() == null) {
//            head.setNextElement(null);
//        }

        // We don't use the for because it's not explicitly doing anything
        // besides walking the list
//        for (DoubleLinkedNode nodCurent = head; nodCurent.getNextElement().getValue() == value;
//             nodCurent = nodCurent.getNextElement()) {
//        }

        // If the list is empty, we stop.
        if (head == null) {
            return;
        }

        if (head.getValue() == value && head.getNextElement() == null) {
            head = null;
            tail = null;
            return;
        }

        // If the first element is the value to remove, move the head to the next element.
        if (head.getValue() == value) {
            head = head.getNextElement();
            head.setPreviousElement(null);
            return;
        }

        // If the last element is the value to remove, move the tail to the previous element.
        if (tail.getValue() == value) {
            tail = tail.getPreviousElement();
            tail.setNextElement(null);
            return;
        }

        // Walk the list until we pass through all elements or we find the value.
        DoubleLinkedNode nodCurent = head;
        while (nodCurent.getNextElement() != null &&
                (nodCurent.getNextElement().getValue() != value)) {
            nodCurent = nodCurent.getNextElement();
        }

        // If we didn't find the element, end.
        if (nodCurent.getNextElement() == null) {
            return;
        }

        // Remove the element: disconnect the right and the left connections
        nodCurent.setNextElement(nodCurent.getNextElement().getNextElement());
        nodCurent.getNextElement().setPreviousElement(nodCurent);
    }

    // Displays all element values of the list separated by space
    public String print() {
        // Hint: same procedure of passing through the elements
        StringBuilder builder = new StringBuilder();
        for (DoubleLinkedNode nodCurent = head; nodCurent != null;
             nodCurent = nodCurent.getNextElement()) {
            builder.append(nodCurent.getValue());
            builder.append(" ");
        }
        return builder.toString();
    }

    // Displays all element values of the list separated by space, in reverse order
    public String printReverse() {
        StringBuilder builder = new StringBuilder();
        for (DoubleLinkedNode nodCurent = tail; nodCurent != null;
             nodCurent = nodCurent.getPreviousElement()) {
            builder.append(nodCurent.getValue());
            builder.append(" ");
        }
        return builder.toString();
    }
}
