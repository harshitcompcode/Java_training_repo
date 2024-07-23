package com.graymatter;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Order implements Comparable<Order> {
    private int orderId;
    private Date orderDate;
    private List<Item> itemList;

    public Order(int orderId, Date orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Item item : itemList) {
            totalCost += item.getPrice();
        }
        return totalCost;
    }

    @Override
    public int compareTo(Order other) {
        return Double.compare(this.calculateTotalCost(), other.calculateTotalCost());
    }

    @Override
    public String toString() {
        return "Order{orderId=" + orderId + ", orderDate=" + orderDate + ", totalCost=" + calculateTotalCost() + '}';
    }

    public static void main(String[] args) {
        // Sample orders
        Order order1 = new Order(1, new Date());
        order1.addItem(new Item("Item1", 10.0));
        order1.addItem(new Item("Item2", 20.0));

        Order order2 = new Order(2, new Date());
        order2.addItem(new Item("Item3", 30.0));
        order2.addItem(new Item("Item4", 40.0));

        Order order3 = new Order(3, new Date());
        order3.addItem(new Item("Item5", 50.0));

        // List of orders
        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);

        // Find the order with the maximum total cost
        Order maxOrder = orders.stream().max(Order::compareTo).orElse(null);

        if (maxOrder != null) {
            System.out.println("Order with the maximum total cost: " + maxOrder);
        }

        // Print all orders with their total cost
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
