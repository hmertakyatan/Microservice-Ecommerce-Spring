package org.ecommerceproj.customerservice.Controller.Impl;

import org.apache.http.HttpStatus;
import org.ecommerceproj.customerservice.Controller.Interfaces.ICustomerController;
import org.ecommerceproj.customerservice.Dto.Requests.CustomerRegisterRequest;
import org.ecommerceproj.customerservice.Dto.Responses.CustomerResponseDto;
import org.ecommerceproj.customerservice.Services.Impl.CustomerRegisterService;
import org.ecommerceproj.customerservice.Services.Impl.CustomerService;
import org.ecommerceproj.customerservice.Services.Interfaces.ICustomerRegisterService;
import org.ecommerceproj.customerservice.Services.Interfaces.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.UUID;
@Controller
public class CustomerController implements ICustomerController {
    private final ICustomerService customerService;
    private final ICustomerRegisterService customerRegisterService;
    @Autowired
    public CustomerController(ICustomerService customerService, ICustomerRegisterService customerRegisterService){
        this.customerService = customerService;
        this.customerRegisterService = customerRegisterService;
    }
    @Override
    public ResponseEntity<List<CustomerResponseDto>> GetCustomers(int page, int size) {
        return null;
    }

    @Override
    public ResponseEntity<CustomerResponseDto> GetCustomerById(UUID id) {
        return null;
    }

    @Override
    public ResponseEntity<HttpStatus> RegisterCustomer(String registerType, CustomerRegisterRequest registerRequest) {
        return null;
    }


    @Override
    public ResponseEntity<HttpStatus> DeleteCustomer(UUID id) {
        return null;
    }
}
