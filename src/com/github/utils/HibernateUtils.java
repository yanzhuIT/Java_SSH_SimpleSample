package com.github.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory sessionFactory;

	static {
		Configuration configuration = new Configuration();
		configuration.configure();

		sessionFactory = configuration.buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static Session getSessionObject() {
		return sessionFactory.getCurrentSession();
	}

	public static void main(String[] args) {

	}

}
