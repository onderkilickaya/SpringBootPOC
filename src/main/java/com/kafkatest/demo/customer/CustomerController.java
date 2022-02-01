package com.kafkatest.demo.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/customer")
public class CustomerController
{
	private final CustomerService customerService;

	@Autowired
	public CustomerController(CustomerService customerService)
	{
		this.customerService = customerService;
	}

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer create(@RequestBody Customer customer)
    {
        return new Customer(null, null);
    }

    @GetMapping
	public List<Customer> GetCustomers()
	{
		return customerService.GetCustomers();
	}
}