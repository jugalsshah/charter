package com.learnlogic.system.rental.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.learnlogic.system.rental.dao.CustomerDao;
import com.learnlogic.system.rental.model.CustomerInfo;
/**
 * 
 */
/**
 * @author jugal
 *
 */

@Service("customerService")
//@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	  CustomerDao customerDao;
//	  
//	    public void setCustomerDAO(CustomerDao customerDAO) {
//	        this.customerD = customerDAO;
//	    }
//	 
	    @Transactional(propagation = Propagation.REQUIRES_NEW)	    
	    public Long addCustomer(CustomerInfo c) {
	    	System.out.println("aaaaaaaaaaaa");
	      return customerDao.addCustomer(c);
	    }
	 
	    @Transactional
	    public void updateCustomer(CustomerInfo c) {
	        customerDao.updateCustomer(c);
	    }
	 
	    @Transactional
	    public List<CustomerInfo> listCustomers() {
	        return customerDao.listCustomers();
	    }
	 
	    @Transactional
	    public CustomerInfo getCustomerById(long id) {
	        return customerDao.getCustomerById(id);
	    }
	 
	    @Transactional
	    public void removeCustomer(long id) {
	        customerDao.removeCustomer(id);
	    }

	
}
