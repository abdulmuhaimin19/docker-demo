package com.dxc.docker.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.docker.model.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	Customer customer=new Customer(null, null, 0);
	@GetMapping("/name")
	public void customerName(Customer name) {
	
		customer.setName("minu");
			
	}
	@GetMapping("/email")
	public void customerEmail(Customer email) {
		customer.setEmail("minu@gmail.com");
	}
	@GetMapping("/mob")
	public void customerMobno(Customer mobNo) {
		customer.setMobNo(808635158);
	}
	
	
	
	
}
