package com.kafkatest.demo.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
        return args -> {
            Customer testUser = new Customer(
                "testUser", 
                "desc"
            );

            customerRepository.save(testUser);
        };
    }
}
