package com.kafkatest.demo.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;

@Entity
@Table
public class Customer
{
    @Id
    @SequenceGenerator(
        name = "customer_squence",
        sequenceName = "customer_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "customer_squence"
    )
    @Getter public Integer id;

    @Column(length = 500)
    @Getter public String name;
 
    @Column(length = 2000)
    @Getter public String description;

    public Customer()
    {

    }

    public Customer(String name, String description)
    {
        this.name = name;
        this.description = description;
    }
}   