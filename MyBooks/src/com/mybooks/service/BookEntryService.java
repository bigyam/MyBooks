package com.mybooks.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mybooks.dao.BookEntryDAO;
import com.mybooks.entities.Book;
import com.mybooks.entities.BookEntry;

@Component
@Scope("singleton")
public class BookEntryService {
	
	@Inject
	private BookEntryDAO bookEntryDAO;
	private List<Book> allBooks;
	
	public void save(BookEntry bookEntry) throws Exception {
		if (bookEntry == null) {
			throw new Exception ("Book Collection title required");
		}
		
		bookEntryDAO.insert(bookEntry);
	}
}
