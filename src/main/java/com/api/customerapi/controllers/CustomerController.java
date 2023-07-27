package com.api.customerapi.controllers;

import com.api.customerapi.entitys.Customer;
import com.api.customerapi.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/customers")
    public List<Customer> getCustomers() {
        List<Customer> cus = customerRepository.findAll();

        return cus;
    }

}
