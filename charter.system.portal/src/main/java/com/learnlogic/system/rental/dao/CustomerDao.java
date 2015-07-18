package com.learnlogic.system.rental.dao;
/**
 * 
 */
/**
 * @author jugal
 *
 */

import java.lang.reflect.GenericArrayType;
import java.util.List;

import com.learnlogic.system.rental.databaseConfig.GenericDao;
import com.learnlogic.system.rental.model.CustomerInfo;


public interface CustomerDao{

	Long addCustomer(CustomerInfo p);
	 
     void updateCustomer(CustomerInfo p);
 
 List<CustomerInfo> listCustomers();
 
   CustomerInfo getCustomerById(long id);
 
    void removeCustomer(long id);
	
}
