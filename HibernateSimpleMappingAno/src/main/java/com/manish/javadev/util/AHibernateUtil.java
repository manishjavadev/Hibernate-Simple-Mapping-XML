package com.manish.javadev.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class AHibernateUtil {
	private static SessionFactory factory;
	static {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg = (AnnotationConfiguration) cfg.configure();
		factory = cfg.buildSessionFactory();
	}

	public static SessionFactory getFactory() {
		return factory;
	}
}