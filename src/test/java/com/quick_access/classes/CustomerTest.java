package com.quick_access.classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer("Adepa", 700);
    }

    @Test
    public void getName() {
        assertEquals("Adepa", customer.getName());
        assertNotEquals("Aseda", customer.getName());
    }

    @Test
    public void getTransactions() {
        assertEquals(700.00, customer.getTransactions().get(0), 0.0);
        assertNotEquals(150.00, customer.getTransactions().get(0), 0.0);
    }

    @Test
    public void addTransaction() {
        customer.addTransaction(500.00);
        assertEquals(2, customer.getTransactions().size());
    }
}