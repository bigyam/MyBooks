package com.mybooks.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mybooks.beans.CollectionBean;
import com.mybooks.beans.EntriesBean;
import com.mybooks.dao.BookEntryDAO;
import com.mybooks.entities.Book;
import com.mybooks.entities.BookCollection;
import com.mybooks.entities.BookEntry;

/**
 *Book entry service layer
 *
 */
@Component
@Scope("singleton")
public class BookEntryService {
	
	@Inject
	private BookEntryDAO bookEntryDAO;
	private List<Book> allBooks;
	
	/**
	 * Insert and save into book entry database
	 * 
	 * @param bookEntry
	 * @throws Exception
	 */
	public void save(BookEntry bookEntry) throws Exception {
		if (bookEntry == null) {
			throw new Exception ("Book Collection title required");
		}
		
		bookEntryDAO.insert(bookEntry);
	}
	
	public List<EntriesBean> fetchAllByEntity(BookCollection bookCollection) {
		List<BookEntry> bookEntry = this.bookEntryDAO.getAllByColId(bookCollection);
		List<EntriesBean> result = new ArrayList<EntriesBean>();
		
		for (BookEntry entries : bookEntry) {
			EntriesBean newBean = new EntriesBean();
			newBean.setBook(entries.getBook());
			newBean.setComment(entries.getComment());
			newBean.setBookEntryId(entries.getBookEntryId());
			result.add(newBean);			
		}
		
		return result;
	}
}
