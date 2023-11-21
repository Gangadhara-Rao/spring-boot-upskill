package com.demoproject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demoproject.Details;

public interface DetailsRepo  extends MongoRepository<Details, String>{

}
