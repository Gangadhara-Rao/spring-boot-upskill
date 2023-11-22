package com.ganga.springweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ganga.springweb.entities.Product;
import com.ganga.springweb.repo.ProductRepository;

@RestController
public class ProductRestController {
	
	@Autowired
	ProductRepository repository;
	
	@RequestMapping(value="/product/",method=RequestMethod.GET)
	public List<Product> getProduct(){
		return repository.findAll();
	}
	
	@RequestMapping(value="/product/{id}",method=RequestMethod.GET)
	public Product getProduct(@PathVariable("id")Long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping("/product/hi")
	public Product createProduct(Product product) {
		return repository.save(product);
	}
	@PutMapping("/product/update")
	public Product updateProduct(Product product) {
		return repository.save(product);
		
	}
	@DeleteMapping("/product/{id}/")
	public void deleteProduct(@PathVariable("id")Long id) {
		 repository.deleteById(id);
	}
	
	

}
