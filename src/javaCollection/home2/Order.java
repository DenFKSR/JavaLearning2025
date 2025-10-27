package javaCollection.home2;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private int orderId;
    private List<Product> products;
    private LocalDate orderDate;
    private OrderStatus status; // NEW, PROCESSING, COMPLETED, CANCELLED

    public Order(int orderId, List<Product> products, LocalDate orderDate, OrderStatus status) {
        this.orderId = orderId;
        this.products = products;
        this.orderDate = orderDate;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}



 enum OrderStatus{
     NEW,
     PROCESSING,
     COMPLETED,
     CANCELLED
}
