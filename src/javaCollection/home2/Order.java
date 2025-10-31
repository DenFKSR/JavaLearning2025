package javaCollection.home2;

import javaCollection.home2.enums.OrderStatus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Order {
    private int orderId;
    private List<Product> products = new ArrayList<>();
    private LocalDate orderDate;
    private OrderStatus status; // NEW, PROCESSING, COMPLETED, CANCELLED

    public Order(int orderId) {
        this.orderId = orderId;
        this.status = OrderStatus.NEW;
        this.orderDate = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", products=" + products +
                ", orderDate=" + orderDate +
                ", status=" + status +
                '}';
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


    public void addProduct(Product product) {
        products.add(product);
    }


    public void removeProduct(Product product) {
        products.removeIf(prod -> prod.equals(product));
    }

    //Получение цены по заказу
    public Double getTotalPrice() {
        double sum2 = products.stream().mapToDouble(prod -> prod.getPrice()).sum();
        return sum2;
    }


}




