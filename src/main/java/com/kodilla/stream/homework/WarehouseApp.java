package com.kodilla.stream.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("Nr1"));
        warehouse.addOrder(new Order("Nr2"));
        warehouse.addOrder(new Order("Nr3"));
        warehouse.addOrder(new Order("Nr4"));
        warehouse.addOrder(new Order("Nr5"));

        try {
            Order order = warehouse.getOrder("Nr100");
            System.out.println("Znalazłem zamówienie.");
        } catch (OrderDoesntExistException e) {
            System.out.println("Nie ma takiego zamówienia.");
        }
    }
}
