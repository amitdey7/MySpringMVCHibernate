package com.amit.springMVC.dao;

import java.util.List;

import com.amit.springMVC.model.Customer;

public interface CustomerDao {
	
	public List<Customer> listAllCustomers();
	
	public void saveOrUpdate(Customer customer);
	
	public Customer findCustomerById(int id);
	
	public void deleteCustomer(int id);

}
