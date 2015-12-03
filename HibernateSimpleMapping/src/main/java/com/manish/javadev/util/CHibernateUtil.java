package com.manish.javadev.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CHibernateUtil {
	private static SessionFactory factory;
	static {
		Configuration cfg = new Configuration();
		cfg = cfg.configure();
		factory = cfg.buildSessionFactory();
	}

	public static SessionFactory getFactory() {
		return factory;
	}
}