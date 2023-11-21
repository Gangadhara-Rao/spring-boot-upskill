package com.example.springbootPostgres.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.springbootPostgres.entity.Book;
import com.example.springbootPostgres.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookrepo;
	
	public Iterable<Book> getAllBook() {
		return bookrepo.findAll();
	}
	
	public Optional<Book> getBookById(Book book){
		return bookrepo.findById(book.getId());
	}
	
	public Book addBook(Book book) {
		return bookrepo.save(book);
	}

	public Book updateBook(Book book) {
		Optional<Book> books = bookrepo.findById(book.getId());
		books.get().setName(book.getName());
		books.get().setDescription(book.getDescription());
		return bookrepo.save(books.get());
		
	}

	public ResponseEntity<Object> deleteDataById(Book book){
		bookrepo.deleteById(book.getId());
		Optional<Book> books = bookrepo.findById(book.getId());
		if(books.isPresent())
			return generateRespose("The Book is not deleted ", HttpStatus.BAD_REQUEST, book);
		else
			return generateRespose("The Book Deleted with Id : "+book.getId() , HttpStatus.OK, book);
	}
	
	public ResponseEntity<Object> generateRespose(String message, HttpStatus st , Object responseobj){
		
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("message", message);
		map.put("Status", st.value());
		map.put("data", responseobj);
		
		return new ResponseEntity<Object> (map,st);
	}



}
