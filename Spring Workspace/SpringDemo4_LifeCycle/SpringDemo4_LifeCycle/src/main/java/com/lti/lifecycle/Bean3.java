package com.lti.lifecycle;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
//way 3 : Using Annotations 

public class Bean3 {	
	
    @PostConstruct
    public void init() throws Exception
    {
        System.out.println("Bean3 instantiated -->init() method");
    }
     // Annotate this method to execute it
    // when Spring container is closed
    @PreDestroy
    public void destroy() throws Exception
    {
        System.out.println("Container  closed Bean 3 ---destroy() method");
    }	
}