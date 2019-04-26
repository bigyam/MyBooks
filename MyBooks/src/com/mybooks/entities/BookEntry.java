package com.mybooks.entities;

import javax.persistence.Entity;

@Entity
public class BookEntry {

	private int bookEntryId;
	private String comment;
	private Book book;
	private BookCollection bookCollection;
	
	/**
	 * @return the book
	 */
	public Book getBook() {
		return book;
	}
	/**
	 * @param book the book to set
	 */
	public void setBook(Book book) {
		this.book = book;
	}
	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	/**
	 * @return the bookEntryId
	 */
	public int getBookEntryId() {
		return bookEntryId;
	}
	/**
	 * @param bookEntryId the bookEntryId to set
	 */
	public void setBookEntryId(int bookEntryId) {
		this.bookEntryId = bookEntryId;
	}
	/**
	 * @return the bookCollectionId
	 */
	public BookCollection getBookCollection() {
		return bookCollection;
	}
	/**
	 * @param bookCollectionId the bookCollectionId to set
	 */
	public void setBookCollection(BookCollection bookCollectionId) {
		this.bookCollection = bookCollectionId;
	}
}
