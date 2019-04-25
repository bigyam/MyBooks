package com.mybooks.service;

import java.util.List;

import javax.inject.Inject;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mybooks.entities.Book;
import com.mybooks.entities.SearchResult;

/**
 * Service class for search function
 * 
 * @author Androo
 *
 */
@Component
@Scope("singleton")
public class SearchBooksService {
	
	@Inject
	private SearchResult searchResults;
	
	//private String result;
	
	/**
	 * Search for book based on query
	 * 
	 * @param query
	 * @return
	 */
	public List<Book> find(String query) {
	//	this.result = this.searchResults.searchQuery(query); 
		return this.searchResults.searchQuery(query); 
	}
	
}