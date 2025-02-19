package org.ecommerceproj.customerservice.Entites;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.ecommerceproj.customerservice.Enums.Genders;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID ID;
    private String Name;
    private String Surname;
    private String Mail;
    private String Password;
    @Enumerated(EnumType.STRING)
    private Genders gender;

}
