package com.learnlogic.system.rental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.learnlogic.system.rental.configuration.HibernateConfiguration;
import com.learnlogic.system.rental.core.CustomerService;
import com.learnlogic.system.rental.core.CustomerServiceImpl;
import com.learnlogic.system.rental.model.CustomerInfo;
import com.sun.jersey.core.spi.component.AnnotatedContext;

public class CustomerRestService {

	
	
	
	@Autowired
	CustomerService customerService;
	
	
	private long customerId;
	private String customerFname;
	private String customerEmail;
	private String customerLocation;
	private String customerImage;
	private String customerAge;
	private String customerPhone;
	private String customerLname;

	
	public CustomerRestService() {
	// TODO Auto-generated constructor stub
  }	
	
	
	
	public String getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(String customerAge) {
		this.customerAge = customerAge;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
	public String getCustomerFname() {
		return customerFname;
	}
	
	public void setCustomerFname(String customerFname) {
		this.customerFname = customerFname;
	}
	
	public long getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	
	public String getCustomerImage() {
		return customerImage;
	}
	public void setCustomerImage(String customerImage) {
		this.customerImage = customerImage;
	}
	public String getCustomerLname() {
		return customerLname;
	}
	public void setCustomerLname(String customerLname) {
		this.customerLname = customerLname;
	}
	public String getCustomerLocation() {
		return customerLocation;
	}
	public void setCustomerLocation(String customerLocation) {
		this.customerLocation = customerLocation;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	
	public void createCustomer(CustomerRestService p){
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfiguration.class);
//		 
	    CustomerService service = (CustomerService) context.getBean("customerService");
	
	//	CustomerService service = .getBean("customerService");
		CustomerInfo c= new CustomerInfo();
		System.out.println(p.customerFname+"sssss"+p.customerLname+"aaaa"+p.customerId);
		c.setCustomerId(p.getCustomerId());
		c.setCustomerFname(p.getCustomerFname());
		c.setCustomerLname(p.getCustomerLname());
		service.addCustomer(c);
	}
	
}
