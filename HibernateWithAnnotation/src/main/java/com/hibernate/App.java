package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	Configuration cfg2=cfg.configure("hibernate.cfg.xml");
	SessionFactory factory=cfg2.buildSessionFactory();
	Session session=factory.openSession();
	Transaction transaction=session.beginTransaction();
	
	
	Employee e1=session.get(Employee.class, 1);
	Employee emp=new Employee();
	emp.setName("akash");
	emp.setDept("cardio");
	emp.setSalary(50000);
	
	session.save(emp);

	transaction.commit();
	//Session session=factory.openSession();
	Employee s2=session.get(Employee.class, 1);
	// System.out.println(e2);
	session.close();
	//

//session.close();
//factory.close();
//System.out.println("recored  inserted successfully");
	
}
}
