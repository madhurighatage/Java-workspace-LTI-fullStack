package com.lti.lifecycle;

//using XML:
public class Bean1 {

	// This method executes
    // automatically as the bean
    // is instantiated
    public void init() throws Exception
    {       
    	System.out.println( "Bean1 instantiated --> init() method");
    }
 
    // This method executes
    // when the spring container
    // is closed
    public void destroy() throws Exception
    {
        
    	System.out.println("Container closed ---> bean 1 ->destroy() method");
    }    
	
}
