package com.amit.springMVC.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.amit.springMVC.model.Customer;

@Repository
public class CustomerDaoImp implements CustomerDao {
	
	private SessionFactory sessionFactory;
	
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public List<Customer> listAllCustomers() {
		Criteria criteria = getSession().createCriteria(Customer.class);
		return (List<Customer> )criteria.list();
	}

	public void saveOrUpdate(Customer customer) {
		getSession().saveOrUpdate(customer);
	}

	public Customer findCustomerById(int id) {
		Customer customer = (Customer) getSession().get(Customer.class, id);
		return null;
	}

	public void deleteCustomer(int id) {
		Customer customer = (Customer) getSession().get(Customer.class, id);
		getSession().delete(customer);

	}

}
