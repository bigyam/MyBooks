package com.mybooks.controller;
/**
import javax.inject.Inject;

import com.mybooks.beans.SearchBooksBean;
import com.mybooks.beans.SearchResultBean;
import com.mybooks.entities.SearchResult;

public class SearchBookController {

	@Inject
	SearchResultBean searchResultBean;
	
	@Inject
	SearchResult searchResult;
	
	public void submitQuery(String query) {
		this.searchResult.setTempResult(this.searchResult.searchQuery(query));
	}
}
**/