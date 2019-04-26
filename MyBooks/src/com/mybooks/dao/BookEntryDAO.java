package com.mybooks.dao;

import org.hibernate.Session;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.mybooks.entities.BookEntry;

@Component
@Scope("singleton")
public class BookEntryDAO {
	
	public void insert(BookEntry bookEntry) throws Exception {
		//save the book to the database.
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		session.save(bookEntry);
		
		session.getTransaction().commit();
	}
}
