package com.javedrpi.aerospikedemo.controllers;

import com.javedrpi.aerospikedemo.model.Customer;
import com.javedrpi.aerospikedemo.services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
public class CustomerController {

    private CustomerService customerService;

    @GetMapping("/customers/{id}")
    public Optional<Customer> readCustomerById(@PathVariable("id") Integer id) {
        return customerService.readCustomerById(id);
    }

    @PostMapping("/customers")
    public ResponseEntity<Void> addCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @DeleteMapping("/customers/{id}")
    public void removeCustomerById(@PathVariable("id") Integer id) {
        customerService.removeCustomerById(id);
    }
}
