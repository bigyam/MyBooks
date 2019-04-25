package com.mybooks.beans;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

/**
 * Bean for book collection creation
 * 
 * @author Androo
 *
 */
@Component
@RequestScope
public class CreateCollectionBean {
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
