package org.ecommerceproj.customerservice.Repository;

import org.ecommerceproj.customerservice.Entites.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface AdressRepository extends JpaRepository<Address, UUID> {
}
