package com.api.customerapi.services;

import com.api.customerapi.entitys.Customer;

import java.util.List;

public interface CustomerService {

    // API should be able to create, read, update, and delete customer records.
     Customer createCustomer(Customer customer);
     List<Customer> getCustomers();
     Customer getCustomerByCustomerId(String id);
     Customer updateCustomerByCustomerId(String id);
     boolean updateCustomerStatus(String status);
     boolean deleteCustomerByCustomerId(String id);
     boolean deleteCustomers();

}
