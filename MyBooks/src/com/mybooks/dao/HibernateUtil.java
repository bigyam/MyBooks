/**
 * 
 */
package com.mybooks.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Androo
 *
 */
public class HibernateUtil {
	
		private static final SessionFactory sessionFactory = buildSessionFactory();
		
		private static SessionFactory buildSessionFactory() {
			try {
				//Create the SessionFactory from hibernate.cfg.xml
				return new Configuration().configure().buildSessionFactory();
			} catch (Throwable ex) {
				//Log exception, prevent it being swallowed
				System.err.println("Initial SessionFactory creation failed." + ex);
				throw new ExceptionInInitializerError(ex);
			}
		}
		
		public static SessionFactory getSessionFactory() {
			return sessionFactory;
		}
		
		public static void shutdown() {
			//close cache and con pool
			getSessionFactory().close();
		}
}
