package com.api.customerapi.services;

import com.api.customerapi.entitys.Customer;
import com.api.customerapi.repositories.CustomerRepository;
import com.api.customerapi.utils.CustomIdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class InsertDataService {

    @Autowired
    private CustomerRepository customerRepository;

    String[] firstName = {"deb","hon","kong","sok","len","koko","yim","poc","pov","onni","ly","bobo","cam","vor","jean"};
    String[] lastName = {"bunhor","konla","haha","tyto","gomen","reak","smei","ponleur","klean","orang","popody","cut","blac","gree","jojo"};



    public List<Customer> insertDefaultData(){
        List<Customer> customers = new ArrayList<>();
        for (int i=0; i<15; i++) {
            Customer customer = new Customer();
            customer.setCustomerId(CustomIdGenerator.generateIdRandomSixDigit());
            customer.setFirstName(firstName[i]);
            customer.setLastName(lastName[i]);
            customer.setUsername(lastName[i]);
            customer.setCreatedDate(LocalDateTime.now());

            customers.add(customer);
        }
        return customerRepository.saveAll(customers);
    }



}
