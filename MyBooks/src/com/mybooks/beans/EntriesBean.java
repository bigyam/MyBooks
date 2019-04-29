package com.mybooks.beans;

import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.mybooks.entities.Book;
import com.mybooks.entities.BookCollection;
import com.mybooks.entities.BookEntry;

/**
 * Bean for book collection creation
 * 
 * @author Androo
 *
 */
@Component
@RequestScope
public class EntriesBean {
	
	private int bookEntryId;
	private String comment;
	private Book book;
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

}
