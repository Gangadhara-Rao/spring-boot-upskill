package com.ganga.springweb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ganga.springweb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
