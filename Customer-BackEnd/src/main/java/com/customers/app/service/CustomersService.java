package com.customers.app.service;

import java.util.List;
import java.util.Optional;

import com.customers.app.error.CustomersNotFoundException;
import com.customers.app.model.Customers;
import com.customers.app.model.Products;
import com.customers.app.repository.CustomersRepository;
import com.customers.app.repository.OrdersRepository;
import com.customers.app.model.Orders;
import com.customers.app.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomersService implements ICustomersService {

	@Autowired
	CustomersRepository customersRepository;

	@Autowired
	OrdersRepository ordersRepository;

	@Autowired
	ProductsRepository productsRepository;

	// retrieve all customers from database
	public List<Customers> getAllCustomers()
	{
		List<Customers> customers=(List<Customers>) customersRepository.findAll();
		return customers;
	}

	// insert new customers into database
	public Customers addCustomers(Customers Customers)
	{
		return customersRepository.save(Customers);
	}

	// get particular Customers by their ID
	public Optional<Customers> getCustomersId(int id) throws CustomersNotFoundException {

		Optional<Customers> customers =
				customersRepository.findById(id);

		if(!customers.isPresent()) {
			throw new CustomersNotFoundException("Customers Not Available");
		}
		return customers;
	}

	// update existing Customers
	public Customers updateCustomers(Customers Customers)
	{

		return customersRepository.save(Customers);
	}

	// delete particular Customers from database
	public void deleteCustomers(int id)
	{
		customersRepository.deleteById(id);
	}

	// get particular Customers by their products ID
	public List<Customers> getCustomersByProductsId(int productsId)
	{
		List<Integer> customersIdList = ordersRepository.findAllCustomersByProductId(productsId);
		List<Customers> Customers=(List<Customers>) customersRepository.findAllById(customersIdList);
		return Customers;
	}

	// get particular Customers by their products ID
	public List<Products> getAllProducts()
	{
		List<Products> products=(List<Products>) productsRepository.findAll();
		return products;
	}

	// register products for Customers into database
	public Orders addOrders(Orders orders)
	{
		return ordersRepository.save(orders);
	}

	// register products into database
	public Products addProducts(Products products)
	{
		return productsRepository.save(products);
	}
}
