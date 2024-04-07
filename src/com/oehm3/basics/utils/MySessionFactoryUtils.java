package com.oehm3.basics.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MySessionFactoryUtils {

	private static SessionFactory sessionFactory=null;
	
	private MySessionFactoryUtils() {
		
	}
	
	public static SessionFactory gerSessionFactory() {
		if(sessionFactory==null) 
			sessionFactory =new Configuration().configure().buildSessionFactory();
		return sessionFactory;
	}
}
