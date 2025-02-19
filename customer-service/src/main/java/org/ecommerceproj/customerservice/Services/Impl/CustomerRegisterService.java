package org.ecommerceproj.customerservice.Services.Impl;

import org.ecommerceproj.customerservice.Dto.Requests.CustomerRegisterRequest;
import org.ecommerceproj.customerservice.Entites.Customer;
import org.ecommerceproj.customerservice.Repository.CustomerRepository;
import org.ecommerceproj.customerservice.Services.Interfaces.ICustomerRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerRegisterService implements ICustomerRegisterService {
    private final CustomerRepository customerRepository;
    @Autowired
    public CustomerRegisterService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }


    @Override
    public boolean Register(CustomerRegisterRequest request, String registerType) {
        switch (registerType.toLowerCase()){
            case "email":
                return RegisterWithEmail(request);
        }
        return true;
    }
    private boolean RegisterWithEmail(CustomerRegisterRequest request){
        Customer customer = new Customer();
        //TODO Mail service
        customer.setMail(request.email());
        customer.setPassword(request.password());
        return true;

    }
}
