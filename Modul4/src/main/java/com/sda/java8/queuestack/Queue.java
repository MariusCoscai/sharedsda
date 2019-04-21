package com.sda.java8.queuestack;

public class Queue {
    private static final int MAX_SIZE = 4;
    private int[] queue = new int[MAX_SIZE];
    private int tail = -1;
    private int head = 0;

    void enqueue(int val) {
        // Varianta extinsă a operației de modulo
//        if (tail == MAX_SIZE - 1) {
//            tail = 0;
//        } else {
//            tail+f+;
//        }

        // Evităm suprascrierea elementelor existente (head)
        // Dacă nu este primul element și următorul element (tail+1) se suprapune pe HEAD
        if ((tail != -1) && (((tail + 1) % MAX_SIZE) == head)) {
            return; // TODO: replace with return boolean
        }

        // Incrementăm circular indexul
        tail = (tail + 1) % MAX_SIZE;
        queue[tail] = val;
        // Shift + F6 - refactor rename
    }

    int dequeue() {
        if ( (((head + MAX_SIZE) - 1) % MAX_SIZE) == tail) { // TODO: fix to avoid indexing on not set values
            // System.out.println("No elements left, exiting.");
            return 0; // Means we cannot have values of "0" in our queue. // TODO reconsider return value
        }
        int val = queue[head];

        // Incrementăm circular indexul
        head = (head + 1) % MAX_SIZE;
        return val;
    }
}
