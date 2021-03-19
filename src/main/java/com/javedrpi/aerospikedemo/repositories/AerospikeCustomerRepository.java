package com.javedrpi.aerospikedemo.repositories;

import com.javedrpi.aerospikedemo.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface AerospikeCustomerRepository extends CrudRepository<Customer, Object> {
}
