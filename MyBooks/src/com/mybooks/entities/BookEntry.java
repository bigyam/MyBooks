package com.mybooks.entities;

public class BookEntry {

	private int bookEntryId;
	private Book book;
	private String comment;
	
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
}
