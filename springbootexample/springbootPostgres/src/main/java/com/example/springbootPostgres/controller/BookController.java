package com.example.springbootPostgres.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootPostgres.entity.Book;
import com.example.springbootPostgres.service.BookService;


@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/Books")
	public Iterable<Book> getAllBook() {
		return bookService.getAllBook();
	}
	
	@GetMapping("/Books/{id}")
	public Optional<Book> getBook(@PathVariable Book id) {
		return bookService.getBookById(id);
	}
	
	@PostMapping("/Books")
	public void addBook(@RequestBody Book book) {
		bookService.addBook(book);
	}
	
	@PutMapping("/Books/{id}")
	public void updateBook(@RequestBody Book book) {
		bookService.updateBook(book);
	}
	
	@DeleteMapping("/Books/{id}")
	public void deleteBook(@RequestBody Book book) {
		bookService.deleteDataById(book);
	}


}
