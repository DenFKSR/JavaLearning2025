package javaCollection.home2;

import javaCollection.home2.enums.OrderStatus;

public class main {
    public static void main(String[] args) {
        OrderSystem system = new OrderSystem();

        Customer customer1 = new Customer("ivan@mail.ru", "Ivan");

        system.addCustomer(customer1);

        Product laptop = new Product("ноутбук", 50000, "Электроника");
        Product mouse = new Product("мышь", 1500, "Электроника");

        Order order1 = new Order(1);

        order1.addProduct(laptop);
        order1.addProduct(mouse);

        system.placeOrder("ivan@mail.ru", order1);
        system.getCustomerOrders("ivan@mail.ru");
        System.out.println("total spent");
        system.getCustomerTotalSpent("ivan@mail.ru");




        Customer customer2 = new Customer("petr@mail.ru", "Petr");

        system.addCustomer(customer2);

        Product laptop2 = new Product("ноутбук", 70000, "Электроника");
        Product mouse2 = new Product("мышь", 2500, "Электроника");

        Order order2 = new Order(2);

        order2.addProduct(laptop2);
        order2.addProduct(mouse2);

        system.placeOrder("petr@mail.ru", order2);

        Customer customer3 = new Customer("alex@mail.ru", "Alex");

        system.addCustomer(customer3);

        Product toothbrush1 = new Product("Зубная щетка", 250, "Гигиена");
        Product mouse3 = new Product("мышь", 2500, "Электроника");

        Order order3 = new Order(3);

        order3.addProduct(toothbrush1);
        order3.addProduct(mouse3);

        system.placeOrder("alex@mail.ru", order3);






        System.out.println("getTopCustomers");
        system.getTopCustomers(3);


        system.getProductsStatistics();

        System.out.println("STATUS");
        system.getOrdersByStatus(OrderStatus.PROCESSING);


        System.out.println("check STATUS");
        system.cancelOrder("ivan@mail.ru", 1);



    }
}
