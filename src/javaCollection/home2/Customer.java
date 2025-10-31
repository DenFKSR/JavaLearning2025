package javaCollection.home2;

import javaCollection.home2.enums.OrderStatus;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String email;
    private String name;
    private List<Order> orders = new ArrayList<>();


    public Customer(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    // Получение потраченной суммы клиентом всего
    public double getTotalSpent() {
        return orders.stream()
                .filter(ord -> ord.getStatus().equals(OrderStatus.PROCESSING))
                .mapToDouble(prod -> prod.getTotalPrice()).sum();

    }


}
