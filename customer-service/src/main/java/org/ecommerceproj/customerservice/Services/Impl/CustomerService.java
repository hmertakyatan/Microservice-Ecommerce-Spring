package org.ecommerceproj.customerservice.Services.Impl;

import org.ecommerceproj.customerservice.Entites.Customer;
import org.ecommerceproj.customerservice.Repository.CustomerRepository;
import org.ecommerceproj.customerservice.Services.Interfaces.ICustomerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.Optional;
import java.util.UUID;

public class CustomerService implements ICustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    @Override
    public Page<Customer> GetCustomers(int page, int size) {

        Pageable pageable = PageRequest.of(page,size);

        return customerRepository.findAll(pageable);

    }

    @Override
    public Optional<Customer> GetCustomerById(UUID id) {
        return customerRepository.findById(id);
    }


    @Override
    public boolean DeleteCustomerById(UUID id) {
        return false;
    }
}
