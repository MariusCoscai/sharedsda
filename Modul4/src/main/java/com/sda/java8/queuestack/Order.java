package com.sda.java8.queuestack;

import java.util.Date;

public class Order {
    private final Date date;

    public Order(Date inputDate) {
        this.date = inputDate;
    }

    public String toString() {
        return date.toString();
    }
}
