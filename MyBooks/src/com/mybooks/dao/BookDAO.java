package com.mybooks.dao;

import org.hibernate.Session;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mybooks.entities.Book;

@Component
@Scope("singleton")
public class BookDAO {
	
	public void insert(Book book) throws Exception {
		//save the book to the database.
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		session.save(book);
		
		session.getTransaction().commit();
	}
}
