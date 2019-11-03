package com.codingdojo.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepo;
	
	public BookService(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}
	
	// SERVICES
	// return all books
	public List<Book> allBooks() {
		return bookRepo.findAll();
	}
	// create a book
	public Book createBook(Book b) {
		return bookRepo.save(b);
	}
	// retrieves a book
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepo.findById(id);
		if(optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}
	// updates a book
	public Book updateBook(Book b) {
    	return bookRepo.save(b);
    }
	
	public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
    	Optional <Book> temp = bookRepo.findById(id);
    	if(temp != null) {
    		temp.get().setTitle(title);
    		temp.get().setDescription(desc);
    		temp.get().setLanguage(lang);
    		temp.get().setNumberOfPages(numOfPages);
    		
    		return bookRepo.save(temp.get());
    	}
    	return null;        
    }
	// deleted a book
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
	}
}
