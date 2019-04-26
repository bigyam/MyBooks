package com.mybooks.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mybooks.dao.BookCollectionDAO;
import com.mybooks.entities.Book;
import com.mybooks.entities.BookCollection;

@Component
@Scope("singleton")
public class BookCollectionService {
	
	@Inject
	private BookCollectionDAO bookCollectionDAO;
	private List<Book> allBooks;
	
	public void save(BookCollection bookCollection) throws Exception {
		if (bookCollection.getName() == null) {
			throw new Exception ("Book Collection title required");
		}
		
		bookCollectionDAO.insert(bookCollection);
	}
}
