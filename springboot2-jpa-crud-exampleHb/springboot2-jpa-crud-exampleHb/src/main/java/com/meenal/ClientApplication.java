package com.meenal;

//package name - com.meenal  - upper pakage name 
//other package name - com.meenal.controller  etc 
//now no need to mention each package name in componantScan annotation 

//http://localhost:8080//api/v1/employees


//check with package name 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//8080 port already in use error - >  server.port = 8090  //netstat -a gives list of running ports

@SpringBootApplication
public class ClientApplication   {

	public static void main(String[] args) {		
		SpringApplication.run(ClientApplication.class, args);
	}	
} 
