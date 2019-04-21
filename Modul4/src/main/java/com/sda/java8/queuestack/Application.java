package com.sda.java8.queuestack;

import java.util.Date;
import java.util.LinkedList;

public class Application {

    public static void main(String[] args) {

        // Make queue great again! Circular queue!
        Queue queue = new Queue();
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(10);
        queue.enqueue(40);
        queue.enqueue(50);
        for (int i = 0; i < 5; i++) {
            System.out.print(queue.dequeue() + " ");
        }

//        useJavaStackAndQueue();
//        useQueue();
//        useStack();
    }

    private static void useJavaStackAndQueue() {
        java.util.Stack<String> javaStack = new java.util.Stack<String>();
        java.util.Queue<Order> javaQueue = new LinkedList<Order>();
        ((LinkedList<Order>) javaQueue).add(new Order(new Date()));
        System.out.println();
    }

    private static void useQueue() {
        Queue myQueue = new Queue();
        myQueue.enqueue(10);
        myQueue.enqueue(30);
        myQueue.enqueue(20);
        System.out.print(myQueue.dequeue() + " ");
        System.out.print(myQueue.dequeue() + " ");
        System.out.print(myQueue.dequeue() + " ");
        System.out.println();
    }

    private static void useStack() {
        Stack myStack = new Stack();
        myStack.push(10);
        myStack.push(30);
        myStack.push(20);
        System.out.print(myStack.pop() + " ");
        System.out.print(myStack.pop() + " ");
        System.out.print(myStack.pop() + " ");
        // System.out.print(myStack.pop());
        System.out.println();
    }
}
