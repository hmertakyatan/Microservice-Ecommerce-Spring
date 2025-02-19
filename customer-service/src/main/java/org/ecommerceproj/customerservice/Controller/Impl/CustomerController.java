package org.ecommerceproj.customerservice.Controller.Impl;

import org.apache.http.HttpStatus;
import org.ecommerceproj.customerservice.Controller.Interfaces.ICustomerController;
import org.ecommerceproj.customerservice.Dto.Requests.CustomerRegisterRequest;
import org.ecommerceproj.customerservice.Dto.Responses.CustomerResponseDto;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public class CustomerController implements ICustomerController {
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
