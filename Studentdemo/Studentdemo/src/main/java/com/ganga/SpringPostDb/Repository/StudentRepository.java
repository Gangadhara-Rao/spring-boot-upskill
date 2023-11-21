package com.ganga.SpringPostDb.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ganga.SpringPostDb.model.Student;

public interface StudentRepository extends MongoRepository<Student, Integer>{

}
