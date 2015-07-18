//package com.learnlogic.system.rental.dao;
//
//import static org.junit.Assert.*;
//
//import java.util.List;
//
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.support.AnnotationConfigContextLoader;
//
//import com.learnlogic.system.rental.configuration.HibernateConfiguration;
//import com.learnlogic.system.rental.model.CustomerInfo;
//
//
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = {HibernateConfiguration.class})
//public class CustomerDaoTest {
//
//	
//	@Autowired
//	CustomerDao customerDao;
//	public CustomerDaoTest() {
//		// TODO Auto-generated constructor stub
//	}
//	
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//	}
//
//	@Before
//	public void setUp() throws Exception {
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}
////
////	@Test
////	public void testAddCustomer() {
////		fail("Not yet implemented");
////	}
////
////	@Test
////	public void testUpdateCustomer() {
////		fail("Not yet implemented");
////	}
//
//	@Test
//	public void testListCustomers() {
//		 List<CustomerInfo> result =customerDao.retrieveAll();
//	        for(CustomerInfo info: result){
//	            System.out.println("\n\t--user name "+info.getCustomerId()+info.getCustomerFname()+"\t");
//	        }
//	        System.out.println("\n\t-- size of list "+result.size());
//	    }
//	
//	}
//
////	@Test
////	public void testGetCustomerById() {
////		fail("Not yet implemented");
////	}
////
////	@Test
////	public void testRemoveCustomer() {
////		fail("Not yet implemented");
////	}
//
//
