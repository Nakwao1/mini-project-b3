package com.quick_access.interfaces;


public interface IBank {
    boolean addBranch(String branchName);
    boolean addCustomer(String branchName, String customerName, double initialTransaction);
    boolean addCustomerTransaction(String branchName, String customerName, double tramsaction);
    boolean listCustomers(String branchName, boolean printTransactions);
}
