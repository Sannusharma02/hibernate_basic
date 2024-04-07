package com.oehm3.basics.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.oehm3.basics.dto.Employee;
import com.oehm3.basics.utils.MySessionFactoryUtils;

public class EmployeeDAO {

	public void saveEmployee(Employee employee) {
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Employee.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session =sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(employee);
		transaction.commit();
	}

	public Employee getEmployee(int id) {
//		Configuration configuration = new Configuration();
//		configuration.configure();
////		configuration.addAnnotatedClass(Employee.class);
//		SessionFactory sessionFactory = configuration.buildSessionFactory();
//		Session session =sessionFactory.openSession();
////		Transaction transaction = session.beginTransaction();
//		Employee employee = session.get(Employee.class, id);
//		return employee;
		
		SessionFactory sessionFactory = MySessionFactoryUtils.gerSessionFactory();
		Session session = sessionFactory.openSession();
		Employee employee = session.get(Employee.class,id);
		return employee;
	}
	
}
