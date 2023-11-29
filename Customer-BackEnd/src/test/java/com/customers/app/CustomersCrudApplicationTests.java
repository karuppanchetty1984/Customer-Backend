package com.customers.app;

import com.customers.app.model.Customers;
import com.customers.app.repository.CustomersRepository;
import com.customers.app.service.CustomersService;
import com.customers.app.service.ICustomersService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
//@RunWith(SpringRunner.class)
class CustomersCrudApplicationTests {


//	@TestConfiguration
//	static class EmployeeServiceImplTestContextConfiguration {
//
//		@Bean
//		public CustomersService customersService() {
//			return new CustomersService();
//		}
//	}

	@MockBean
	private CustomersRepository customersRepository;

	@Autowired
	ICustomersService customersService;

	@BeforeEach
	public void setUp() {
		Customers customers=new Customers();
		customers.setCustId(1);
		customers.setEmailOffice("testemail@test.com");
		customers.setEmailPersonal("testemail@test.com");
		customers.setFirstName("TestFirstName");
		customers.setLastName("TestLastName");
		customers.setFatherName("TestFatherName");
		customers.setSpouseName("TestSpouseName");
		ArrayList listCustomers=new ArrayList<Customers>();
		listCustomers.add(customers);

		Mockito.when(customersRepository.findAll())
				.thenReturn(listCustomers);
	}

	@Test
	public void whenCustomerFindAll(){
		assertEquals(1, customersService.getAllCustomers().size());

	}




}
