package com.mybooks.entities;

import java.util.Date;

public class Book {
	
	String title;
	String author;
	String smallImageURL;
	String imageURL;
	Date datePublished;
	String rating;
	String ratingCount;
	
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
	 * @return the datePublished
	 */
	public Date getDatePublished() {
		return datePublished;
	}
	/**
	 * @param datePublished the datePublished to set
	 */
	public void setDatePublished(Date datePublished) {
		this.datePublished = datePublished;
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
}
