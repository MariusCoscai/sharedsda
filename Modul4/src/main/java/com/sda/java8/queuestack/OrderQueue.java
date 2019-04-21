package com.sda.java8.queuestack;

public class OrderQueue {
    private static final int MAX_SIZE = 10;
    private Order[] queue = new Order[MAX_SIZE];
    private int tail = -1;
    private int head = 0;

    void enqueue(Order val) {
        if (tail == MAX_SIZE - 1) {
            return;
        }
        tail++;
        queue[tail] = val;
        // Shift + F6 - refactor rename
    }

    Order dequeue() {
        if (head > tail) { // TODO: understand why and how it works for the initial empty queue
            System.out.println("No elements left, exiting.");
        }
        Order val = queue[head];
        head = head + 1;
        return val;
    }
}
