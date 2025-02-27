package org.ecommerceproj.customerservice.Entites;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.ecommerceproj.customerservice.Enums.Genders;

import java.util.UUID;
@Data
@Getter
@Setter
@Table(name = "Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID ID;
    private String name;
    private String surname;
    private String mail;
    private String password;
    @Enumerated(EnumType.STRING)
    private Genders gender;

}
