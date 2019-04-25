package com.mybooks.entities;

import java.util.List;

public class BookCollection {
	String name;
	List<BookEntry> bookEntries;
	
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
}
