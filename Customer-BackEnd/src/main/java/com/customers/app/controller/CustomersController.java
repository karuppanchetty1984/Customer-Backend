package com.customers.app.controller;

import com.customers.app.error.CustomersNotFoundException;
import com.customers.app.model.Customers;
import com.customers.app.model.Products;
import com.customers.app.service.ICustomersService;
import com.customers.app.model.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomersController {

	@Autowired
	ICustomersService customersService;

	// get all customers from database
	@GetMapping("all")
	public List<Customers> getAllCustomers()
	{
		List<Customers> customers=(List<Customers>) customersService.getAllCustomers();
		return customers;
	}

	// add new customers into database
	@PostMapping("add")
	public Customers addCustomers(@RequestBody Customers customers)
	{
		return customersService.addCustomers(customers);
	}

	// get particular customers by their ID
	@GetMapping("{id}")
	public Optional<Customers> getCustomersById(@PathVariable int id) throws CustomersNotFoundException
	{
		return customersService.getCustomersId(id);
	}

	// update customers
	@PutMapping("update")
	public Customers updateCustomers(@RequestBody Customers customers)
	{
		return customersService.updateCustomers(customers);
	}

	// delete customers
	@DeleteMapping("delete/{id}")
	public void deleteCustomers(@PathVariable int id)
	{
		customersService.deleteCustomers(id);
	}

	// get all products
	@GetMapping("products/all")
	public List<Products> getAllProducts()
	{
		List<Products> products=(List<Products>) customersService.getAllProducts();
		return products;
	}


	// get all customers from database by productsId
	@GetMapping("products/{id}")
	public List<Customers> getAllCustomersByProductsId(@PathVariable int id)
	{
		List<Customers> customers=(List<Customers>) customersService.getCustomersByProductsId(id);
		return customers;
	}

	// add new Product into database
	@PostMapping("products/add")
	public Products addProducts(@RequestBody Products products)
	{
		return customersService.addProducts(products);
	}

	// add new orders into database
	@PostMapping("orders/add")
	public Orders addOrders(@RequestBody Orders orders)
	{
		return customersService.addOrders(orders);
	}
	
}
