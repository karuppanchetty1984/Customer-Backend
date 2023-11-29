package com.customers.app.service;

import java.util.List;
import java.util.Optional;

import com.customers.app.error.CustomersNotFoundException;
import com.customers.app.model.Customers;
import com.customers.app.model.Products;
import com.customers.app.model.Orders;

public interface ICustomersService {

	// retrieve all customers from database
	public List<Customers> getAllCustomers();

	// insert new customers into database
	public Customers addCustomers(Customers customers);

	// get particular customers by their ID
	public Optional<Customers> getCustomersId(int id) throws CustomersNotFoundException;

	// update existing customers
	public Customers updateCustomers(Customers customers);

	// delete particular customers from database
	public void deleteCustomers(int id);

	// get particular customers by their product ID
	public List<Customers> getCustomersByProductsId(int productId);

	public List<Products> getAllProducts();

	public Orders addOrders(Orders orders);

	public Products addProducts(Products products);
}