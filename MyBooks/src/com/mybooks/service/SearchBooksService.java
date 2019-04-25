package com.mybooks.service;

import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import com.mybooks.entities.SearchResult;

@Component
@Scope("singleton")
public class SearchBooksService {
	
	@Inject
	private SearchResult searchResults;
	
	private String result;
	
	/**
	 * 
	 * @param query
	 * @return
	 */
	public String find(String query) {
		this.result = this.searchResults.searchQuery(query); 
		return result; 
	}
	
}