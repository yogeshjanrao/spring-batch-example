package com.yogeshjanrao.spring.batch.repository;

import com.yogeshjanrao.spring.batch.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
}
