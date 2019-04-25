package com.mybooks.entities;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.w3c.dom.*;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import javax.xml.parsers.*;
import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Search Result Entity.  API connection to good reads
 *  
 * @author Androo
 *
 */
@Component
@Scope("singleton")
public class SearchResult {
	
	private List<Book> book = new LinkedList<Book>();
	private final String KEY = "YAGi6i0TA3AKTZKaeS2A3A";
	
	/**
	 * @return the book
	 */
	public List<Book> getBook() {
		return book;
	}

	/**
	 * @param book the book to set
	 */
	public void setBook(List<Book> book) {
		this.book = book;
	}
	
	/**
	 * execute get for goodreads via jersey
	 * 
	 * @return
	 */
	public List<Book> searchQuery(String query) {
		Client client = Client.create();
		
		WebResource webResource = client.resource("https://www.goodreads.com/search/index.xml");
		
		String input = "{\"q\":\"" + query + "\",\"key\":\"" + this.KEY + "\",\"search[field]\":\"title\"}";
		
		ClientResponse response = webResource.type("application/json").post(ClientResponse.class, input);
		
		if(response.getStatus() != 200) {
			String res = "failed: http code : " + Integer.toString(response.getStatus()) + " - Error Entity: " + response.getEntity(String.class); 
			//return res; throw exception here
		}
		this.retrieveResult(response.getEntityInputStream());
		//String result = "Output from Server .... Title: " + this.getBook().get(0).getTitle();
		return this.getBook();
	}

	/**
	 * Parses XML input and stores data in a book field LinkedList<book>
	 * 
	 * @param input InputStream for xml to be parsed
	 */
	private void retrieveResult(InputStream input) {
		
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	        Document doc = dBuilder.parse(input);
	        doc.getDocumentElement().normalize();
	        
	         NodeList bookList = doc.getElementsByTagName("work");
	         
	         for (int i = 0; i < bookList.getLength(); i++) {
	        	Node nNode = bookList.item(i); 
	        	if(nNode.getNodeType() == Node.ELEMENT_NODE) { 
	        		Element eElement = (Element) nNode;
	        		Book bookResult = new Book();
	        		NodeList nodeList = eElement.getElementsByTagName("best_book");
	        		
	        		if (nodeList != null && nodeList.getLength() > 0) {
	        			for(int j = 0; j < nodeList.item(0).getChildNodes().getLength(); j++) {
	        				if (nodeList.item(0).getChildNodes().item(j).getNodeName().equals("title")) {
	        					bookResult.setTitle(nodeList.item(0).getChildNodes().item(j).getTextContent());
	        				}
	        				if (nodeList.item(0).getChildNodes().item(j).getNodeName().equals("author")) {
	        					bookResult.setAuthor(nodeList.item(0).getChildNodes().item(j).getTextContent());
	        				}
	        				if (nodeList.item(0).getChildNodes().item(j).getNodeName().equals("image_url")) {
	        					bookResult.setImageURL(nodeList.item(0).getChildNodes().item(j).getTextContent());
	        				}
	        				if (nodeList.item(0).getChildNodes().item(j).getNodeName().equals("small_image_url")) {
	        					bookResult.setSmallImageURL(nodeList.item(0).getChildNodes().item(j).getTextContent());
	        				}
	        			}
	        		}	        		
	        		nodeList = eElement.getElementsByTagName("ratings_count");
	        		bookResult.setRatingCount(nodeList.item(0).getChildNodes().item(0).getNodeValue());
	        		
	        		nodeList = eElement.getElementsByTagName("average_rating");
	        		bookResult.setRating(nodeList.item(0).getChildNodes().item(0).getNodeValue());
	        		
	        		this.book.add(bookResult);
	        	}
	         }
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
