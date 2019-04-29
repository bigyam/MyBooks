package com.mybooks.dao;

import org.hibernate.Session;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mybooks.entities.Book;

/**
 * Book Data Access Object
 * 
 * @author Androo
 *
 */
@Component
@Scope("singleton")
public class BookDAO {
	
	/**
	 * Insert method for book
	 * 
	 * @param book
	 */
	public void insert(Book book) {
		//save the book to the database.
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		session.save(book);
		
		session.getTransaction().commit();
	}
	
	/**
	 * Update method for book
	 * 
	 * @param book
	 */
	public void update(Book book) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		session.update(book);
		
		session.getTransaction().commit();
	}
	
	/**
	 * delete method for book
	 * 
	 * @param book
	 */
	public void delete(Book book) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		session.delete(book);
		
		session.getTransaction().commit();
	}
}
