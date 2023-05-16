package com.kodilla.stream.exception;

import com.kodilla.stream.homework.Order;
import com.kodilla.stream.homework.OrderDoesntExistException;
import com.kodilla.stream.homework.Warehouse;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {
    @Test
    public void getOrderTest() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("Nr1"));
        warehouse.addOrder(new Order("Nr2"));
        warehouse.addOrder(new Order("Nr3"));
        warehouse.addOrder(new Order("Nr4"));
        warehouse.addOrder(new Order("Nr5"));

        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("Nr100"));
    }
}
