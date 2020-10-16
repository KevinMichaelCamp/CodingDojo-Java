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
	
	// Methods
	public List<Book> allBooks() {
		return bookRepo.findAll();
	}
	
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepo.findById(id);
		if (optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}
	
	public Book createBook(Book book) {
		return bookRepo.save(book);
	}
	
	public Book updateBook(Book book) {
		Optional<Book> temp = bookRepo.findById(book.getId());
		temp.get().setTitle(book.getTitle());
		temp.get().setDescription(book.getDescription());
		temp.get().setLanguage(book.getLanguage());
		temp.get().setPages(book.getPages());
		return bookRepo.save(temp.get());
	}
	
	public Book updateBook(Long id, String title, String desc, String lang, int pages) {
		Optional<Book> temp = bookRepo.findById(id);
		if (temp.isPresent()) {
			temp.get().setTitle(title);
			temp.get().setDescription(desc);
			temp.get().setLanguage(lang);
			temp.get().setPages(pages);
			return bookRepo.save((temp.get()));
		} else {
			return null;
		}
	}
	
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
	}
	
	
}
