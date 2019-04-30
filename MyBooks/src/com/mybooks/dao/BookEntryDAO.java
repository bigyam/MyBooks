package com.mybooks.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mybooks.entities.Book;
import com.mybooks.entities.BookCollection;
import com.mybooks.entities.BookEntry;

/**
 * Book entry data access object
 * 
 * @author Androo
 *
 */
@Component
@Scope("singleton")
public class BookEntryDAO {
	
	/**
	 * Insert method for book entry
	 * 
	 * @param bookEntry
	 * @throws Exception
	 */
	public void insert(BookEntry bookEntry) throws Exception {
		//save the book to the database.
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		session.save(bookEntry);
		
		session.getTransaction().commit();
	}
	
	/**
	 * Update method for book entry
	 * 
	 * @param book
	 */
	public void update(BookEntry bookEntry) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		session.update(bookEntry);
		
		session.getTransaction().commit();
	}
	
	/**
	 * delete method for book entry
	 * 
	 * @param book
	 */
	public void delete(BookEntry bookEntry) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		session.delete(bookEntry);
		
		session.getTransaction().commit();
	}
	
	public List<BookEntry> getAllByColId(BookCollection bookCollection) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Query<BookEntry> query = session.createQuery("from BookEntry where bookCollection = :id");
		query.setParameter("id", bookCollection);
		List<BookEntry> result = query.list();
		
		
		return result;		
	}
}
