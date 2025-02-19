package org.ecommerceproj.customerservice.Entites;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID ID;
    private String Country;
    private String City;
    private String District;
    private String Neighborhood;
    private String Street;
    private String ZipCode;
}
