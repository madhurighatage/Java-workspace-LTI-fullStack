package com.lti.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//Way 2: Programatic approach 
//methods are Life cycle callback methods
//This is not a preferrable way  - depends on these interfaces 

//for detail working :refer https://www.journaldev.com/2637/spring-bean-life-cycle

public class Bean2 implements InitializingBean, DisposableBean {
 
    
   // It is init() method of  bean and it gets invoked on bean instantiation
    public void afterPropertiesSet() throws Exception
    {
        System.out.println( "Bean2 instantiated  --->init() method");
    }
     
    // called just after the container  is closed
    public void destroy() throws Exception
    {
        System.out.println("Container closed--> B2 destroyed --->destroy() method");
    }

	
	
}
