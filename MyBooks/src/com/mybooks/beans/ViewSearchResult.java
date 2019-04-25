package com.mybooks.beans;

import java.util.List;

import javax.annotation.PostConstruct;

import javax.inject.Inject;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.mybooks.entities.Book;
import com.mybooks.service.SearchBooksService;

/**
 * Unused for now.  Need to modify this to be included in app if we want to change idempotents
 * 
 * @author Androo
 *
 */
@Component
@RequestScope
public class ViewSearchResult {
	
	private String query;
	private List<Book> books;
	private String tempResults;
	
	@Inject
	private SearchBooksService searchBooksService;
	
	@PostConstruct
	public void init() {
		this.setTempResults(this.searchBooksService.find(this.query));
	}

	/**
	 * @return the books
	 */
	public List<Book> getBooks() {
		return books;
	}

	/**
	 * @param books the books to set
	 */
	public void setBooks(List<Book> books) {
		this.books = books;
	}

	/**
	 * @return the tempResults
	 */
	public String getTempResults() {
		return tempResults;
	}

	/**
	 * @param tempResults the tempResults to set
	 */
	public void setTempResults(String tempResults) {
		this.tempResults = tempResults;
	}

	/**
	 * @return the query
	 */
	public String getQuery() {
		return query;
	}

	/**
	 * @param query the query to set
	 */
	public void setQuery(String query) {
		this.query = query;
	}
}