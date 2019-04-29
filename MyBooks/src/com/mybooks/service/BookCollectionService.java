package com.mybooks.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mybooks.beans.CollectionBean;
import com.mybooks.dao.BookCollectionDAO;
import com.mybooks.entities.Book;
import com.mybooks.entities.BookCollection;
import com.mybooks.entities.BookEntry;

/**
 * Service layer for book collection
 * 
 * @author Androo
 *
 */
@Component
@Scope("singleton")
public class BookCollectionService {
	
	@Inject
	private BookCollectionDAO bookCollectionDAO;
	private List<Book> allBooks;
	
	/**
	 * Insert and save book collection into database
	 * 
	 * @param bookCollection
	 * @throws Exception
	 */
	public void save(BookCollection bookCollection) throws Exception {
		if (bookCollection.getName() == null) {
			throw new Exception ("Book Collection title required");
		}
		
		bookCollectionDAO.insert(bookCollection);
	}
	
	public List<CollectionBean> fetchAll() {
		List<BookCollection> bookCollection = this.bookCollectionDAO.getAll();
		List<CollectionBean> result = new ArrayList<CollectionBean>();
		
		for (BookCollection collection : bookCollection) {
			CollectionBean newBean = new CollectionBean();
			newBean.setBookColId(collection.getBookColId());
			newBean.setDescription(collection.getDescription());
			List<BookEntry> temp = new ArrayList<BookEntry>();
			temp.addAll(collection.getBookEntries());
			newBean.setEntries(temp);
			newBean.setName(collection.getName());
			result.add(newBean);			
		}
		
		return result;
	}
	
	public CollectionBean fetchBeanById(int value) {
		CollectionBean result = new CollectionBean();
		BookCollection bookCol = this.bookCollectionDAO.getById(value); 
		
		result.setBookColId(bookCol.getBookColId());
		result.setDescription(bookCol.getDescription());
		
		List<BookEntry> temp = new ArrayList<BookEntry>();
		temp.addAll(bookCol.getBookEntries());
		
		result.setEntries(temp);
		result.setName(bookCol.getName());
		
		return result;
	}
	
	public BookCollection fetchEntityById(int value) {
		return this.bookCollectionDAO.getById(value);
	}
	
}
