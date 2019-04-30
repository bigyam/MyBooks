package com.mybooks.controller;

import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mybooks.beans.CollectionBean;
import com.mybooks.beans.EntriesBean;
import com.mybooks.dao.HibernateUtil;
import com.mybooks.entities.BookCollection;
import com.mybooks.service.BookCollectionService;
import com.mybooks.service.BookEntryService;

/**
 * Controller for book collections
 * 
 * @author Androo
 *
 */
@Component
@Scope("singleton")
public class CollectionController {

	@Inject
	BookCollectionService bookCollectionService;
	
	@Inject
	List<CollectionBean> collectionBeanList;
	
	@Inject
	List<EntriesBean> entryBeanList;
	
	@Inject
	BookEntryService bookEntryService;
	
	@Inject
	CollectionBean createCollectionBean;
	
	public List<CollectionBean> getBookCollections(){
		this.collectionBeanList = this.bookCollectionService.fetchAll(); 
		
		return collectionBeanList;
	}

	/**
	 * @return the entryBeanList
	 */
	public List<EntriesBean> getEntryBeanList() {
		return entryBeanList;
	}

	/**
	 * @param entryBeanList the entryBeanList to set
	 */
	public void setEntryBeanList(BookCollection bookCollection) {
		this.entryBeanList = this.bookEntryService.fetchAllByEntity(bookCollection);
	}
	
	/**
	 * Get the entries for a certain collection
	 * 
	 * @return
	 */
	public String collectionEntries() {
		FacesContext fc = FacesContext.getCurrentInstance();
		Map<String,String> params = fc.getExternalContext().getRequestParameterMap();
		String data = params.get("id");
				
		this.setEntryBeanList(this.bookCollectionService.fetchEntityById(Integer.valueOf(data)));
		
		return "bookList02.xhtml";		
	}
	
	/**
	 * 
	 * 
	 */
	public void createCollection() {
		System.out.println("######################## reaches here");
		BookCollection newBookCollection = new BookCollection();
		newBookCollection.setName(this.createCollectionBean.getName());
		newBookCollection.setDescription(this.createCollectionBean.getDescription());
		try {
			this.bookCollectionService.save(newBookCollection);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	/**
	 * @return the createCollectionBean
	 */
	public CollectionBean getCreateCollectionBean() {
		return createCollectionBean;
	}

	/**
	 * @param createCollectionBean the createCollectionBean to set
	 */
	public void setCreateCollectionBean(CollectionBean createCollectionBean) {
		this.createCollectionBean = createCollectionBean;
	}
}