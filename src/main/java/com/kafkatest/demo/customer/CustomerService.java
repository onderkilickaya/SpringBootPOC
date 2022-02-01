package com.kafkatest.demo.customer;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository)
    {
        this.customerRepository = customerRepository;
    }

    public List<Customer> GetCustomers()
    {
        return customerRepository.findAll();               
    }
}
