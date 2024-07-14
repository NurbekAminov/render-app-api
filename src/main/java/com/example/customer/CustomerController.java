package com.example.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {
    private static final List<Customer> CUSTOMER = List.of(
            new Customer(1L, "john", "doe", "john@gmail.com"),
            new Customer(3L, "mary", "public", "mary@gmail.com"),
            new Customer(4L, "elon", "musk", "elon@gmail.com"),
            new Customer(5L, "dunny", "duncan", "dunny@gmail.com")
    );

    @GetMapping
    public List<Customer> findAllCustomers(){
        return CUSTOMER;
    }
}