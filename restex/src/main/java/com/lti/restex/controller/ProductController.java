package com.lti.restex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	private ProductDAO dao=new ProductDAO();

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

	@GetMapping("/getall")
	public Product[] findAll() {
		return dao.getAll();
	}
	
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable(value="id")int pId) {
		return dao.findById(pId);
	}
	
	@PostMapping("/addproduct")
	public String addProduct(@RequestBody Product p) {
		dao.consumeJSONRequest(p);		
		return "Product added..";
	}
	
	@PutMapping("/update/{id}")
	public Product updateProd(@PathVariable(value="id") int pId, @RequestBody Product p) {
		return dao.updateProduct(pId, p);
	}
	
}
