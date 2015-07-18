//package com.learnlogic.system.rental.databaseConfig;
//
//import javax.sql.DataSource;
//
//
//import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
//
//import com.learnlogic.system.rental.configuration.HibernateConfiguration;
//
//public class HibernateConfigurationTest{
//
//public HibernateConfigurationTest() {
//	// TODO Auto-generated constructor stub
//}
//	protected static void setUpBeforeClass() throws Exception {
//	}
//
//	protected static void tearDownAfterClass() throws Exception {
//	}
//
//	protected void setUp() throws Exception {
//	
//	}
//
//	protected void tearDown() throws Exception {
//	
//	}
//
//	public void testSessionFactory() {
//		System.out.println("sessionFactory");
//		HibernateConfiguration instance= new HibernateConfiguration();
//		LocalSessionFactoryBean result= instance.sessionFactory();
//		System.out.println("result"+result);
//	}
//
//	public void testDataSource() {
//		System.out.println("datasource");
//		HibernateConfiguration instance= new HibernateConfiguration();
//		DataSource result=instance.dataSource();
//		System.out.println("result"+result);
//	}
//
//	public void testTransactionManager() {
//		System.out.println("transactionManager");
//		HibernateConfiguration instance= new HibernateConfiguration();
////		HibernateTransactionManager result= instance.transactionManager(null);
////		System.out.println("result"+result);
//	}
//
//}
