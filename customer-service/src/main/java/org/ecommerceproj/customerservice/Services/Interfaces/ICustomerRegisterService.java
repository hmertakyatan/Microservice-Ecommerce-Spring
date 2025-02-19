package org.ecommerceproj.customerservice.Services.Interfaces;

import org.ecommerceproj.customerservice.Dto.Requests.CustomerRegisterRequest;

public interface ICustomerRegisterService {
    boolean Register(CustomerRegisterRequest request, String registerType);
}
