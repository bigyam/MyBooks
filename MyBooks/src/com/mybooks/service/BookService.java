package com.mybooks.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mybooks.dao.BookDAO;
import com.mybooks.entities.Book;

/**
 * Book service layer
 * 
 * @author Androo
 *
 */
@Component
@Scope("singleton")
public class BookService {
	
	@Inject
	private BookDAO bookDAO;
	private List<Book> allBooks;
	
	/**
	 * Insert and save into book database
	 * @param book
	 * @throws Exception
	 */
	public void save(Book book) throws Exception {
		if (book.getTitle() == null || book.getAuthor() == null) {
			throw new Exception ("Book title and author required");
		}
		
		bookDAO.insert(book);
	}
}
