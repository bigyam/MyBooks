package com.mybooks.beans;

import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.mybooks.entities.BookEntry;

/**
 * Bean for book collection creation
 * 
 * @author Androo
 *
 */
@Component
@RequestScope
public class CollectionBean {
	
	private int bookColId;
	private String description;
	private String name;
	private List<BookEntry> entries;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the bookColId
	 */
	public int getBookColId() {
		System.out.println("reaches get book colID" + Integer.valueOf(bookColId));
		return bookColId;
	}

	/**
	 * @param bookColId the bookColId to set
	 */
	public void setBookColId(int bookColId) {
		this.bookColId = bookColId;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the entries
	 */
	public List<BookEntry> getEntries() {
		return entries;
	}

	/**
	 * @param entries the entries to set
	 */
	public void setEntries(List<BookEntry> entries) {
		this.entries = entries;
	}
}
