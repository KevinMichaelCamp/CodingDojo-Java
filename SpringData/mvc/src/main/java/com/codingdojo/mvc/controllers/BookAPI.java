package com.codingdojo.mvc.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.services.BookService;

@RestController
public class BookAPI {
	private final BookService bookService;
	
	public BookAPI(BookService bookService) {
		this.bookService = bookService;
	}
	
	@RequestMapping(value="/api/books", method=RequestMethod.GET)
	public List<Book> index() {
		return bookService.allBooks();
	}
	
	@RequestMapping(value="/api/books", method=RequestMethod.POST)
	public Book create(
			@RequestParam(value="title") String title,
			@RequestParam(value="description") String desc,
			@RequestParam(value="language") String lang,
			@RequestParam(value="pages") int pages) {
		Book book = new Book(title, desc, lang, pages);
		return bookService.createBook(book);
	}
	
	@RequestMapping(value="/api/books/{id}", method=RequestMethod.GET)
	public Book show(@PathVariable("id") Long id) {
		Book book = bookService.findBook(id);
		return book;
	}
	
	@RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
	public Book update(
			@PathVariable("id") Long id,
			@RequestParam(value="title") String title,
			@RequestParam(value="description") String desc,
			@RequestParam(value="language") String lang,
			@RequestParam(value="pages") int pages) {
		Book book = bookService.updateBook(id, title, desc, lang, pages);
		return book;
	}
	
	@RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id) {
		bookService.deleteBook(id);
	}

}
