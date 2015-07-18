package com.learnlogic.system.rental.core;
/**
 * 
 */
/**
 * @author jugal
 *
 */

import java.util.List;

import com.learnlogic.system.rental.model.CustomerInfo;


public interface CustomerService {
	 Long addCustomer(CustomerInfo p);
	 
	    void updateCustomer(CustomerInfo p);
	 
	     List<CustomerInfo> listCustomers();
	 
	    CustomerInfo getCustomerById(long id);
	 
	    void removeCustomer(long id);

}
