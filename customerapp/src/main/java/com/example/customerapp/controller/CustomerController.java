package com.example.customerapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.customerapp.entity.Customer;
import com.example.customerapp.repository.CustomerRepository;

@Controller
public class CustomerController {

    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }
    @PostMapping("/customers/save")
    public String saveCustomer(Customer customer) {
        customerRepository.save(customer);
        return "redirect:/?success";
    }

    @GetMapping("/customer/new")
    public String showCustomerForm() {
        return "customer-form";
    }

}
