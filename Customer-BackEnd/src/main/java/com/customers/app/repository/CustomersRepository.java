package com.customers.app.repository;

import com.customers.app.model.Customers;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customers, Integer>{

}
