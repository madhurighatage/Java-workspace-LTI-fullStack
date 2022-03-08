package com.lti.employeeconsumer;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerControllerClient {

	// @Autowired
	 //RestTemplate restTemplate;


	private static HttpEntity<?> getHeaders() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public void getEmployee() throws RestClientException, IOException {

		String baseUrl = "http://localhost:8181/employee";

		// step 2: //ServiceInstance instance =
		// discoveryClient.getInstances("employee-producer").get(0); //String
		// baseUrl=instance.getUri().toString();

		// ServiceInstance serviceInstance=loadBalancer.choose("employee-producer");

		// System.out.println(serviceInstance.getUri());

		// String baseUrl=serviceInstance.getUri().toString();

		//baseUrl = baseUrl + "/employee";

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = null;
		try {
			response = restTemplate.exchange(baseUrl, HttpMethod.GET, getHeaders(), String.class);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		System.out.println(response.getBody());

	}
	

	/*
	 * @GetMapping("/employee") public List<Object> getEmployees() { RestTemplate
	 * restTemplate = new RestTemplate(); Object[] objects =
	 * restTemplate.getForObject("http://localhost:8181/employee", Object[].class);
	 * return Arrays.asList(objects); }
	 */

}


//Heartbeats are simple requests to microservice's API. Usually, for REST APIs you send GET /healthcheck,
//that should respond with HTTP status 200. If the request fails or takes awfully long,
//it means that microservice is dead or hanged, and load balancer should not direct any requests to it.


//When a client registers with Eureka, it provides meta-data about itself — such as host, port, health indicator URL, home page, and other details. Eureka receives heartbeat messages from each instance belonging to a service. 
//If the heartbeat fails over a configurable timetable, the instance is normally removed from the registry.
