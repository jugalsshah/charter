package com.learnlogic.system.rental.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate3.support.OpenSessionInterceptor;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.orm.hibernate4.support.OpenSessionInViewFilter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 */
/**
 * @author jugal
 * 
 */

@Configuration
@ComponentScan({ "com.learnlogic.system.rental" })
@PropertySource(value = { "classpath:db.properties" })
public class HibernateConfiguration {

	@Autowired
	private Environment environment;

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory
				.setPackagesToScan(new String[] { "com.learnlogic.system.rental.model" });
		sessionFactory.setHibernateProperties(hibernateProperties());
		System.out.println("sf created........................");
		System.out.println("\n\t-a-->" + sessionFactory);
		return sessionFactory;
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment
				.getRequiredProperty("jdbc.driverClassName"));
		dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
		dataSource
				.setUsername(environment.getRequiredProperty("jdbc.username"));
		dataSource
				.setPassword(environment.getRequiredProperty("jdbc.password"));
		System.out.println("ds created.........................");
		System.out.println("\n\t-+->+" + dataSource);
		return dataSource;
	}
	
//	@Bean
//	protected Session openSession(SessionFactory sessionFactory) throws DataAccessResourceFailureException {
//	    try {
//	    
//	      Session session = sessionFactory.openSession();
//	      // This line changes the default behavior
//	      return session;
//	    } catch (HibernateException ex) {
//	      throw new DataAccessResourceFailureException("Could not open Hibernate Session", ex);
//	    }
//	  }

//	@Bean
//	protected Session getSession(SessionFactory sessionFactory)
//			throws DataAccessResourceFailureException {
//		Session session = super.openSession(sessionFactory);
//		session.setFlushMode(FlushMode.AUTO);
//		return session;
//	}
//
//	@Bean
//	protected void closeSession(Session session, SessionFactory factory) {
//		session.flush();  
//		
//		super.;  
//	}
	// @Bean
	// public HibernateTemplate hibernateTemplate() throws Exception {
	// LocalSessionFactoryBean factoryBean = sessionFactory();
	// factoryBean.afterPropertiesSet();
	// System.out.println("\n\t+++b=="+factoryBean.getObject());
	// HibernateTemplate ht = new HibernateTemplate(factoryBean.getObject());
	// System.out.println("ht created..........................");
	// System.out.println("\n\t-----ht+---"+ht);
	// return ht;
	// }

	private Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect",
				environment.getRequiredProperty("hibernate.dialect"));
		properties.put("hibernate.show_sql",
				environment.getRequiredProperty("hibernate.show_sql"));
		properties.put("hibernate.format_sql",
				environment.getRequiredProperty("hibernate.format_sql"));
		
		return properties;
	}
	
	
	
	
	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory s) {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(s);
		System.out.println("htm created...........................");
		return txManager;
	}

}
