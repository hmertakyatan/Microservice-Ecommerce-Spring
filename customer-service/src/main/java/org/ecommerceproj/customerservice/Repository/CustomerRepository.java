package org.ecommerceproj.customerservice.Repository;

import org.ecommerceproj.customerservice.Entites.Address;
import org.ecommerceproj.customerservice.Entites.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

import java.util.UUID;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, UUID> {

}
