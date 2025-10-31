package javaCollection.home2;

import javaCollection.home2.enums.OrderStatus;

import java.util.*;
import java.util.stream.Collectors;

import static javaCollection.home2.enums.OrderStatus.CANCELLED;
import static javaCollection.home2.enums.OrderStatus.PROCESSING;

public class OrderSystem {

    private Map<String, Customer> customers = new HashMap<>();
    ;

    public Map<String, Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Map<String, Customer> customers) {
        this.customers = customers;
    }

    public void addCustomer(Customer customer) {
        customers.put(customer.getEmail(), customer);
    }

    public void placeOrder(String email, Order order) {
        order.setStatus(PROCESSING);
        customers.get(email).addOrder(order);
    }


    // переделать??????
    public List<Order> getCustomerOrders(String email) {
        Customer customer = customers.get(email);
        String ord = customer.getOrders().toString();
        System.out.println(ord);
        return customer.getOrders();
    }


    public double getCustomerTotalSpent(String email) {
        Customer customer = customers.get(email);
        System.out.println(customer.getTotalSpent());
        return customer.getTotalSpent();
    }


    public List<Customer> getTopCustomers(int count) {
        List<Customer> sortedCustomer = new LinkedList<>();
        sortedCustomer = customers.values()
                .stream()
                .sorted(Comparator.comparingDouble(Customer::getTotalSpent).reversed())
                .limit(count).collect(Collectors.toList());
        sortedCustomer.forEach(c ->
                System.out.printf("Клиент: %s, потрачено: %.2f руб.\n", c.getName(), c.getTotalSpent()));
        return sortedCustomer.stream().limit(count).collect(Collectors.toList());
    }

    // сколько раз каждый товар был заказан
    public Map<String, Integer> getProductsStatistics() {
        Map<String, Integer> statistic = new HashMap<>();

        List<String> namesProducts = customers.values().stream()
                .flatMap(customer -> customer.getOrders().stream())
                .flatMap(order -> order.getProducts().stream())
                .map(Product::getName)
                .collect(Collectors.toList());

        for (String name : namesProducts) {
            int count = 0;
            for (int i = 0; i < namesProducts.size(); i++) {
                if (name.equals(namesProducts.get(i))) {
                    count++;
                    // System.out.println("name "+name+", NP "+namesProducts.get(i)+", count "+ count);
                    statistic.put(name, count);

                }
            }
        }
        System.out.println(statistic);
        return statistic;

    }

    public List<Order> getOrdersByStatus(OrderStatus status) {
        List<Order> orders = customers.values().stream()
                .flatMap(customer -> customer.getOrders().stream())
                .filter(order -> order.getStatus() == status).collect(Collectors.toList());
        System.out.println(orders);

        return orders;
    }

    public boolean cancelOrder(String email, int orderId) {
        List<Order> orders=customers.values().stream().filter(customer -> customer.getEmail().equals(email))
                .flatMap(customer -> customer.getOrders().stream())
                .filter(order -> order.getOrderId() == orderId)
                .filter(order -> order.getStatus()== CANCELLED).collect(Collectors.toList());

        System.out.println(orders.size()>0?true:false);

        return orders.size()>0?true:false;

    }


}
