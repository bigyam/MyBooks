package com.mybooks.dao;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

import com.mybooks.entities.Book;
import com.mybooks.entities.BookCollection;

/**
 * Book collection data access object
 * 
 * @author Androo
 *
 */
@Component
@Scope("singleton")
public class BookCollectionDAO {
	
	/**
	 * Insert method for book collection
	 * 
	 * @param bookCollection
	 * @throws Exception
	 */
	public void insert(BookCollection bookCollection) throws Exception {
		//save the book to the database.
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		session.save(bookCollection);
		
		session.getTransaction().commit();
	}
	
	/**
	 * Update method for book collection
	 * 
	 * @param book
	 */
	public void update(BookCollection bookCollection) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		session.update(bookCollection);
		
		session.getTransaction().commit();
	}
	
	/**
	 * delete method for book collection
	 * 
	 * @param book
	 */
	public void delete(BookCollection bookCollection) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		session.delete(bookCollection);
		
		session.getTransaction().commit();
	}
	
	public List<BookCollection> getAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Query query = session.createQuery("from BookCollection");
		
		List<BookCollection> list = query.list();
		
		
		
		return list;		
	}
	
	public BookCollection getById(Integer value) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Query query = session.createQuery("from BookCollection where bookColId = :id");
		query.setParameter("id",  value);
		BookCollection result = (BookCollection) query.getSingleResult();
		
		
		
		return result;		
	}
}
