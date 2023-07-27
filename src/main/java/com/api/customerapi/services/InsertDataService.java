package com.api.customerapi.services;

import com.api.customerapi.entitys.Customer;
import com.api.customerapi.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertDataService {

    private final CustomerRepository customerRepository;

    @Autowired
    public InsertDataService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public void insertData(){
        Customer customer = new Customer();
        customerRepository.save(customer);
    }



}
