package com.javedrpi.aerospikedemo.services;

import com.javedrpi.aerospikedemo.model.Customer;
import com.javedrpi.aerospikedemo.repositories.AerospikeCustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerService {

    private AerospikeCustomerRepository aerospikeCustomerRepository;

    public Optional<Customer> readCustomerById(int id) {
        return aerospikeCustomerRepository.findById(id);
    }

    public void addCustomer(Customer customer) {
        aerospikeCustomerRepository.save(customer);
    }

    public void removeCustomerById(int id) {
        aerospikeCustomerRepository.deleteById(id);
    }

}
