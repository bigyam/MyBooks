package com.mybooks.dao;

import org.hibernate.Session;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mybooks.entities.BookCollection;

@Component
@Scope("singleton")
public class BookCollectionDAO {
	
	public void insert(BookCollection bookCollection) throws Exception {
		//save the book to the database.
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		session.save(bookCollection);
		
		session.getTransaction().commit();
	}
}
