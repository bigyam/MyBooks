package com.mybooks.entities;

import java.util.List;
import javax.persistence.Entity;


@Entity
public class BookCollection {
	
	private int bookColId;
	private String name;
	private List<BookEntry> bookEntries;
	private String description;
	
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
	 * @return the bookEntries
	 */
	public List<BookEntry> getBookEntries() {
		return bookEntries;
	}
	/**
	 * @param bookEntries the bookEntries to set
	 */
	public void setBookEntries(List<BookEntry> bookEntries) {
		this.bookEntries = bookEntries;
	}
	/**
	 * @return the bookColId
	 */
	public int getBookColId() {
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
}
