package com.learnlogic.system.rental.controller;

//import javax.validation.Valid;
/**
 * 
 */
/**
 * @author jugal
 *
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;





//import com.learnlogic.system.rental.configuration.AppConfig;
import com.learnlogic.system.rental.core.CustomerService;
import com.learnlogic.system.rental.model.CustomerInfo;


//@Controller
//@RequestMapping("/")
//public class Appcontroller {
//	 public static void main(String args[]) {
//	AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//	 
//    CustomerService service = (CustomerService) context.getBean("customerService");
//
////    CustomerInfo customerInfo= new CustomerInfo();
////    customerInfo.setCustomerId(11001L);
////    customerInfo.setCustomerFname("jatan");
////    customerInfo.setCustomerLname("parikh");
////    customerInfo.setCustomerLocation("Ahmedabad");
////    customerInfo.setCustomerPhone("9428245832");
////    customerInfo.setCustomerEmail("tapan_pp18@yahoo.com");
////    service.addCustomer(customerInfo);
//    
//    List<CustomerInfo> clist= service.listCustomers();	
//    for(CustomerInfo info:clist){
//    	System.out.println("list::::-->"+info.getCustomerAge()+info.getCustomerEmail()+info.getCustomerFname()+info.getCustomerLname());
//    	
//    }
//    
//}
//	 }
