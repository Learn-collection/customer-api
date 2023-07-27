package com.api.customerapi.services.serviceimp;

import com.api.customerapi.entitys.Customer;
import com.api.customerapi.services.CustomerService;

import java.util.List;

public class CustomerServiceImp implements CustomerService {
    @Override
    public Customer createCustomer(Customer customer) {
        return null;
    }

    @Override
    public List<Customer> getCustomers() {
        return null;
    }

    @Override
    public Customer getCustomerByCustomerId(String id) {
        return null;
    }

    @Override
    public Customer updateCustomerByCustomerId(String id) {
        return null;
    }

    @Override
    public boolean updateCustomerStatus(String status) {
        return false;
    }

    @Override
    public boolean deleteCustomerByCustomerId(String id) {
        return false;
    }

    @Override
    public boolean deleteCustomers() {
        return false;
    }
}
