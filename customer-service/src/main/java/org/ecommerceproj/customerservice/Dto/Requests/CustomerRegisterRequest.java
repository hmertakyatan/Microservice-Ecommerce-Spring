package org.ecommerceproj.customerservice.Dto.Requests;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.ecommerceproj.customerservice.Enums.Genders;

public record CustomerRegisterRequest (
     String email,
     String phone,
     String password,
     String provider,
     String providerId

){}
