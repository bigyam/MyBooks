package com.mybooks.beans;

import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import com.mybooks.entities.Book;

/**
 * Bean to hold search values
 * 
 * @author Androo
 *
 */
@Component
@RequestScope
public class SearchBookBean {

	private List<Book> book = new LinkedList<Book>();
	private String query;
	private String tempResults;
	
	/**
	 * @return the book
	 */
	public List<Book> getBook() {
		return book;
	}

	/**
	 * @param book the book to set
	 */
	public void setBook(List<Book> book) {
		this.book = book;
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
}
