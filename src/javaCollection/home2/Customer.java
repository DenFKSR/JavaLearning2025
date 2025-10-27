package javaCollection.home2;

import java.util.List;

public class Customer {
    private String email;
    private String name;
    private List<Order> orders;

    public Customer(String email, String name, List<Order> orders) {
        this.email = email;
        this.name = name;
        this.orders = orders;
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

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
