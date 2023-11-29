package com.customers.app.repository;

import com.customers.app.model.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<Products, Integer>{

}
