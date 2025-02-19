package org.ecommerceproj.customerservice.ExepctionHandler.CustomErrors;

import java.util.UUID;

public class CustomerNotFoundException extends RuntimeException{
    public CustomerNotFoundException(UUID id) {
        super("Müşteri bulunamadı ID:" + id);
    }
}
