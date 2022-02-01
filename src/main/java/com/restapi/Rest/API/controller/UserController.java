package com.restapi.Rest.API.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.Rest.API.entity.Books;
import com.restapi.Rest.API.service.BookService;

@RestController
public class UserController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public List<Books> getBooks()
	{
		return this.bookService.getBooks();
	}
	
	@GetMapping("/books/{id}")
	public Books getBookById(@PathVariable("id") int id)
	{
		return this.bookService.getBookById(id);
	}
	
	@PostMapping("/books")
	public Books insertBooks(@RequestBody Books b)
	{
		return this.bookService.insertBook(b);
	}
	
	@PutMapping("/books/{id}")
	public Books updateBook(@RequestBody Books b,@PathVariable("id") int id)
	{
		return this.bookService.updateBook(b, id);
	}
	
	@DeleteMapping("/books/{id}")
	public Books deleteBook(@PathVariable("id") int id)
	{
		return this.bookService.deleteBook(id);
	}
}
