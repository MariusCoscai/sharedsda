package com.sda.java8.linkedlist;

public class DoubleLinkedNode {
    private final int value;
    private DoubleLinkedNode nextElement;
    private DoubleLinkedNode previousElement;

    public DoubleLinkedNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public DoubleLinkedNode getNextElement() {
        return nextElement;
    }

    public void setNextElement(DoubleLinkedNode nextElement) {
        this.nextElement = nextElement;
    }

    public DoubleLinkedNode getPreviousElement() {
        return previousElement;
    }

    public void setPreviousElement(DoubleLinkedNode previousElement) {
        this.previousElement = previousElement;
    }
}
