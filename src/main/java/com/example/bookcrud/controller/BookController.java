package com.example.bookcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookcrud.model.Book;
import com.example.bookcrud.repository.BookRepository;

@RestController
@RequestMapping("/api/v1/book")
public class BookController {
	
	@Autowired
	BookRepository bookrepo;//instance creation
	
	
//	@GetMapping("/get")
//	public String get() {
//		return "data get";
//	}
	
	@GetMapping("/get")
	public List<Book> getAll() {
		List<Book> b= bookrepo.findAll();
		return b;
	}
	
	@GetMapping("/get/{id}")
	public Book getById(@PathVariable ("id") String id ) {
		Book b1= bookrepo.findById(id).get();
		
		return b1;
	}
	
	@PostMapping("/add")
	public Book add(@RequestBody Book book) {
		bookrepo.save(book);
		return book;
	}

	@PutMapping("/update")
	public String updateByName(@PathVariable("id") String id) {
		bookrepo.findById(id);
		
		return "updated";
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable("id") String id)
	{
		bookrepo.deleteById(id);
		return "Deleted";
		
	}
}
