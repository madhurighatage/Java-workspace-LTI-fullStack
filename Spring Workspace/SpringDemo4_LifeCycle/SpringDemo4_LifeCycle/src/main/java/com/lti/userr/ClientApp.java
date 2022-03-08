package com.lti.userr;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.lifecycle.Bean1;
import com.lti.lifecycle.Bean2;
import com.lti.lifecycle.Bean3;


//Spring provides three ways to implement the life cycle of a bean.

//Way 1 :Custom init() and destroy() methods in bean configuration file

//Way 2 :InitializingBean and DisposableBean callback interfaces

//way 3 : @PostConstruct and @PreDestroy annotations

public class ClientApp {
	
	public static void main(String[] args) {
		
	//	ApplicationContext context= new ClassPathXmlApplicationContext("spring-config.xml");
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
			
		//Bean1 b= (Bean1)context.getBean("b1");
		
	//	Bean2 b= (Bean2)context.getBean("b2");
		
		Bean3 b= (Bean3)context.getBean("b3");
		
		context.close(); 
		
	}

}




