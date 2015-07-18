//package com.learnlogic.system.rental.configuration;
//
//import org.hibernate.FlushMode;
//import org.hibernate.HibernateException;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.dao.DataAccessResourceFailureException;
//import org.springframework.expression.spel.ast.OpNE;
////import org.springframework.orm.hibernate4.support.OpenSessionInViewFilter;
////import org.springframework.orm.hibernate4.support.OpenSessionInViewInterceptor;
//import org.springframework.orm.hibernate3.support.OpenSessionInViewInterceptor;
//import org.springframework.orm.hibernate3.support.OpenSessionInterceptor;
//import org.springframework.orm.hibernate3.HibernateAccessor;
////import org.springframework.web.servlet.ViewResolver;
////import org.springframework.web.servlet.config.annotation.EnableWebMvc;
////import org.springframework.web.servlet.view.InternalResourceViewResolver;
////import org.springframework.web.servlet.view.JstlView;
//
///**
// * 
// */
///**
// * @author jugal
// *
// */
//
////@Configuration
////@EnableWebMvc
//@ComponentScan(basePackages = "com.learnlogic.system.rental")
//public class CustomHibernateSessionInterceptor extends OpenSessionInViewInterceptor{
//
//	
//	
//	public CustomHibernateSessionInterceptor() {
//		// TODO Auto-generated constructor stub
//	HibernateAccessor accessor = new CustomHibernateSessionInterceptor();
//	accessor.setFlushMode(FLUSH_AUTO);
//	}
//	
//	
//	//@Bean  }
//	
////	  @Bean
////	    public ViewResolver viewResolver() {
////	        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
////	        viewResolver.setViewClass(JstlView.class);
////	        viewResolver.setPrefix("/WEB-INF/views/");
////	        viewResolver.setSuffix(".jsp");
////	        return viewResolver;
////	    }
////	     
//////	    @Bean
////	    public MessageSource messageSource() {
////	        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
////	        messageSource.setBasename("messages");
////	        return messageSource;
////	    }
//	
//}
