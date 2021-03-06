package com.mybooks.entities;

import javax.persistence.Entity;

@Entity
public class Book {
	
	private int bookId;
	private String title;
	private String author;
	private String smallImageURL;
	private String imageURL;
	private String rating;
	private String ratingCount;
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the smallImageURL
	 */
	public String getSmallImageURL() {
		return smallImageURL;
	}
	/**
	 * @param smallImageURL the smallImageURL to set
	 */
	public void setSmallImageURL(String smallImageURL) {
		this.smallImageURL = smallImageURL;
	}
	/**
	 * @return the imageURL
	 */
	public String getImageURL() {
		return imageURL;
	}
	/**
	 * @param imageURL the imageURL to set
	 */
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	/**
	 * @return the rating
	 */
	public String getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(String rating) {
		this.rating = rating;
	}
	/**
	 * @return the ratingCount
	 */
	public String getRatingCount() {
		return ratingCount;
	}
	/**
	 * @param ratingCount the ratingCount to set
	 */
	public void setRatingCount(String ratingCount) {
		this.ratingCount = ratingCount;
	}
	/**
	 * @return the bookId
	 */
	public int getBookId() {
		return bookId;
	}
	/**
	 * @param bookId the bookId to set
	 */
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
}
