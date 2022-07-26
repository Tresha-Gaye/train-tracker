package com.company.treshagayeustannycloudtrainreservation.repository;

import com.company.treshagayeustannycloudtrainreservation.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
