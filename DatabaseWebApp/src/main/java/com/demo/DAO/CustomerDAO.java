package com.demo.DAO;

import com.demo.Entity.Customer;

import java.util.List;

public interface CustomerDAO {
    public List<Customer> getCustomers();

    void saveCustomer(Customer customer);

    Customer getCustomer(int theId);

    void delete(int theId);
}
