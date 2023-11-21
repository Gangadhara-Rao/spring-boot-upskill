package com.example.springbootPostgres.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springbootPostgres.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

}
