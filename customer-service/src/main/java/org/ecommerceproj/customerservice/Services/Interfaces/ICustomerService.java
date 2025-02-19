package org.ecommerceproj.customerservice.Services.Interfaces;

import org.ecommerceproj.customerservice.Entites.Customer;
import org.springframework.data.domain.Page;

import java.util.Optional;
import java.util.UUID;

public interface ICustomerService {
    Page<Customer> GetCustomers(int page, int size);
    Optional<Customer> GetCustomerById(UUID id);
    boolean DeleteCustomerById(UUID id);


}
