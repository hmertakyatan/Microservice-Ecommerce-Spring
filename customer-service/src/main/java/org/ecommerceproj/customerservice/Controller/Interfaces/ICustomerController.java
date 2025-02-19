package org.ecommerceproj.customerservice.Controller.Interfaces;

import org.apache.http.HttpStatus;
import org.ecommerceproj.customerservice.Dto.Requests.CustomerRegisterRequest;
import org.ecommerceproj.customerservice.Dto.Responses.CustomerResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/api/v1/customers")
public interface ICustomerController {
    @GetMapping
    ResponseEntity<List<CustomerResponseDto>> GetCustomers(int page, int size);
    @GetMapping("/{id}")
    ResponseEntity<CustomerResponseDto> GetCustomerById(@PathVariable UUID id);
    @PostMapping("/register/{registerType}")
    ResponseEntity<HttpStatus> RegisterCustomer(
            @PathVariable String registerType,
            @RequestBody CustomerRegisterRequest registerRequest);
    @DeleteMapping("/{id}")
    ResponseEntity<HttpStatus>DeleteCustomer(@PathVariable UUID id);

}
