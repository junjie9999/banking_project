package com.example.rest.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.persistence.domain.Customer;
import com.example.rest.dto.CustomerDTO;
import com.example.service.CustomerService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CustomerController {
	@Autowired
	private CustomerService service;
	
	@PostMapping("addMusician")
	public CustomerDTO addMusician(@RequestBody Customer customer) {
		return service.addMusician(customer);
	}
	
	@GetMapping("/allMusicians")
	public List<CustomerDTO> getAllMusicians(){
		return service.getAllCustomer();
	}
	
	@PutMapping("/updateCustomer/{id}")
	public CustomerDTO updateCustomer(@PathVariable Long CustomerId, @RequestBody Customer customer) {
		return service.updateCustomer(CustomerId, customer);
	}
	
	@DeleteMapping("/deleteCustomer/{id}")
	public boolean deleteCustomer(@PathVariable Long CustomerId) {
		return service.deleteCustomer(CustomerId);
	}
	
	@GetMapping("/musicianById")
	public CustomerDTO readMusicianById(@PathParam("id") Long CustomerId) {
		return service.readById(CustomerId);
	}
	
	@GetMapping("/customerByName")
	public List<CustomerDTO> readMusicianByName(@PathParam("name") String username){
		return service.readByName(username);
	}

}
