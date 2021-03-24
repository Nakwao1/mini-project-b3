package com.quick_access.classes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankTest {
    private Bank bank;

    @Before
    public void setUp() throws Exception {
        bank = new Bank("National Australia Bank");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomerTransaction("Adelaide","Tim", 44.22);
        bank.listCustomers("Adelaide", true);

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addBranch() {
        assertTrue(bank.addBranch("Sydney"));
        assertFalse(bank.addBranch("Adelaide"));
    }

    @Test
    public void addCustomer() {
        assertTrue(bank.addCustomer("Adelaide", "Justin", 100.00));
        assertFalse(bank.addCustomer("Adelaide", "Tim", 50.05));
    }

    @Test
    public void addCustomerTransaction() {
        assertTrue(bank.addCustomerTransaction("Adelaide", "Tim", 54.22));
        assertFalse(bank.addCustomerTransaction("Sydney","Jerry", 44.22));
    }


    @Test
    public void listCustomers() {
        assertTrue(bank.listCustomers("Adelaide", true));
        assertFalse(bank.listCustomers("Brisbane", false ));
    }
}