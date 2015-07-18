package com.learnlogic.system.rental.dao;

//import org.apache.log4j.Logger;
//import java.util.logging.Logger;

//import org.hibernate.annotations.common.util.impl.LoggerFactory;
import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.learnlogic.system.rental.databaseConfig.GenericDaoImpl;
import com.learnlogic.system.rental.model.CustomerInfo;
/**
 * 
 */
/**
 * @author jugal
 *
 */

@Repository("customerDao")
public class CustomerDaoImpl extends GenericDaoImpl<CustomerInfo, Long> implements CustomerDao{

	public Long addCustomer(CustomerInfo p) {
		System.out.println("ssssssssssssss");
		return super.create(p);	
	}

	public void updateCustomer(CustomerInfo p) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	public List<CustomerInfo> listCustomers() {
		// TODO Auto-generated method stub
//		Criteria criteria = createEntityCriteria();
        return super.retrieveAll();
	}

	public CustomerInfo getCustomerById(long id) {
		// TODO Auto-generated method stub
		 return super.retrieveById(id);
	}

	public void removeCustomer(long id) {
		// TODO Auto-generated method stub
		
	}

	

	

	
	

}
