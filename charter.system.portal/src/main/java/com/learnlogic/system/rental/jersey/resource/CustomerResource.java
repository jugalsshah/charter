package com.learnlogic.system.rental.jersey.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.learnlogic.system.rental.controller.CustomerRestService;
import com.learnlogic.system.rental.core.CustomerService;
import com.learnlogic.system.rental.dao.CustomerDao;
import com.learnlogic.system.rental.model.CustomerInfo;

/**
 * 
 */
/**
 * @author jugal
 *
 */
@Component
@Path("/new")
public class CustomerResource {
	
	@Autowired
	CustomerService customerService;

	
	
	@POST
	@Path("{id}/{fname}/{lname}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String createCustomer(@PathParam("id") long id,
			@PathParam("fname") String fname,
	@PathParam("lname") String lname
			) {
		CustomerInfo customerInfo= new CustomerInfo(id, fname, null, null, null, null, null, lname);
//		customerInfo.setCustomerId(id);
//		customerInfo.setCustomerFname(fname);
//		customerInfo.setCustomerLname(lname);
		//customerService.addCustomer(customerInfo);
//		CustomerRestService customerRestService= new CustomerRestService();
		
		
		System.out.println("id"+customerInfo.getCustomerId()+"fname"+customerInfo.getCustomerFname());
		
		CustomerRestService restService= new CustomerRestService();
		restService.setCustomerId(customerInfo.getCustomerId());
		restService.setCustomerFname(customerInfo.getCustomerFname());
		restService.setCustomerLname(customerInfo.getCustomerLname());
	restService.createCustomer(restService);
//		
		return "A new record has been created";
	}

	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<CustomerInfo> getCustomer() {
		System.out.println("hiiiiiiiiiiiiiiiiiiiiiiii");
		 List<CustomerInfo> clist= customerService.listCustomers();	
	    for(CustomerInfo info:clist){
	    	System.out.println("list::::-->"+info.getCustomerAge()+info.getCustomerEmail()+info.getCustomerFname()+info.getCustomerLname());
	    	
	    }
		return clist;
		
//		return podcastDao.getRecentPodcasts(numberDaysToLookBack);
	}
	
}
