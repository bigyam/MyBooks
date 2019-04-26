package com.mybooks.controller;

import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mybooks.beans.SearchBookBean;
import com.mybooks.entities.Book;
import com.mybooks.entities.BookCollection;
import com.mybooks.entities.BookEntry;
import com.mybooks.service.BookCollectionService;
import com.mybooks.service.BookEntryService;
import com.mybooks.service.BookService;
import com.mybooks.service.SearchBooksService;

/**
 * Controller for search function
 * 
 * @author Androo
 *
 */
@Component
@Scope("singleton")
public class SearchBookController {

	@Inject
	SearchBookBean searchBookBean;
	
	@Inject
	SearchBooksService searchBooksService;
	
	//inject this for test remove later
	@Inject
	BookEntryService bookEntryService;
	
	@Inject
	BookCollectionService bookCollectionService;
	
	@Inject
	BookService bookService;
	
	/**
	 * Submits query to search for books
	 * 
	 * @return
	 */
	public String submit() {
		this.searchBookBean.setBook((this.searchBooksService.find(this.searchBookBean.getQuery())));
		
		//this is for test remove later
		Book newBook = new Book();
		newBook.setTitle("test insert book");
		newBook.setAuthor("testing");
		newBook.setImageURL("www");
		newBook.setSmallImageURL("www2");
		newBook.setRating("4");
		newBook.setRatingCount("100");
		
		BookCollection newCollection = new BookCollection();
		newCollection.setName("test insert book");
		newCollection.setDescription("so descriptive");
		
		BookEntry newEntry = new BookEntry();
		try {
			bookService.save(newBook);
			bookCollectionService.save(newCollection);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		newEntry.setBook(newBook);
		newEntry.setBookCollection(newCollection);
		newEntry.setComment("this is a comment");
		try {
			bookEntryService.save(newEntry);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "search02.xhtml";
	}
}