package com.quick_access.classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BranchTest {
    Branch branch;

    @Before
    public void setUp() throws Exception {
        branch = new Branch("Columbia");
        branch.newCustomer("David", 450.00);
    }

    @Test
    public void getName() {
        assertEquals("Columbia", branch.getName());
        assertNotEquals("Adelaide", branch.getName());
    }

    @Test
    public void getCustomers() {
        assertEquals("David", branch.getCustomers().get(0).getName());
        assertNotEquals("Saul", branch.getCustomers().get(0));
    }

    @Test
    public void newCustomer() {
        assertTrue(branch.newCustomer("Jesus", 250.00));

    }

    @Test
    public void addCustomerTransaction() {
        assertTrue(branch.addCustomerTransaction("David",450.00));
        assertFalse(branch.addCustomerTransaction("Lucifer",350.00));
    }
}