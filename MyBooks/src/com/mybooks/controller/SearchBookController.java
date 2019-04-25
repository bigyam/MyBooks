package com.mybooks.controller;

import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mybooks.beans.SearchBookBean;
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
	
	/**
	 * Submits query to search for books
	 * 
	 * @return
	 */
	public String submit() {
		this.searchBookBean.setBook((this.searchBooksService.find(this.searchBookBean.getQuery())));
		return "search02.xhtml";
	}
}